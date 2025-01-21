package com.sist.dao;
import java.util.*;


import java.sql.*;
public class EmpDeptDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:orcle:thin:@localhost:XE:1521";
	private static EmpDeptDAO dao;
	
	public EmpDeptDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	
	public static EmpDeptDAO newInstance()
	{
		if(dao==null)
			   dao=new EmpDeptDAO();
		   return dao;
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
    public void disConnection()
		 {
	     try
	     {
		if(ps!=null) ps.close();
		 if(conn!=null) conn.close();
	      }catch(Exception ex) {}
		}
		//일반 SQL 사용
		public void sqlExecute()
		{
			try
			{
				//1.연결
				getConnection();
				// 인라인뷰
				String sql="SELECT empno,ename,job,hiredate,sal,rank,dname,loc,garde "
						   +"FROM (SELECT empno,ename,job,hiredate,sal, "
						   +"RANK() OVER(ODER BY sal DESC) rank,"
						   +"dname,loc,grade "
						   +"FROM emp,dept,salgrade "
						   +"WHERE emp.deptno=dept.deptno "
						   +"AND sal BETWEEN losal AND hisal)";
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					System.out.print(
				    rs.getInt(1)+" "
				   +rs.getString(2)+" "
				   +rs.getString(3)+" "
				   +rs.getDate(4).toString()+" "
				   +rs.getInt(5)+" "
				   +rs.getInt(6)+" "
				   +rs.getString(7)+" "
				   +rs.getString(8)+" "
				   +rs.getString(9) );
				  
				}
				rs.close();
			}catch(Exception ex) {}
		}
	

}
