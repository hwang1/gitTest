package com.sinosoft.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.entity.dao.JDPIndexMapper;
import com.sinosoft.entity.dto.JDPPublicMessage;
import com.sinosoft.entity.dto.JDPUserMessage;

@Service
public class MessageService {
	@Autowired
	JDPIndexMapper jdpIndexMapper;
	public List<JDPUserMessage> queryAllUserMessage(){
		List<JDPUserMessage> jdpUserMessage = jdpIndexMapper.queryAllUserMessage();
		return jdpUserMessage;
	}
	public List<JDPPublicMessage> queryAllPublicMessage(){
		List<JDPPublicMessage> jdpPublicMessage = jdpIndexMapper.queryAllPublicMessage();
		return jdpPublicMessage;
	}
}
