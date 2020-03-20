package cn.cq.shop.cart.service;

import java.util.List;

import cn.cq.shop.cart.pojo.CartItem;

public interface CartService {
	/**
	 * Ôö
	 * @throws Exception 
	 */
	public boolean addItemToCart(String userId,String pId,int buyNum) throws Exception;
	/**
	 * É¾
	 */
	public boolean removeItemFromCart(String userId,String pId) throws Exception;
	/**
	 * ¸Ä
	 */
	public boolean updateItemBuyNum(String userId,String pId,int buyNum) throws Exception;
	/**
	 * ²é
	 */
	public List<CartItem> getAllItems(String userId) throws Exception;
	
	
	
	
	
	
}
