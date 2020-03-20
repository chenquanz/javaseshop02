package cn.cq.shop.product.service;

import java.util.List;

import cn.cq.shop.product.pojo.Product;

public interface ProductService {
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
	public boolean addProduct(String infoString) throws Exception;
	/**
	 * �޸���Ʒ����
	 */
	public boolean upDateProductName(String pId,String name) throws Exception;
	/**
	 * �޸���Ʒ�۸�
	 */
	public boolean upDateProductPrice(String pId,float price) throws Exception;
	/**
	 * �޸���Ʒ���
	 */
	public boolean upDateProductStock(String pId,int stockNum) throws Exception;
	/**
	 * �޸���Ʒ״̬
	 * 0:�¼� 1���ϼ� 2��ɾ��
	 */
	public boolean upDateProductStatus(String pId,String status) throws Exception;
	
	
	
	
	
	
}
