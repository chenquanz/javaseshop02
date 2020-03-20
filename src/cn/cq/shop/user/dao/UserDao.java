package cn.cq.shop.user.dao;

import java.util.List;

import cn.cq.shop.user.pojo.User;

/**
 * ��ɾ�Ĳ�
 * @author CQ
 *
 */
public interface UserDao {
	/**
	 * ����û�
	 */
	public boolean addUser(User user) throws Exception;
	/**
	 * ɾ���û�
	 * @throws Exception 
	 */
	public boolean removeUser(String account) throws Exception;
	/**
	 * �޸��û�
	 * Ҫ��Service������е������޸ĺô�����
	 * @throws Exception 
	 */
	public boolean updateUser(User user) throws Exception;
	/**
	 * �����˺Ų�ѯ�û�
	 * @throws Exception 
	 */
	public User getUserByAccount(String account) throws Exception;
	/**
	 * �������䷶Χ��ѯ�û�
	 * @param maxAge
	 * @param minAge
	 * @return
	 * @throws Exception 
	 */
	public List<User> getUserByAgeRange(int maxAge,int minAge) throws Exception;
	/**
	 * ����Vip��Χ��ѯ�û�
	 * @param maxVip
	 * @param minVip
	 * @return
	 * @throws Exception 
	 */
	public List<User> getUserByVipLeve(int maxVip,int minVip) throws Exception;
	/**
	 * ����������ѯ�û�
	 * @throws Exception 
	 */
	public List<User> getUserByName(String name) throws Exception;
	
}
