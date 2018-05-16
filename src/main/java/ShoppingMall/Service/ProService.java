package ShoppingMall.Service;

import java.util.List;

import ShoppingMall.entity.Pro;

public interface ProService {
	void createPro(Pro pro, String sortId);

	List<Pro> findAll();

	Pro detail(Long id);
}
