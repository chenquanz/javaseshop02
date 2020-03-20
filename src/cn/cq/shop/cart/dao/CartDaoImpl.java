package cn.cq.shop.cart.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.cq.shop.cart.pojo.CartItem;
import cn.cq.shop.constant.DataBasePathConstant;
import cn.cq.shop.utils.FileOperateUtil;

public class CartDaoImpl implements CartDao{

	FileOperateUtil<HashMap<String, CartItem>> fos = new FileOperateUtil<>();
	
	@Override
	public boolean addOldUserItemToCart(String userId, CartItem item) throws Exception {
		HashMap<String, HashMap<String, CartItem>> userMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> itemMap = userMap.get(userId);
		CartItem cartItem = itemMap.get(item.getpId());
		updateItemBuyNum(userId,item.getpId(),cartItem.getBuyNum()+1);
		
		return true;
	}

	@Override
	public boolean removeItemFromCart(String userId, String pId) throws Exception {
		
		HashMap<String, HashMap<String, CartItem>> userMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> itemMap = userMap.get(userId);
		itemMap.remove(pId);
		
		fos.saveMapToFile(userMap, DataBasePathConstant.CART_DATA_PATH);
		
		return true;
	}

	@Override
	public boolean updateItemBuyNum(String userId, String pId, int buyNum) throws Exception {
		HashMap<String, HashMap<String, CartItem>> userMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> itemMap = userMap.get(userId);
		CartItem cartItem = itemMap.get(pId);
		cartItem.setBuyNum(buyNum);
		
		fos.saveMapToFile(userMap, DataBasePathConstant.CART_DATA_PATH);
		
		return true;
	}

	@Override
	public List<CartItem> getAllItems(String userId) throws Exception {
		ArrayList<CartItem> arrayList = new ArrayList<>();
		HashMap<String, HashMap<String, CartItem>> userMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> itemMap = userMap.get(userId);
		Collection<CartItem> items = itemMap.values();
		for(CartItem item : items) {
			arrayList.add(item);
		}
		return arrayList;
	}

	@Override
	public boolean checkIfUserExist(String userId) throws Exception {
		File file = new File(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, HashMap<String, CartItem>> cartMap = null;
		if(file.exists()) {
			cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
			Set<String> keySet = cartMap.keySet();
			for(String uId : keySet) {
				if(uId.contains(userId)) {
					return true;
				}
			}
			
		}
		
		return false;
	}

	@Override
	public boolean checkIfItemExist(String userId, String pId) throws Exception {
		File file = new File(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, HashMap<String, CartItem>> cartMap = null;
		if(file.exists()) {
			cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
			HashMap<String, CartItem> userItem = cartMap.get(userId);
			Set<String> keySet = userItem.keySet();
			for(String uId : keySet) {
				if(uId.contains(pId)) {
					return true;
				}
			}
			
		}
		return false;
	}

	@Override
	public boolean addNewUserItemToCart(String userId, CartItem item) throws Exception {
		File file = new File(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, HashMap<String, CartItem>> cartMap = null;
		if(file.exists()) {
			cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		}else {
			cartMap = new HashMap<String, HashMap<String,CartItem>>();
		}
		HashMap<String , CartItem> userItems = new HashMap<>();
		userItems.put(item.getpId(), item);
		cartMap.put(userId, userItems);
		fos.saveMapToFile(cartMap, DataBasePathConstant.CART_DATA_PATH);
		
		return true;
	}

	@Override
	public CartItem getItemById(String userId, String pId) throws Exception {
		HashMap<String, HashMap<String, CartItem>> cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> userItem = cartMap.get(userId);
		CartItem cartItem = userItem.get(pId);
		
		return cartItem;
	}

}
