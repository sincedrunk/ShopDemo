package ShoppingMall.Service;

import ShoppingMall.entity.User;

public interface UserService {
	User findOneByUsername(String username);

	void create(User user);

	void updateEmail(User curUser);

}
