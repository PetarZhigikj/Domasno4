package zadaca2;

public class Main {
	public static void main (String[] args) {
		Restoran obj1 = new Restoran ();
		
		obj1.setIme("Exclusive");
		obj1.setLokacija("Partizanska br.15");
		obj1.setTelefon("070555661");
		obj1.setBrNaSedista(80);
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());
	}
}