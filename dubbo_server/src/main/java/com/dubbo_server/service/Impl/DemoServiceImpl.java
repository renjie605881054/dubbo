package com.dubbo_server.service.Impl;

import com.dubbo_server.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String login(String userId) {
		return "server:userId = " + userId;
	}

}
