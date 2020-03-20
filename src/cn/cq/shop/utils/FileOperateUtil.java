package cn.cq.shop.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import cn.cq.shop.constant.DataBasePathConstant;
import cn.cq.shop.user.pojo.User;

public class FileOperateUtil<T> {
	
	
	public  HashMap<String, T> readMapFromFile(String path) throws Exception{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		@SuppressWarnings("unchecked")
		HashMap<String, T> userMap = (HashMap<String, T>) ois.readObject();
		ois.close();
		
		return userMap;
	}
	
	public  void saveMapToFile(HashMap<String, T> userMap,String path) throws Exception {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(userMap);
		oos.close();
		
	}
	
	
	
}
