package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class ZipcodeDAO {
	//연결
	private Connection conn;
	// 오라클 => 송수신
	private PreparedStatement ps;
	//URL
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 싱글턴
	private static ZipcodeDAO dao;
	 
	//드라이버 등록
	public ZipcodeDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
		
	}
	//오라클 연동
	public void getConnection()
	  {
		  try
		  {
			 conn=DriverManager.getConnection(URL,"hr","happy");
		  }catch(Exception ex) {}
	  }
	//오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	//싱글턴
    public static ZipcodeDAO newInstance()
    {
    	if(dao==null)
    		dao=new ZipcodeDAO();
    	return dao;
    }
    // 기능 우편번호 검색
    public List<ZipcodeVO> postFind(String dong)
    {
    	List<ZipcodeVO> list= new ArrayList<ZipcodeVO>();
    	
    	try
    	{
    		//1. 연결
    		getConnection();
    		// 2.SQL 문장 제작
    		String sql ="SELECT zipcode,sido,gugun,dong, NVL (bunji, ' ') FROM zipcode WHERE dong LIKE '%||?||'%'";
    		ps=conn.prepareStatement(sql);
    		// ?에 값을 채워준다
    		ps.setString(1, dong);
    		//실행 요청
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			ZipcodeVO vo=new ZipcodeVO();
    			vo.setZipcode(rs.getString(1));
    			vo.setSido(rs.getString(2));
    			vo.setGugun(rs.getString(3));
    			vo.setDong(rs.getString(4));
    			vo.setBunji(dong);
    			list.add(vo);
    		}
    	}catch(Exception ex)
    	{
    		//오류확인
    		ex.printStackTrace();
    	}
    	finally
    	{
    		//오라클 닫기
    		disConnection();
    	}return list;
		
    }
    
    public int postFindCount(String dong)
    {
    	int count=0;
    	try
    	{
    		getConnection();
    		String sql="SELECT COUNT(*) FROM zipcode WHERE dong LIKE '%'||?||'%'";
    		ps=conn.prepareStatement(sql);
    		ps.setString(1, dong);
    		
    	}catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		disConnection();
    	}
    	
    	return count;
    }
}
