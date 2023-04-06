
package verTest;

import java.util.Scanner;
import java.util.regex.Pattern;

//	1. SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다. 
public class SmartPhone {

//	① SmartPhone 클래스의 인스턴스를 생성합니다.
	private Contact[] contacts;
	private int numofContact;
	Scanner sc;
	
//	② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
	private SmartPhone(int size) {
		contacts = new Contact[size];
		numofContact = 0;
		sc = new Scanner(System.in);
	}
	
//	③ 10번 반복해서 배열에 추가합니다.
	private static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}
	
//	이름을 입력받고 배열에 해당 이름의 Contact 객체가 있는 index 반환
	private int getIndex() {
		
		String name = sc.nextLine();
		
		int searchIndex = -1;
		
		for(int i=0; i<numofContact-1; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		} return searchIndex;
	}
	
//	② 배열에 인스턴스를 저장하고
	void insertContact() {
		
		if(numofContact>contacts.length) {
			System.out.println("최대저장가능 개수는 " + contacts + "개 입니다.");
			return;
		}
		
		// 거래처 정보입력
		System.out.println("입력하고자 하는 친구타입을 선택해주세요.");
		System.out.println("1. 회사동료 \t 2. 거래처");
		int select = Integer.parseInt(sc.nextLine());
		
		String name = null;
		String number = null;
		String email = null;
		String address = null;
		String birth = null;	
		String group = null;
		
		System.out.println("입력을 시작합니다.");
		

		System.out.print("이름 > ");
		name = getName();

		System.out.print("번호 > ");
		number = getPhoneNumber();
	
		System.out.print("이메일 > ");
		email = getString();
		
		System.out.print("주소 > ");
		address = getString();
		
		System.out.print("생일 > ");
		birth = getString();
		
		System.out.print("그룹 > ");
		group = getString();
		
		Contact contact = null;
		
		if(select==1) {
			
			// CompanyContact 인스턴스 생성
			System.out.println("회사이름 > ");
			String company = getString();
			System.out.println("부서이름 > ");
			String division = getString();
			System.out.println("직급 > ");
			String manager = getString();
		
			// 인스턴스 생성
			contact = new CompanyContact(name,number,email,address,birth,group,company,division,manager);
			
		} else {
			// CustomerContact 인스턴스 생성
			System.out.println("거래처 이름 > ");
			String company = getString();
			System.out.println("품목 > ");
			String product = getString();
			System.out.println("담당자 > ");
			String manager = getString();
			
			// 인스턴스 생성
			contact = new CustomerContact(name,number,email,address,birth,group,company,product,manager);
		}
		contacts[numofContact++] = contact;
	}
	
//	④ 배열의 저장된 데이터의 리스트를 출력
	void printAllDate() {
		System.out.println("전체 데이터 =======================");
		
		if(numofContact==0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}
		for(int i=0; i<numofContact; i++) {
			contacts[i].printData();
		}
		
	}
	
//	⑤ 배열의 모든 요소를 검색
	void serchInfoPrint() {
		
		String name = null;
		
		System.out.println("검색을 시작합니다.");
		System.out.println("검색하실 이름을 적어주세요 >> ");
		
		int searchIndex = getIndex();
		
		System.out.println("검색결과 ==================================");
		if(searchIndex<0) {
			System.out.println("검색하신 " + name + "의 결과가 없습니다.");
		} else {
			contacts[searchIndex].printData();
		}
	}

//	⑥ 배열의 요소를 삭제
	void deleteCotact() {
		
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하려는 이름을 입력해주세요 >");
		
		int searchIndex = getIndex();
		
		if(searchIndex<0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 없습니다.");
		} else {
			for(int i=searchIndex; i<numofContact-1; i++) {
				contacts[i] = contacts[i+1];
			}
			numofContact--;
			System.out.println("데이터가 삭제됐습니다.");
		}		
	}
	
