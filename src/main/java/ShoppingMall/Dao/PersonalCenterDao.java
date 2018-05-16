package ShoppingMall.Dao;

import ShoppingMall.entity.PersonalCenter;

public interface PersonalCenterDao {
	void createPersonalCenter(PersonalCenter personalCenter);

	PersonalCenter findOneConterDetails(Long id);

	void updatePersonalCenter(PersonalCenter personalCenter);
}
