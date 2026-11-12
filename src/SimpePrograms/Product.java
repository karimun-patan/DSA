package SimpePrograms;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter productId :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name:");
		String name=sc.nextLine();
		System.out.println("Enter quantity of product:");
		int q=sc.nextInt();
		System.out.println("Enter product_discount:");
	    double dis=sc.nextDouble();
	    System.out.println("Enter product is availability");
	    boolean avail=sc.nextBoolean();
	    System.out.println("Enter product price");
	    double price=sc.nextDouble();
	    System.out.println("Enter product_code");
	    String pc=sc.next();
	    System.out.println("ENter product_Companycode:");
	    char code=sc.next().charAt(0);
	    sc.nextLine();
	    System.out.println("product description:");
	    String des=sc.nextLine();
	    double disA=price*(dis/100);
	    System.out.println("productId :" + id);
	    System.out.println("product name :" + name);
	    System.out.println("product quantity:" + q);
	    System.out.println("prodcut discount :" + dis);
	    System.out.println("product availablity :" +avail);
	    System.out.println("product price :" + price);
	    System.out.println("product product code :" +pc );
	    System.out.println("product_company code :" + code);
	    System.out.println("product discription :" + des);
	    System.out.println("Final price after discount :" + (price-disA) );
	    sc.close();

	}

}
