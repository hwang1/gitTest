package com.sinosoft.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.entity.dto.JDPHotProduct;
import com.sinosoft.index.service.HotProductService;

//热门产品
@RestController
@RequestMapping("/hotProduct")
public class HotProductController {
	@Autowired
	HotProductService hotProductService;
	@RequestMapping("/queryAll")
	public void queryAllHotProduct() {
		List<JDPHotProduct> jdpAllHotProduct = hotProductService.queryAllHotProduct();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jdpAllHotProduct", jdpAllHotProduct);
	}
}
