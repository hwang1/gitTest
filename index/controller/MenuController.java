package com.sinosoft.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.entity.dto.JDPMenu;
import com.sinosoft.index.service.MenuService;

//首页菜单
@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	MenuService menuService;
	@RequestMapping("/queryAll")
	public void queryAllMenu(){
		List<JDPMenu> jdpAllMenu = menuService.queryAllMenu();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jdpAllMenu", jdpAllMenu);
	}
}
