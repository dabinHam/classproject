package chapter12;
// OutputStream
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 직렬화를 하기위하여 저장하는 클래스는 Serializable 인터페이스를 구현해야한다.
public class SerializableTest {

	public static void main(String[] args) {
		
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		
		try {
			// .ser : 자바에서 직렬화를 할때 .ser을 확장자로 쓰도록 권장하고 있다.
			outputStream = 
					new ObjectOutputStream(new FileOutputStream("instanceData.ser"));
			outputStream.writeObject(msg); // 직렬화가 가능한 객체가 와야합니다. 
			
			Person p = new Person("손흥민",20);
			outputStream.writeObject(p);
			
			ArrayList<Person> list = new ArrayList<>();
			list.add(p);
			list.add(new Person("손흥민", 21));
			list.add(new Person("손흥민", 22));
			list.add(new Person("손흥민", 23));
			list.add(new Person("손흥민", 24));
			list.add(new Person("손흥민", 25));
			
			outputStream.writeObject(list);
			
			System.out.println("저장 되었습니다.");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
