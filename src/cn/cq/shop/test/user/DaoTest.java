package cn.cq.shop.test.user;

import java.util.List;

import org.junit.Test;

import cn.cq.shop.constant.UserVipLeveConstant;
import cn.cq.shop.user.dao.UserDaoImpl;
import cn.cq.shop.user.pojo.User;

/**
 * ������
 * @author CQ
 *
 */
public class DaoTest {
	
	@Test
	public void testAddUser() throws Exception {
		User u1 = new User("lovebaby","123","����",23,UserVipLeveConstant.VIP_1,"13838388","����");
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.addUser(u1);
		List<User> userByName = userDaoImpl.getUserByName("��");
		for(User user : userByName) {
			System.out.println(user);
		}
	}
	
	
	
}
