package chapter15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {

		String hostName = "www.naver.com"; // DNS도메인

		try {
			InetAddress ip = InetAddress.getByName(hostName);

			System.out.println(ip.getHostName()); // ip 주소는 변경될 수 있다.
			System.out.println(ip.getHostAddress()); // 도메인을 입력하면 ip를 알 수있다.

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
