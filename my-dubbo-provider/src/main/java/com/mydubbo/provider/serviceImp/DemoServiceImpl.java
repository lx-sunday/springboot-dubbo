package com.mydubbo.provider.serviceImp;


import org.springframework.stereotype.Service;

import com.mydubbo.api.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "say hello to "+name;
	}


}
