package ShoppingMall.Dao;

import java.util.List;

import ShoppingMall.entity.Pro;

public interface ProDao {

	void createPro(Pro pro, String sortId);

	List<Pro> findAll();

	Pro detail(Long id);
}
