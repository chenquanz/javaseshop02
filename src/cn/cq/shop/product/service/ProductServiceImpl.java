package cn.cq.shop.product.service;

import java.util.List;

import cn.cq.shop.product.dao.ProductDao;
import cn.cq.shop.product.dao.ProductDaoImpl;
import cn.cq.shop.product.pojo.Product;

public class ProductServiceImpl implements ProductService{
	ProductDao productDao = new ProductDaoImpl();
	@Override
	public List<Product> getAllProducts() throws Exception {
		List<Product> pList = productDao.getAllProducts();
		
		return pList;
	}

	@Override
	public List<Product> getProductByCatName(String cateName) throws Exception{
		List<Product> pList = productDao.getProductByCatName(cateName);
		return pList;
	}

	@Override
	public List<Product> getProductByPriceRange(float min, float max) throws Exception{
		List<Product> pList = productDao.getProductByPriceRange(min, max);
		return pList;
	}

	@Override
	public Product getProductById(String pId) throws Exception{
		Product p = productDao.getProductById(pId);
		return p;
	}

	@Override
	public boolean addProduct(String infoString) throws Exception{
		String[] split = infoString.split(",");
		Product p = new Product(split[0], split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]), split[4],split[5]);
		boolean addProduct = productDao.addProduct(p);
		return addProduct;
	}

	@Override
	public boolean upDateProductName(String pId, String newName) throws Exception{
		Product product = productDao.getProductById(pId);
		product.setpName(newName);
		boolean upDateProduct = productDao.upDateProduct(product);
		
		return upDateProduct;
	}

	@Override
	public boolean upDateProductPrice(String pId, float price) throws Exception{
		Product product = productDao.getProductById(pId);
		product.setPrice(price);
		boolean upDateProduct = productDao.upDateProduct(product);
		
		return upDateProduct;
	}

	@Override
	public boolean upDateProductStock(String pId, int stockNum) throws Exception{
		Product product = productDao.getProductById(pId);
		product.setStockNum(stockNum);
		boolean upDateProduct = productDao.upDateProduct(product);
		
		return upDateProduct;
	}

	@Override
	public boolean upDateProductStatus(String pId, String status) throws Exception{
		Product product = productDao.getProductById(pId);
		product.setStatus(status);
		boolean upDateProduct = productDao.upDateProduct(product);
		
		return upDateProduct;
	}


}
