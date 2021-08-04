package oops;

public class ArrayDemo {
	
	int rollno[][]={{2,3},{4,5},{6,7},{78,89}};
	
	int value;
	
	Product[] listOfProducts=new Product[10];
	
	public void setRollno(){
		//rollno=new int[20];
		//rollno[0]=4
	}

	public void addProduct() {
		listOfProducts[0]= new Product(101,"Monitor", 8756.4f, 11, "LG monitor");
	}
	
	public Product showProduct() {
		return listOfProducts[0];
	}
	
	//add product at the given position
	public void addProductAtPositon(int pos,Product p) {
		if(pos>=10) {
			System.out.println("Out of limit");
		}
		else
		{
			listOfProducts[pos]=p;
		}
	}
	
	//show product at the given position
		public Product showProductAtPositon(int pos) {
			Product p = null;
			if(pos>=10) {
				System.out.println("Out of limit");
			}
			else
			{
				p=listOfProducts[pos];
			}
			return p;
		}
		
		
	
	public void showRoll() {
		System.out.println(value);
		for(int row=0;row<3;row++) {
			System.out.println("Row: "+row);
			for(int col=0;col<2;col++) {
				System.out.print("Col: "+col+" => "+rollno[row][col]+" ");
			}
			System.out.println();
		}
		
		
	}
}