//	⑦ 배열의 요소를 수정	
	void editContact() {
		
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.println("수정하려는 이름을 입력해주세요 >");
		
		int searchIndex = getIndex();
		
		if(searchIndex<0) {
			System.out.println("찾으려는 데이터가 없습니다.");
			return;
		}
		
		Contact contact = contacts[searchIndex];
		
		System.out.println("데이터 수정을 진행합니다.");
		
		System.out.println(
				"변경하고자 하는 이름을 입력해주세요.(현재값: " + contact.getName() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newName = sc.nextLine();
		
		// "	abc		" -> "abc"
		// " "
		if(newName != null && newName.trim().length()>0) {
			contact.setName(newName);
		}
		
		System.out.println(
				"변경하고자 하는 전화번호를 입력해주세요.(현재값: " + contact.getNumber() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newNumber = sc.nextLine();
		if(newNumber != null && newNumber.trim().length()>0) {
			contact.setNumber(newNumber);
		}
		System.out.println(
				"변경하고자 하는 이메일을 입력해주세요.(현재값: " + contact.getEmail() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newEmail = sc.nextLine();
		if(newEmail != null && newEmail.trim().length()>0) {
			contact.setEmail(newEmail);
		}
		System.out.println(
				"변경하고자 하는 주소를 입력해주세요.(현재값: " + contact.getAddress() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newAddress = sc.nextLine();
		if(newAddress != null && newAddress.trim().length()>0) {
			contact.setAddress(newAddress);
		}
		System.out.println(
				"변경하고자 하는 생일을 입력해주세요.(현재값: " + contact.getBirth() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newBirth = sc.nextLine();
		if(newBirth != null && newBirth.trim().length()>0) {
			contact.setBirth(newBirth);
		}
		System.out.println(
				"변경하고자 하는 그룹을 입력해주세요.(현재값: " + contact.getGroup() + ")\n" 
						+ "변경하지 않으려면 엔터를 치세요 >");
		String newGroup = sc.nextLine();
		if(newGroup != null && newGroup.trim().length()>0) {
			contact.setGroup(newGroup);
		}
		
		if(contact instanceof CompanyContact) {
			
			CompanyContact companycontact = (CompanyContact)contact;
			
			System.out.println(
					"변경하고자 하는 회사이름을 입력해주세요.(현재값: " + companycontact.getCompany() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newCompany = sc.nextLine();
			if(newCompany != null && newCompany.trim().length()>0) {
				companycontact.setCompany(newCompany);
			}
			System.out.println(
					"변경하고자 하는 부서이름을 입력해주세요.(현재값: " + companycontact.getDivision() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newDivision = sc.nextLine();
			if(newDivision != null && newDivision.trim().length()>0) {
				companycontact.setDivision(newDivision);	
			}
			System.out.println(
					"변경하고자 하는 직급을 입력해주세요.(현재값: " + companycontact.getManager() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newManager = sc.nextLine();
			if(newManager != null && newManager.trim().length()>0) {
				companycontact.setManager(newManager);	
			}
		} else if(contact instanceof CustomerContact) {
			
			CustomerContact customercontact = (CustomerContact)contact;
			
			System.out.println(
					"변경하고자 하는 거래처를 입력해주세요.(현재값: " + customercontact.getCompany() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newCompany = sc.nextLine();
			if(newCompany != null && newCompany.trim().length()>0) {
				customercontact.setCompany(newCompany);
			}
			System.out.println(
					"변경하고자 하는 품목을 입력해주세요.(현재값: " + customercontact.getProduct() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newProduct = sc.nextLine();
			if(newProduct != null && newProduct.trim().length()>0) {
				customercontact.setProduct(newProduct);	
			}
			System.out.println(
					"변경하고자 하는 담당자를 입력해주세요.(현재값: " + customercontact.getManager() + ")\n" 
							+ "변경하지 않으려면 엔터를 치세요 >");
			String newManager = sc.nextLine();
			if(newManager != null && newManager.trim().length()>0) {
				customercontact.setManager(newManager);
			}
		}
		System.out.println("정보가 수정되었습니다.");
		System.out.println();	
	}
	
//	입력 문자가 공백일 경우 다시 입력하도록 하는 기능
	private String getString() {
		
		String s = null;
		
		while(true) {
			s = sc.nextLine();
			if(s!=null && s.trim().length()!=0) {
				break;
			} else {
				System.out.println("공백을 허용하지 않습니다.");
			}
		} 
		return s;	
	}
	
//	이름정보를 받아서 중복 여부 체크 후 문자열 반환
	private String getName() {
		
		String name = null;
//		boolean chk = false;
		
		while(true) {

			try {
				name = sc.nextLine();
				boolean chk = Pattern.matches("^[a-zA-Z가-힣]*$", name);
				if(!chk) {
					throw new ArrayIndexOutOfBoundsException();
				}
				if(name==null && name.trim().length()==0) {
					throw new ArithmeticException();
				}
				for(int i=0; i<numofContact; i++) {
					if(name.equals(contacts[i].getName())) {
						throw new Exception();
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("영문자와 한글만 입력가능합니다. \n다시 입력해주세요 > ");
			} catch (ArithmeticException e) {
				System.out.println("공백은 사용할 수 없습니다.");
			} catch (Exception e) {
				System.out.println("중복된 연락처가 저장되어 있습니다. \n 다시 입력해주세요 > ");
			}
			return name;
//	String name = null;
//	
//	while(true) {
//		name = sc.nextLine();
//		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	
			
//			if(name!=null && name.trim().length()!=0) {
//				for(int i=0; i<numofContact; i++) {
//					if(name.equals(contacts[i].getName())) {
//					}
//				}
//				
//				if(chk) {
//					System.out.println("중복된 연락처가 저장되어 있습니다. \n 다시 입력해주세요 > ");
//				} else {
//					break;
//				}
//			} else {
//				System.out.println("공백은 허용하지 않습니다.");
//			}
//		}
//		return name;
	}
	
//	전화번호를 받아서 중복된 전화번호가 있는지 체크 중복되지 않는 전화번호를 받아서 반환
	private String getPhoneNumber() {
		
		String phonenumber = null;
		
		while(true) {
			phonenumber = sc.nextLine();
			
			if(phonenumber!=null && phonenumber.trim().length()>0) {
				boolean chk = false;
				
				for(int i=0; i<numofContact; i++) {
					
					if(phonenumber.equals(contacts[i].getNumber())) {
						chk = true;
						break;
					}
				}
				if(chk) {
					System.out.println("중복된 번호가 있습니다. \n 다시 입력해주세요 > ");
				} else {
					break;
				}	
			} else {
				System.out.println("공백은 허용하지 않습니다.");
			}
		}
		return phonenumber;
	}
	
}