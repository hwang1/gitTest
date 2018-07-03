package com.sinosoft.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sinosoft.entity.dao.JDPIndexMapper;
import com.sinosoft.entity.dto.JDPMenu;

public class MenuService {
	@Autowired
	JDPIndexMapper jdpIndexMapper;
	public List<JDPMenu> queryAllMenu(){
		List<JDPMenu> jdpMenu = jdpIndexMapper.queryAllMenu();
		return jdpMenu;
	}
}
