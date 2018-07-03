package com.sinosoft.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.entity.dto.JDPSlideShow;
import com.sinosoft.index.service.SlideShowService;
//轮播图
@RequestMapping("/slideShow")
@RestController
public class SlideShowController {
	@Autowired
	SlideShowService slideShowService;
	@RequestMapping("/queryAll")
	public void queryAll() {
		List<JDPSlideShow> jdpSlideShow = slideShowService.queryAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jdpSlideShow", jdpSlideShow);
	}
}
