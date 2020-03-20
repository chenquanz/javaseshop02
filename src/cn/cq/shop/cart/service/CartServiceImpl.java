package cn.cq.shop.cart.service;

import java.awt.CardLayout;
import java.util.List;

import cn.cq.shop.cart.dao.CartDao;
import cn.cq.shop.cart.dao.CartDaoImpl;
import cn.cq.shop.cart.pojo.CartItem;
import cn.cq.shop.product.dao.ProductDao;
import cn.cq.shop.product.dao.ProductDaoImpl;
import cn.cq.shop.product.pojo.Product;

public class CartServiceImpl implements CartService{

	CartDao cartDao = new CartDaoImpl();
	ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public boolean addItemToCart(String userId, String pId, int buyNum) throws Exception {
		//先判断数据库中是否有该用户
		if(cartDao.checkIfUserExist(userId)) {
			if(cartDao.checkIfItemExist(userId, pId)) {
				CartItem item = cartDao.getItemById(userId,pId);
				boolean updateItemBuyNum = cartDao.updateItemBuyNum(userId, pId, buyNum+item.getBuyNum());
				return updateItemBuyNum;
			}else {
				//先根据pId从商品管理模块中获取商品信息
				Product p = productDao.getProductById(pId);
				//然后构造一个购物车实体对象，将数据填入
				CartItem cartItem = new CartItem(pId,p.getpName(),p.getPrice(),buyNum);
				//再利用购物车dao将这个购物项添加到已有购物车数据表中
				boolean addItemToCart = cartDao.addOldUserItemToCart(userId, cartItem);
				return addItemToCart;
			}
		}else {
			//先根据pId从商品管理模块中获取商品信息
			Product p = productDao.getProductById(pId);
			//然后构造一个购物车实体对象，将数据填入
			CartItem cartItem = new CartItem(pId,p.getpName(),p.getPrice(),buyNum);
			//再利用购物车dao将这个购物项添加到新的购物车数据表中
			boolean addItemToCart = cartDao.addNewUserItemToCart(userId, cartItem);
			return addItemToCart;
			
		}
		
	}

	@Override
	public boolean removeItemFromCart(String userId, String pId) throws Exception {
		boolean removeItemFromCart = cartDao.removeItemFromCart(userId, pId);
		return removeItemFromCart;
	}

	@Override
	public boolean updateItemBuyNum(String userId, String pId, int buyNum) throws Exception {
		boolean updateItemBuyNum = cartDao.updateItemBuyNum(userId, pId, buyNum);
		return updateItemBuyNum;
	}

	@Override
	public List<CartItem> getAllItems(String userId) throws Exception {
		List<CartItem> allItems = cartDao.getAllItems(userId);
		return allItems;
	}
	
}
