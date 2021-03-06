package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dao.ScRgSkDao;
import dao.StaffDao;
import dto.Religion;
import dto.School;
import dto.Skill;
import dto.Staff;
import interfacepack.Action;

public class StaffAddFormAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("	----- StaffAddFormAction.java start 사원 등록 폼 클래스시작 -----");
		request.setCharacterEncoding("euc-kr");
		String path = null;
		
		//종교 학력 기술 가져오기
		
		ScRgSkDao dao = new ScRgSkDao();
		
		ArrayList<Religion> relList = dao.religionSelect();
		ArrayList<School> scList = dao.schoolSelect();
		ArrayList<Skill> skList = dao.skillSelect();
		
		
		request.setAttribute("relList", relList);
		request.setAttribute("scList", scList);
		request.setAttribute("skList", skList);
		
		
		path ="/WEB-INF/jsp/staff/staffAddForm.jsp";
		
		System.out.println("	----- StaffAddFormAction.java start 사원 등록 폼 클래스 종료 -----");
		return path;
		

	}

}
