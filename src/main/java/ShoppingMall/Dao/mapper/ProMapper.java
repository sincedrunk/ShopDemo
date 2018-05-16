package ShoppingMall.Dao.mapper;

import java.util.List;

import ShoppingMall.entity.Pro;

public interface ProMapper {

	void createPro(Pro pro, String sortId);

	List<Pro> findAll();

	Pro detail(Long id);

}
