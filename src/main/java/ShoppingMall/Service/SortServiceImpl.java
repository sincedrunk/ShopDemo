package ShoppingMall.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import ShoppingMall.Dao.SortDao;
import ShoppingMall.entity.Sort;

@Service
public class SortServiceImpl implements SortService {
	private SortDao sortDao;

	@Override
	public List<Sort> findAll() {
		return sortDao.findAll();
	}

}
