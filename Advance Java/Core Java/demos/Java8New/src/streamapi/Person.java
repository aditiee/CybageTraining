package streamapi;

//Persons whose age is > 45 and find first 10records and sort them by name
public class Person {
	String name;
	int age;
	String address;
	
	public Person(String n,int a,String add) {
		// TODO Auto-generated constructor stub
		name=n;
		age=a;
		address=add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" Age: "+age+" Address: "+address;
	}

}








