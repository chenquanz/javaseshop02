package cn.cq.shop.product.dao;

import java.util.List;

import cn.cq.shop.product.pojo.Product;

/**
 * 商品接口
 * @author CQ
 *
 */
public interface ProductDao {
	/**
	 * 查询所有商品
	 * @throws Exception 
	 */
	public List<Product> getAllProducts() throws Exception;
	/**
	 * 按类别名称查询商品
	 */
	public List<Product> getProductByCatName(String cateName) throws Exception;
	/**
	 * 按照价格范围查询商品
	 */
	public List<Product> getProductByPriceRange(float min,float max) throws Exception;
	/**
	 * 按照pId查找商品
	 */
	public Product getProductById(String pId) throws Exception;
	/**
	 * 添加商品
	 */
	public boolean addProduct(Product product) throws Exception;
	/**
	 * 修改商品名称
	 */
	public boolean upDateProduct(Product product) throws Exception;
	
	
	
	
}
