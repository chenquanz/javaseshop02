package cn.cq.shop.user.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import cn.cq.shop.constant.DataBasePathConstant;
import cn.cq.shop.user.pojo.User;
import cn.cq.shop.utils.FileOperateUtil;

public class UserDaoImpl implements UserDao{
	
	FileOperateUtil<User> util = new FileOperateUtil<User>();
	@Override
	public boolean addUser(User user) throws Exception {
		HashMap<String, User> userMap = null;
		File file = new File(DataBasePathConstant.USER_DATA_PATH);
		if(file.exists()) {
			//取出这个User数据库
			userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		}else {
			userMap = new HashMap<>();
		}
		//把新用户添加到userMap中
		userMap.put(user.getAccount(), user);
		//将整个userMap序列化写入文件中
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);
		return true;
	}

	@Override
	public boolean removeUser(String account) throws Exception {
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		User remove = userMap.remove(account);
		if(remove == null) {
			return false;
		}
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);
		return true;
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		//加载整个数据库
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		userMap.put(user.getAccount(), user);
		//写入
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);
		return true;
	}

	@Override
	public User getUserByAccount(String account) throws Exception {
		//取出这个User数据库
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		return userMap.get(account);
	}

	@Override
	public List<User> getUserByAgeRange(int maxAge, int minAge) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User user : users) {
			if(user.getAge() >= minAge && user.getAge() <= maxAge) {
				userList.add(user);
			}
		}
		
		return userList;
	}

	@Override
	public List<User> getUserByVipLeve(int maxVip, int minVip) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User user : users) {
			if(user.getAge() >= minVip && user.getAge() <= maxVip) {
				userList.add(user);
			}
		}
		return userList;
	}

	@Override
	public List<User> getUserByName(String name) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		HashMap<String, User> userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User user : users) {
			if(user.getName().contains(name)) {
				userList.add(user);
			}
		}
		return userList;
	}

}
