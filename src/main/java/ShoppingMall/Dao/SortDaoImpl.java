package ShoppingMall.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShoppingMall.Dao.mapper.SortMapper;
import ShoppingMall.entity.Sort;

@Repository
public class SortDaoImpl implements SortDao {
	@Autowired
	private SortMapper sortMapper;

	@Override
	public List<Sort> findAll() {

		return sortMapper.findAll();
	}
}
