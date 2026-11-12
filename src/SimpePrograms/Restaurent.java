package SimpePrograms;

public class Restaurent {

	public void details() {
		System.out.println("Restaurent Name:Universal");
		System.out.println("Restaurent Adress:Ameerpet");
	}

	public double bill(int quantity, double price) {
		return (quantity * price);
	}

	public double gst(double amount) {
		double gstRate = 2.8;
		return (amount * gstRate) / 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurent r=new Restaurent();
		r.details();
		System.out.println(r.bill(6,200));
		System.out.println(r.gst(270));

	}

}
