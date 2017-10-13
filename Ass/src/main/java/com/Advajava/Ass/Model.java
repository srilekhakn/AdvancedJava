package com.Advajava.Ass;

public class Model {
	private int Uid,age;
	private String Username;
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	@Override
	public String toString() {
		return "Model [Uid=" + Uid + ", age=" + age + ", Username=" + Username + "]";
	}
	

}