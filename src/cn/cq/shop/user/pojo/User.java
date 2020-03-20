package cn.cq.shop.user.pojo;

import java.io.Serializable;

/**
 * ”√ªß¿‡
 * @author CQ
 *
 */
public class User implements Serializable{
	//’À∫≈
	private String account;
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", name=" + name + ", age=" + age + ", vipLeve="
				+ vipLeve + ", phone=" + phone + ", addr=" + addr + "]";
	}
	//√‹¬Î
	private String password;
	private String name;
	private int age;
	private int vipLeve;
	
	public User() {
	}
	public User(String account, String password, String name, int age, int vipLeve, String phone, String addr) {
		super();
		this.account = account;
		this.password = password;
		this.name = name;
		this.age = age;
		this.vipLeve = vipLeve;
		this.phone = phone;
		this.addr = addr;
	}
	public void set(String account, String password, String name, int age, int vipLeve, String phone, String addr) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.age = age;
		this.vipLeve = vipLeve;
		this.phone = phone;
		this.addr = addr;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getVipLeve() {
		return vipLeve;
	}
	public void setVipLeve(int vipLeve) {
		this.vipLeve = vipLeve;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private String phone;
	private String addr;
	
	
}
