package cn.cq.shop.product.service;

import java.util.List;

import cn.cq.shop.product.pojo.Product;

public interface ProductService {
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
	public boolean addProduct(String infoString) throws Exception;
	/**
	 * 修改商品名称
	 */
	public boolean upDateProductName(String pId,String name) throws Exception;
	/**
	 * 修改商品价格
	 */
	public boolean upDateProductPrice(String pId,float price) throws Exception;
	/**
	 * 修改商品库存
	 */
	public boolean upDateProductStock(String pId,int stockNum) throws Exception;
	/**
	 * 修改商品状态
	 * 0:下架 1：上架 2：删除
	 */
	public boolean upDateProductStatus(String pId,String status) throws Exception;
	
	
	
	
	
	
}
