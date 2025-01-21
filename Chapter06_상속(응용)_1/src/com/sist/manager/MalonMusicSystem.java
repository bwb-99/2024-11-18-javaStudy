package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.MusicVO;
//같은 패키지에 존재 => import를 사용하지 않는다
//다른 패키지에 있는 클래스 사용 => import
//=> import : 사용자 정의 , 라이브러리 클래스로드
//=> import java.lang.*; => 자동 추가
public class MalonMusicSystem extends GenieMusicSystem{
	//public MusicVO[] musics=new MusicVO[50];
	public String title="멜론 뮤직 TOP 50";
	
	{
		// 예외처리 => 파일관련 , 네트워크 , 데이터베이스
		// URL => 웹 네트워크
		try
		{
			// 정상적으로 수행하는 문장
			// int a=10/0; //프로그램 종료
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div wrap_song_info ellipsis rank01");
			Elements singer=doc.select("table.list-wrap ellipsis rank02");
			Elements album=doc.select("table.list-wrap ellipsis rank03");
			
			for(int i=0;i<50;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("================================");
				musics[i]=new MusicVO();
				musics[i].setNo(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				
			}
			
			
		}catch(Exception ex) {
			// 에러 발생시에 복구 / 에러출력
			// 에러를 건너뛴다
			}
		
	}
	//musicAllData()
	//musicFindData(String fd)
	//static, 생성자 , 초기홥 블록 제외 => 추가
	//포함 클래스를 더 많이 사용한다
	
}
