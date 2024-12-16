package com.sist.controller;
/*
 * 		=> 화면 View
 *  	사용자 요청 ===> Controller <=====> Model
 *  									 BoardList
 *  									 BoardDelete
 *  									 BoardDetail
 *  									 BoardUpdata
 *  									 BoardFind
 *  
 *  	=> 처리
 */
import com.sist.model.*;
import java.util.*;
public class Controller {

	public void service(String cmd)
	{
		Map map=new HashMap();
		map.put("list", new BoardList());
		map.put("write", new BoardWrite());
		map.put("update", new BoardUpdate());
		map.put("delete", new BoardDelete());
		map.put("find", new BoardFind());
		map.put("detail", new BoardDetail());
		
		Model model=(Model)map.get(cmd);
	
		
//		if(cmd.equals("list"))
//		{
//			BoardList b=new BoardList();
//			b.execute();
//		}
//		else if(cmd.equals("delete"))
//		{
//			BoardList b=new BoardList();
//			b.execute();
//		}
//		else if(cmd.equals("find"))
//		{
//			BoardList b=new BoardList();
//			b.execute();
//		}
	}
}
