package ShoppingMall.Dao.mapper;

import ShoppingMall.entity.PersonalCenter;

public interface PersonalCenterMapper {

	void createPersonalCenter(PersonalCenter personalCenter);

	PersonalCenter findOneConterDetails(Long id);

	void updatePersonalCenter(PersonalCenter personalCenter);

}
