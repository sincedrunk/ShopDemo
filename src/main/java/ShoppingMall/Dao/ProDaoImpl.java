package ShoppingMall.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShoppingMall.Dao.mapper.ProMapper;
import ShoppingMall.entity.Pro;

@Repository
public class ProDaoImpl implements ProDao {
	@Autowired
	private ProMapper proMapper;

	@Override
	public void createPro(Pro pro, String sortId) {
		proMapper.createPro(pro, sortId);

	}

	@Override
	public List<Pro> findAll() {
		return proMapper.findAll();
	}

	@Override
	public Pro detail(Long id) {
		return proMapper.detail(id);
	}

}
