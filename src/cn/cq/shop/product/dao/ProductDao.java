package cn.cq.shop.product.dao;

import java.util.List;

import cn.cq.shop.product.pojo.Product;

/**
 * ��Ʒ�ӿ�
 * @author CQ
 *
 */
public interface ProductDao {
	/**
	 * ��ѯ������Ʒ
	 * @throws Exception 
	 */
	public List<Product> getAllProducts() throws Exception;
	/**
	 * ��������Ʋ�ѯ��Ʒ
	 */
	public List<Product> getProductByCatName(String cateName) throws Exception;
	/**
	 * ���ռ۸�Χ��ѯ��Ʒ
	 */
	public List<Product> getProductByPriceRange(float min,float max) throws Exception;
	/**
	 * ����pId������Ʒ
	 */
	public Product getProductById(String pId) throws Exception;
	/**
	 * �����Ʒ
	 */
	public boolean addProduct(Product product) throws Exception;
	/**
	 * �޸���Ʒ����
	 */
	public boolean upDateProduct(Product product) throws Exception;
	
	
	
	
}
