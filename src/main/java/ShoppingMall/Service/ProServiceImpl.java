package ShoppingMall.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShoppingMall.Dao.ProDao;
import ShoppingMall.entity.Pro;

@Service
public class ProServiceImpl implements ProService {
	@Autowired
	private ProDao proDao;

	@Override
	public void createPro(Pro pro, String sortId) {
		proDao.createPro(pro, sortId);

	}

	@Override
	public List<Pro> findAll() {
		return proDao.findAll();
	}

	@Override
	public Pro detail(Long id) {
		return proDao.detail(id);
	}
}
