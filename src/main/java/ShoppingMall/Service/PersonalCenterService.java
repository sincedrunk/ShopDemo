package ShoppingMall.Service;

import ShoppingMall.entity.PersonalCenter;

public interface PersonalCenterService {
	void createPersonalCenter(PersonalCenter personalCenter);

	PersonalCenter findOneConterDetails(Long id);

	void updatePersonalCenter(PersonalCenter personalCenter);
	
}
