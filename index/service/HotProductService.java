package com.sinosoft.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sinosoft.entity.dao.JDPIndexMapper;
import com.sinosoft.entity.dto.JDPHotProduct;

public class HotProductService {
	@Autowired
	JDPIndexMapper jdpIndexMapper;
	public List<JDPHotProduct> queryAllHotProduct(){
		List<JDPHotProduct> jdpHotProduct = jdpIndexMapper.queryAllHotProduct();
		return jdpHotProduct;
	}
}
