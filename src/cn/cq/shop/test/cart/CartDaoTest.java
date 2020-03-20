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
		CartItem cartItem = new CartItem("p01","�㽶",2.8f,2);
		cartDaoImpl.addNewUserItemToCart("����", cartItem);
		
	}
	@Test
	public void testGetItemById() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem itemById = cartDaoImpl.getItemById("����", "p01");
		System.out.println(itemById);
		
	}
	@Test
	public void testCheckIfItemExist() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfUserExist = cartDaoImpl.checkIfUserExist("����");
		System.out.println(checkIfUserExist);
		
	}
	@Test
	public void testcheckIfItemExist() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfItemExist = cartDaoImpl.checkIfItemExist("����", "p01");
		System.out.println(checkIfItemExist);
		
	}
	@Test
	public void testgetAllItems() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		List<CartItem> allItems = cartDaoImpl.getAllItems("����");
		Iterator<CartItem> iterator = allItems.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	@Test
	public void testupdateItemBuyNum() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean checkIfItemExist = cartDaoImpl.updateItemBuyNum("����", "p01", 5);
		System.out.println(checkIfItemExist);
		
	}
	@Test
	public void testaddOldUserItemToCart() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem cartItem = new CartItem("p01","�㽶",2.8f,1);
		boolean addOldUserItemToCart = cartDaoImpl.addOldUserItemToCart("����", cartItem);
		System.out.println(addOldUserItemToCart);
		
	}
	@Test
	public void testremoveItemFromCart() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		boolean removeItemFromCart = cartDaoImpl.removeItemFromCart("����", "p01");
		System.out.println(removeItemFromCart);
		
	}
	
	
	
}
