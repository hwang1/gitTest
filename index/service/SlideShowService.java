package com.sinosoft.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.entity.dao.JDPIndexMapper;
import com.sinosoft.entity.dto.JDPSlideShow;

@Service
public class SlideShowService {
	@Autowired
	JDPIndexMapper jdpIndexMapper;
	public List<JDPSlideShow> queryAll(){
		List<JDPSlideShow> jdpSlideShow = jdpIndexMapper.queryAll();
		return jdpSlideShow;
	}
}
