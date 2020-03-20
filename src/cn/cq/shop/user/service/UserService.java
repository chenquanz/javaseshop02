package cn.cq.shop.user.service;

import cn.cq.shop.user.pojo.User;

public interface UserService {
	/**
	 * ����˺��Ƿ����
	 * @param account
	 * @return
	 * @throws Exception 
	 */
	public boolean checkIfAccountExist(String account) throws Exception;
	/**
	 * ����û�
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	public boolean addUser(User user) throws Exception;
	/**
	 * �û���½
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	public boolean userLogin(String account,String password) throws Exception;
	/**
	 * �����û���
	 * @param account
	 * @param newName
	 * @return
	 * @throws Exception 
	 */
	public boolean updateUserName(String account,String newName) throws Exception;
	/**
	 * ��������
	 * @param account
	 * @param newAge
	 * @return
	 * @throws Exception 
	 */
	public boolean updateUserAge(String account,int newAge) throws Exception;
	/**
	 * ɾ���û�
	 * @param account
	 * @return
	 * @throws Exception 
	 */
	public boolean removeUser(String account) throws Exception;
	
	
}
