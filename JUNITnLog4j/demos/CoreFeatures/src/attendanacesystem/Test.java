package attendanacesystem;

import oops.ArrayDemo;
import oops.Product;
import oops.Stock;
import oops.VariableTypes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			EmployeeAttendance employeeAttendance=new EmployeeAttendance(101,"John",true,0,8);
//			System.out.println("Marking the attendance: "+employeeAttendance.markingAttendance());
//			
//			int new_val=70;
//			VariableTypes var_types=new VariableTypes();
//			System.out.println("Class var: "+var_types.object_var);
//			System.out.println("Static  var: "+VariableTypes.class_var);
//			System.out.println("Before New value: "+new_val);
//			var_types.localVariable(new_val);
//			System.out.println("After New value: "+new_val);
//			System.out.println("Local var: ");
		
//		ArrayDemo arrayDemo=new ArrayDemo();
//		
//		arrayDemo.showRoll();
//		
//		arrayDemo.addProduct();
//		
//		System.out.println(arrayDemo.showProduct());
		
		Stock myStock=new Stock();
		System.out.println("Product in stock: "+myStock.inStock(new Product(102, "Monitor", 8966.5f, 12, "LG Monitor")));
			
	}

}
