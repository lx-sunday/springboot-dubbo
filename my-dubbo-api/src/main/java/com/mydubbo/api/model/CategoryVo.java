package com.mydubbo.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分类模型
 * @author lx
 *
 */
public class CategoryVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2959074567929575528L;

	private Long id;
	
	private String name;
	
	private List<CategoryVo> childList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CategoryVo> getChildList() {
		if(childList==null){
			childList=new ArrayList<>();
		}
		return childList;
	}

	public void setChildList(List<CategoryVo> childList) {
		this.childList = childList;
	}
}
