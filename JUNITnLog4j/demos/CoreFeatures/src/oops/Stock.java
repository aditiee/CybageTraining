package oops;

public class Stock {

	Product p[] = { new Product(101, "Monitor", 8966.5f, 12, "LG Monitor"),
			new Product(102, "Monitor", 8966.5f, 12, "LG Monitor"),
			new Product(103, "Monitor", 8966.5f, 12, "LG Monitor"),
			new Product(104, "Monitor", 8966.5f, 12, "LG Monitor"),
			new Product(105, "Monitor", 8966.5f, 12, "LG Monitor") };

	public boolean inStock(Product product) {
		boolean flag = false;
		for (Product prod : p) {
			if (prod.getPid() == product.getPid()) {
				flag = true;
				break;
			} else
				flag = false;
		}
		return flag;
	}

}
