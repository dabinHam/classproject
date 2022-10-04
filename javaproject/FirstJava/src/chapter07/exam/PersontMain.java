package chapter07.exam;

public class PersontMain {

	public static void main(String[] args) {

		Male m = new Male("AAA", "930621-1111111", 3, "Male");
		Female f = new Female("BBB", "950708-2222222", "game", "pink", 17);

		m.printInfo();
		m.hi();

		System.out.println();

		f.printInfo();
		System.out.println();
		System.out.println();
		f.printfavoriteInfo();

		Person p1 = m;
		Person p2 = f;

		System.out.println();
		System.out.println("==================================");
		p2.printInfo();

	}

}
