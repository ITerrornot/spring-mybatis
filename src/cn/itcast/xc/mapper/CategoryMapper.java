package cn.itcast.xc.mapper;

import java.util.List;

import cn.itcast.xc.pojo.Category;

/*
 * mapper�࣬��Ҫ��mapper.xml���Ӧ
 */
public interface CategoryMapper {
	public int add(Category category);
	
	public void delete(int id);
	
	public  int update(Category category);
	
	public Category get(int id);
	
	public List<Category> list();
}
