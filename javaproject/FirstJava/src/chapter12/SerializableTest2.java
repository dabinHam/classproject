package chapter12;
//InputStream
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 직렬화를 하기위하여 저장하는 클래스는 Serializable 인터페이스를 구현해야한다.
public class SerializableTest2 {

	public static void main(String[] args) {
		
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream("instanceData.ser"));
			
			String str = (String) inputStream.readObject();
			
			System.out.println(str);
			
			Person p = (Person) inputStream.readObject();
			
			p.tell();
			
			ArrayList<Person> list = (ArrayList<Person>)inputStream.readObject();
			
			for(Person person : list) {
				person.tell();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			
		
		
		
		
	}

}
