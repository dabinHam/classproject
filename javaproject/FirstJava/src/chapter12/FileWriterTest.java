package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {

		String str = "SON\n"; // 원래 SONABCD 라고 저장되어 있었는데 SON 뒤에 \n 을 붙히니 SON 다음 줄로이동되었다. 기존꺼에 덮어쓰는것
		char ch = 'A';
		char[] charArr = { 'B', 'C', 'D' };

		Writer writer = null;

		try {
			writer = new FileWriter("text1.txt");

			writer.write(str);
			writer.write(ch);
			writer.write(charArr);

			System.out.println("파일에 텍스트 문자열 쓰기");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}

	}

}
