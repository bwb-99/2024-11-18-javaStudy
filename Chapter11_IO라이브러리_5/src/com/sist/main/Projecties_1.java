package com.sist.main;

import java.util.Properties;

// 사원 정보

public class Projecties_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Properties props=System.getProperties();
//		System.out.println(props.getProperty("java.version"));
//		System.out.println(props.getProperty("user.version"));
	  EmpDAO dao=new EmpDAO();
	  List<Emp> list=dao.empListData();
	  for(Emp e:list)
	  {
		  System.out.println(e.getE);
	  }

	}

}
