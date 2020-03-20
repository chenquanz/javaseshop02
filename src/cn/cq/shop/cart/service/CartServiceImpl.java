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
		//���ж����ݿ����Ƿ��и��û�
		if(cartDao.checkIfUserExist(userId)) {
			if(cartDao.checkIfItemExist(userId, pId)) {
				CartItem item = cartDao.getItemById(userId,pId);
				boolean updateItemBuyNum = cartDao.updateItemBuyNum(userId, pId, buyNum+item.getBuyNum());
				return updateItemBuyNum;
			}else {
				//�ȸ���pId����Ʒ����ģ���л�ȡ��Ʒ��Ϣ
				Product p = productDao.getProductById(pId);
				//Ȼ����һ�����ﳵʵ����󣬽���������
				CartItem cartItem = new CartItem(pId,p.getpName(),p.getPrice(),buyNum);
				//�����ù��ﳵdao�������������ӵ����й��ﳵ���ݱ���
				boolean addItemToCart = cartDao.addOldUserItemToCart(userId, cartItem);
				return addItemToCart;
			}
		}else {
			//�ȸ���pId����Ʒ����ģ���л�ȡ��Ʒ��Ϣ
			Product p = productDao.getProductById(pId);
			//Ȼ����һ�����ﳵʵ����󣬽���������
			CartItem cartItem = new CartItem(pId,p.getpName(),p.getPrice(),buyNum);
			//�����ù��ﳵdao�������������ӵ��µĹ��ﳵ���ݱ���
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
