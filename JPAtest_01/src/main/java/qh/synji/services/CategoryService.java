package qh.synji.services;

import java.util.List;

import qh.synji.dao.ICategoryDao;
import qh.synji.dao.CategoryDao;
import qh.synji.entity.Category;

public class CategoryService implements ICategoryService {

	public ICategoryDao cateDao = new CategoryDao();

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> findAll(int page, int pagesize) {
		// TODO Auto-generated method stub
		return cateDao.findAll(page, pagesize);
	}

	@Override
	public List<Category> findByCategoryname(String catname) {
		// TODO Auto-generated method stub
		return cateDao.findByCategoryname(catname);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cateDao.findAll();
	}

	@Override
	public Category findById(int cateid) {
		// TODO Auto-generated method stub
		return cateDao.findById(cateid);
	}

	@Override
	public void delete(int cateid) throws Exception {
		cateDao.delete(cateid);
	}

	@Override
	public void update(Category category) {
		cateDao.update(category);
	}

	@Override
	public void insert(Category category) {
		cateDao.insert(category);
	}
	
}
