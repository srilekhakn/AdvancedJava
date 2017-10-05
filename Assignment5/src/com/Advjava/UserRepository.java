package com.Advjava;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	public String getName(int Uid){
String[] name=new String[10];
		
		name[0]="sri";
		name[1]="lekha";
		name[2]="navya";
		name[3]="kokila";
		name[4]="varalakshmi";
		name[5]="Nanjundareddy";
		name[6]="Ritish";
		name[7]="chintu";
		name[8]="Deeksha";
		name[9]="Nithyashree";
		return name[Uid];
	}
	public List<Model> getValues(){
		
		List<Model> list=new ArrayList<Model>();
		Model[] obj =new Model[10];
		
		
		for(int i=0;i<10;i++)
		{
			obj[i]=new Model();
			obj[i].setUid(i+1);
			obj[i].setAge(i+20);
			obj[i].setUsername(getName(i));
		}
		
		for(int i=0;i<10;i++){
			list.add(obj[i]);
		}
		
		return list;
	}
	public List<Model> getValues(int Uid){
		Model obj = new Model();
		obj.setAge(20+Uid);
		obj.setUid(Uid);
		obj.setUsername(getName(Uid));
		List<Model> list=new ArrayList<Model>();
		list.add(obj);
		return list;
	}

}
