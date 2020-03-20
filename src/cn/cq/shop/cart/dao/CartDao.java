package cn.cq.shop.cart.dao;

import java.util.List;

import cn.cq.shop.cart.pojo.CartItem;
/**
 * 购物车模块数据访问层接口定义
 * @author CQ
 *
 */
public interface CartDao {
	/**
	 * 增 已有的用户
	 */
	public boolean addOldUserItemToCart(String userId,CartItem item) throws Exception;
	/**
	 * 增 未有的用户
	 * @throws Exception 
	 */
	public boolean addNewUserItemToCart(String userId, CartItem item) throws Exception;
	/**
	 * 删
	 */
	public boolean removeItemFromCart(String userId,String pId) throws Exception;
	/**
	 * 改
	 */
	public boolean updateItemBuyNum(String userId,String pId,int buyNum) throws Exception;
	/**
	 * 查
	 */
	public List<CartItem> getAllItems(String userId) throws Exception;
	/**
	 * 判断数据库中是否有某个人的购物车
	 */
	public boolean checkIfUserExist(String userId) throws Exception;
	/**
	 * 判断某个人的购物车中是否有指定的商品
	 */
	public boolean checkIfItemExist(String userId,String pId) throws Exception;
	
	/**
	 * 根据用户id和商品id取出购物项
	 */
	public CartItem getItemById(String userId, String pId) throws Exception;
	
	
	
	
	
	
	
	
	
	
	
	
}
