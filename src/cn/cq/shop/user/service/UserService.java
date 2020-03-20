package cn.cq.shop.user.service;

import cn.cq.shop.user.pojo.User;

public interface UserService {
	/**
	 * 检查账号是否存在
	 * @param account
	 * @return
	 * @throws Exception 
	 */
	public boolean checkIfAccountExist(String account) throws Exception;
	/**
	 * 添加用户
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	public boolean addUser(User user) throws Exception;
	/**
	 * 用户登陆
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	public boolean userLogin(String account,String password) throws Exception;
	/**
	 * 更改用户名
	 * @param account
	 * @param newName
	 * @return
	 * @throws Exception 
	 */
	public boolean updateUserName(String account,String newName) throws Exception;
	/**
	 * 更改年龄
	 * @param account
	 * @param newAge
	 * @return
	 * @throws Exception 
	 */
	public boolean updateUserAge(String account,int newAge) throws Exception;
	/**
	 * 删除用户
	 * @param account
	 * @return
	 * @throws Exception 
	 */
	public boolean removeUser(String account) throws Exception;
	
	
}
