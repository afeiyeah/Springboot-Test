package com.example.test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.model.bean.User;
import com.example.test.model.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="addUser2",method={RequestMethod.GET,RequestMethod.POST})
	public String addUser(User u,MultipartFile upload,HttpServletRequest request){
		//获取原始文件名
		String oldname=upload.getOriginalFilename();
		//重命名
		String newname=System.currentTimeMillis()+oldname.substring(oldname.indexOf('.'));
		//获取上传地址
		String path=request.getServletContext().getRealPath("upload");
		File file=new File(path,newname);
		try {
			upload.transferTo(file);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userService.addUser(u);
		return "addUser2.jsp";
	}
}
