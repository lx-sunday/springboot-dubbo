package com.mydubbo.provider.serviceImp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydubbo.api.model.CategoryVo;
import com.mydubbo.api.service.CategoryService;
import com.mydubbo.provider.dao.CategoryDao;
import com.mydubbo.provider.entity.Category;

@Service("categoryService")
@Transactional(rollbackFor=Exception.class)
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao dao;

	@Override
	public List<CategoryVo> findList() {
		// TODO Auto-generated method stub
		List<CategoryVo> voList=new ArrayList<>();
		List<Category> list = this.dao.findAll();
		if(list!=null && list.size()>0){
			Iterator<Category> ite = list.iterator();
			while(ite.hasNext()){
				Category next = ite.next();
				if(next.getChildList()!=null && next.getChildList().size()>0){
					CategoryVo parent=new CategoryVo();
					List<CategoryVo> childVoList = parent.getChildList();
					parent.setId(next.getId());
					parent.setName(next.getName());
					List<Category> childList = next.getChildList();
					for(Category child :childList){
						 CategoryVo childVo=new CategoryVo();
						 childVo.setId(child.getId());
						 childVo.setName(child.getName());
						 childVoList.add(childVo);
					}
					voList.add(parent);
				}
			}
		}
		return voList;
	}
}
