package ShoppingMall.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShoppingMall.Dao.mapper.UserMapper;
import ShoppingMall.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;

	public User findOneByUsername(String username) {
		return userMapper.findOneByUsername(username);
	}

	public void create(User user) {
		System.out.println(user.toString() + "dao");
		userMapper.create(user);
	}

	@Override
	public void updateEmail(User curUser) {
		userMapper.updateEamil(curUser);

	}

}
