package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest2 {

	public static void main(String[] args) {

		// 파일 복사
		// 특정 파일의 데이터를 읽어서 다른 위치에 파일에 쓰면 -> 복사

		// 원본파일
		InputStream in = null;
		// 복사본 파일
		OutputStream out = null;

		// 용량이 큰 파일의 경우 복사시간이 오래 걸리니 바구니형태에 담아서 좀 더 빠르게 복사하기 위한 코드
		int copyByte = 0; // 총 복사한 데이터 사이즈
		int byteDataSize = 0;
		byte[] bufData = new byte[1024]; // 배열을 이용한 바구니

		try {
			in = new FileInputStream("test1.txt");
			out = new FileOutputStream("testCopy1.txt");

			System.out.println("복사가 시작되었습니다.");

			while (true) {

				int data = in.read(bufData); // read() 안에 담을거 넣어주기.

				if (data == -1) {
					break;
				}

				// bufData- 원본 , copyByte- 총 몇바이트가 복사된건지 , byteDataSize
				out.write(bufData, 0, byteDataSize); // 새로운 파일에 데이터 쓰기
				copyByte += byteDataSize;
			}

			System.out.println("복사 완료");
			System.out.println("복사한 파일의 size :" + copyByte);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
