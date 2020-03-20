package cn.cq.shop.test.cart;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import cn.cq.shop.cart.dao.CartDaoImpl;
import cn.cq.shop.cart.pojo.CartItem;

public class CartDaoTest {
	@Test
	public void testAddNewUserItem() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem cartItem = new CartItem("p01","香蕉",2.8f,2);
		cartDaoImpl.addNewUserItemToCart("张三", cartItem);
		
	}
	@Test
	public void testGetItemById() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem itemById = cartDaoImpl.getItemById("张三", "p01");
		System.out.println(itemById);
		
	}
	@Test
	public void testCheckIfItemExist() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfUserExist = cartDaoImpl.checkIfUserExist("张三");
		System.out.println(checkIfUserExist);
		
	}
	@Test
	public void testcheckIfItemExist() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfItemExist = cartDaoImpl.checkIfItemExist("张三", "p01");
		System.out.println(checkIfItemExist);
		
	}
	@Test
	public void testgetAllItems() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		List<CartItem> allItems = cartDaoImpl.getAllItems("张三");
		Iterator<CartItem> iterator = allItems.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	@Test
	public void testupdateItemBuyNum() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfItemExist = cartDaoImpl.updateItemBuyNum("张三", "p01", 5);
		System.out.println(checkIfItemExist);
		
	}
	@Test
	public void testaddOldUserItemToCart() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem cartItem = new CartItem("p01","香蕉",2.8f,1);
		boolean addOldUserItemToCart = cartDaoImpl.addOldUserItemToCart("张三", cartItem);
		System.out.println(addOldUserItemToCart);
		
	}
	@Test
	public void testremoveItemFromCart() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean removeItemFromCart = cartDaoImpl.removeItemFromCart("张三", "p01");
		System.out.println(removeItemFromCart);
		
	}
	
	
	
}
