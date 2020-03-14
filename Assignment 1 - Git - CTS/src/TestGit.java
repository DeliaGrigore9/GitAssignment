

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git! The name of the license project is Software application for blood donations");
		
		Interface d = new Donor("Maria", 23, "A", 45);
		System.out.println(d);
		
		d.donate();
	}
	

}
