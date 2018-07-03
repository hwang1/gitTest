package com.sinosoft.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.entity.dto.JDPPublicMessage;
import com.sinosoft.entity.dto.JDPUserMessage;
import com.sinosoft.index.service.MessageService;
//消息
@RestController
@RequestMapping("/message")
public class MessageController {
	@Autowired
	MessageService messageService;
	//查询所有用户消息
	@RequestMapping("/queryAllUser")
	public void queryAllUserMessage() {
		List<JDPUserMessage> jdpAllUserMessage = messageService.queryAllUserMessage();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jdpAllUserMessage", jdpAllUserMessage);
	}
	//查询所有公共消息
	@RequestMapping("/queryAllPublic")
	public void queryAllPublicMessage() {
		List<JDPPublicMessage> jdpAllPublicMessage = messageService.queryAllPublicMessage();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jdpAllPublicMessage", jdpAllPublicMessage);
	}
	
	//查询前10条用户消息（也可以考虑按某个时间段之前来查询）（避免一次查询过多导致卡顿）
	//查询前10条公共消息
}
