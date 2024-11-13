package Person;

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("Nguyen Van A", "13/11/1998", "Ha Noi", 'M', "ngvan@gmail.com", "0123456789");

		System.out.println(person1.toString());
		Person person2 = new Person();
		person2.setName("Nguyen Thi B");
		person2.setDob("14/11/1998");
		person2.setPob("Ha Noi");
		person2.setGender('F');
		person2.setEmail("ngthi.b@gmail.com");
		person2.setPhone("0987654321");

		System.out.println(person2.toString());

	}
}
