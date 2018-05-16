package ShoppingMall.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShoppingMall.Dao.mapper.PersonalCenterMapper;
import ShoppingMall.entity.PersonalCenter;
@Repository
public class PersonalCenterDaoImpl implements PersonalCenterDao {
	@Autowired
	private PersonalCenterMapper personalCenterMapper;

	@Override
	public void createPersonalCenter(PersonalCenter personalCenter) {
		personalCenterMapper.createPersonalCenter(personalCenter);
	}

	@Override
	public PersonalCenter findOneConterDetails(Long id) {
		return personalCenterMapper.findOneConterDetails(id);
	}

	@Override
	public void updatePersonalCenter(PersonalCenter personalCenter) {
		personalCenterMapper.updatePersonalCenter(personalCenter);

	}

}
