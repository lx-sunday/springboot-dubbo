package com.test.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mydubbo.api.model.CategoryVo;
import com.mydubbo.api.service.CategoryService;
import com.mydubbo.api.service.DemoService;
import com.mydubbo.provider.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class DemoApplicationTests {
	
	@Autowired
	private DemoService demoService;
	
	@Autowired
	private CategoryService categoryService;

	@Test
	public void testDemo() {
		System.out.println("come in.....");
		String content = this.demoService.sayHello("liaoxue");
		System.out.println("......"+content);
		List<CategoryVo> findList = this.categoryService.findList();
		System.out.println(findList.toString());
	}
}