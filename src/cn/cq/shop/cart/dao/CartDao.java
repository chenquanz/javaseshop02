package cn.cq.shop.cart.dao;

import java.util.List;

import cn.cq.shop.cart.pojo.CartItem;
/**
 * ���ﳵģ�����ݷ��ʲ�ӿڶ���
 * @author CQ
 *
 */
public interface CartDao {
	/**
	 * �� ���е��û�
	 */
	public boolean addOldUserItemToCart(String userId,CartItem item) throws Exception;
	/**
	 * �� δ�е��û�
	 * @throws Exception 
	 */
	public boolean addNewUserItemToCart(String userId, CartItem item) throws Exception;
	/**
	 * ɾ
	 */
	public boolean removeItemFromCart(String userId,String pId) throws Exception;
	/**
	 * ��
	 */
	public boolean updateItemBuyNum(String userId,String pId,int buyNum) throws Exception;
	/**
	 * ��
	 */
	public List<CartItem> getAllItems(String userId) throws Exception;
	/**
	 * �ж����ݿ����Ƿ���ĳ���˵Ĺ��ﳵ
	 */
	public boolean checkIfUserExist(String userId) throws Exception;
	/**
	 * �ж�ĳ���˵Ĺ��ﳵ���Ƿ���ָ������Ʒ
	 */
	public boolean checkIfItemExist(String userId,String pId) throws Exception;
	
	/**
	 * �����û�id����Ʒidȡ��������
	 */
	public CartItem getItemById(String userId, String pId) throws Exception;
	
	
	
	
	
	
	
	
	
	
	
	
}
