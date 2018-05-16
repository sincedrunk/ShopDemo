package ShoppingMall.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShoppingMall.Dao.PersonalCenterDao;
import ShoppingMall.entity.PersonalCenter;

@Service
public class PersonalCenterServiceImpl implements PersonalCenterService {
	@Autowired
	private PersonalCenterDao personalCenterDao;

	@Override
	public void createPersonalCenter(PersonalCenter personalCenter) {
		personalCenterDao.createPersonalCenter(personalCenter);

	}

	@Override
	public PersonalCenter findOneConterDetails(Long id) {

		return personalCenterDao.findOneConterDetails(id);
	}

	@Override
	public void updatePersonalCenter(PersonalCenter personalCenter) {
		personalCenterDao.updatePersonalCenter(personalCenter);

	}

}
