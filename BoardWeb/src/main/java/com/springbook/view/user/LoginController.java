package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {
    @RequestMapping(value="/login.do", method=RequestMethod.GET)
    public String loginView(UserVO vo) {
    	System.out.println("�α��� ȭ������ �̵�");
    	vo.setId("test");
    	vo.setPassword("test1234");
    	return "login.jsp";
    }
    
    @RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("���̵�� �ݵ�� �Է��ؾ� �մϴ�.");
		}
		UserVO user = userDAO.getUser(vo);
    	if (user != null) {
    		System.out.println("111" + user.getName());
    		session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}