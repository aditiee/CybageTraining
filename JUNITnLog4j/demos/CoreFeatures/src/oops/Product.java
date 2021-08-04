package oops;

public class Product {

	int pid;
	String pname;
	float price;
	int pquanty;
	String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String pname, float price, int pquanty, String description) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pquanty = pquanty;
		this.description = description;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPquanty() {
		return pquanty;
	}

	public void setPquanty(int pquanty) {
		this.pquanty = pquanty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pquanty=" + pquanty
				+ ", description=" + description + "]";
	}
	
	
	
	
}
