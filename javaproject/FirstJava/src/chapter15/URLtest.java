package chapter15;

import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {

	public static void main(String[] args) {
		
		String urlStr = "http://news.naver.com/article/read.nhn?mode=LS2D&mid=sec&sid1=105&sid2=228&oid=584&aid=0000008620";
		
		try {
			
			URL url = new URL(urlStr);
			
			System.out.println(url.getProtocol()); // http:
			System.out.println(url.getHost()); // 도메인 
			System.out.println(url.getPort()); // 
			System.out.println(url.getDefaultPort()); // 80
			System.out.println(url.getPath()); //
			System.out.println(url.getQuery()); // 	mode = 파라미터이름 
			System.out.println(url.getFile());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
	
}
