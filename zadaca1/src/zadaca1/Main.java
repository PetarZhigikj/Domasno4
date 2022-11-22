package zadaca1;

public class Main {
	public static void main (String[] args) {
		Covek obj1 = new Covek();
		
		obj1.setIme("Riste");
		obj1.setPrezime("Ristov");
		obj1.setMaticenBroj("0504001422003");
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getPrezime());
		System.out.println(obj1.getMaticenBroj());
	}
}