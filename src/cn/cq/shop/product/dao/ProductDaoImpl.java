package cn.cq.shop.product.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import cn.cq.shop.constant.DataBasePathConstant;
import cn.cq.shop.product.pojo.Product;
import cn.cq.shop.utils.FileOperateUtil;

public class ProductDaoImpl implements ProductDao{
	
	FileOperateUtil<Product> util = new FileOperateUtil<Product>();
	
	@Override
	public List<Product> getAllProducts() throws Exception {
		//先从数据库读取数据  使用我们自定义的工具
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		Collection<Product> values = pMap.values();
		ArrayList<Product> pList = new ArrayList<>();
		for(Product p : values) {
			pList.add(p);
		}
		return pList;
	}

	@Override
	public List<Product> getProductByCatName(String cateName) throws Exception{
		//先从数据库读取数据  使用我们自定义的工具
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		Collection<Product> values = pMap.values();
		ArrayList<Product> pList = new ArrayList<>();
		for(Product p : values) {
			if(p.getCategoryName().contains(cateName)) {
				pList.add(p);
			}
		}
		return pList;
	}

	@Override
	public List<Product> getProductByPriceRange(float min, float max) throws Exception{
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		Collection<Product> values = pMap.values();
		ArrayList<Product> pList = new ArrayList<>();
		for(Product p : values) {
			if(p.getPrice() >= min && p.getPrice() <= max) {
				pList.add(p);
			}
		}
		return pList;
	}

	@Override
	public Product getProductById(String pId) throws Exception{
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		return pMap.get(pId);
	}

	@Override
	public boolean addProduct(Product product) throws Exception{
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		pMap.put(product.getpId(), product);
		util.saveMapToFile(pMap, DataBasePathConstant.PRODUCT_DATA_PATH);
		return true;
	}

	@Override
	public boolean upDateProduct(Product product) throws Exception{
		HashMap<String, Product> pMap = util.readMapFromFile(DataBasePathConstant.PRODUCT_DATA_PATH);
		pMap.put(product.getpId(), product);
		util.saveMapToFile(pMap, DataBasePathConstant.PRODUCT_DATA_PATH);
		return true;
	}


}
