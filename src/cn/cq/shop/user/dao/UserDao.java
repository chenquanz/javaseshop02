package cn.cq.shop.user.dao;

import java.util.List;

import cn.cq.shop.user.pojo.User;

/**
 * 增删改查
 * @author CQ
 *
 */
public interface UserDao {
	/**
	 * 添加用户
	 */
	public boolean addUser(User user) throws Exception;
	/**
	 * 删除用户
	 * @throws Exception 
	 */
	public boolean removeUser(String account) throws Exception;
	/**
	 * 修改用户
	 * 要求Service层把所有的数据修改好传过来
	 * @throws Exception 
	 */
	public boolean updateUser(User user) throws Exception;
	/**
	 * 根据账号查询用户
	 * @throws Exception 
	 */
	public User getUserByAccount(String account) throws Exception;
	/**
	 * 根据年龄范围查询用户
	 * @param maxAge
	 * @param minAge
	 * @return
	 * @throws Exception 
	 */
	public List<User> getUserByAgeRange(int maxAge,int minAge) throws Exception;
	/**
	 * 根据Vip范围查询用户
	 * @param maxVip
	 * @param minVip
	 * @return
	 * @throws Exception 
	 */
	public List<User> getUserByVipLeve(int maxVip,int minVip) throws Exception;
	/**
	 * 根据姓名查询用户
	 * @throws Exception 
	 */
	public List<User> getUserByName(String name) throws Exception;
	
}
