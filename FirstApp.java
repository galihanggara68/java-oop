package first;

public class FirstApp {

	public static void main(String[] args) {
		// Dunia Virtual Pertama
		// Merealisasikan rancangan/class Person
		Person person = new Person();
		
		person.setTinggiBadan(160);
		person.setWarnaKulit("Sawo Matang");
		person.setWarnaRambut("Hitam");
		person.setSedangLapar(true);
	
		System.out.println(person.getTinggiBadan());
		System.out.println(person.getWarnaKulit());
		System.out.println(person.getWarnaRambut());
		
		System.out.println("Sebelum Makan");
		System.out.println("Sedang Lapar : " + person.isSedangLapar());
		
		person.makan();
		
		System.out.println("Setelah Makan");
		System.out.println("Sedang Lapar : " + person.isSedangLapar());

		person.makan("Bakso");
		String kataKata = person.berbicaraSatuKata("Makan");
		System.out.println(kataKata);
	}
}
