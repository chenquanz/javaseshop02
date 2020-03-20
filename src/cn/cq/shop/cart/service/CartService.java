package cn.cq.shop.cart.service;

import java.util.List;

import cn.cq.shop.cart.pojo.CartItem;

public interface CartService {
	/**
	 * ��
	 * @throws Exception 
	 */
	public boolean addItemToCart(String userId,String pId,int buyNum) throws Exception;
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
	
	
	
	
	
	
}
