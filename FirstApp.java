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
		
		
		KendaraanDarat kd = new KendaraanDarat();
		kd.setBahanBakar(100);
		kd.setKnalpot("Akrapovic");
		kd.setMesin("V8");
		kd.setKopling("Kopling Elektrik");
		kd.setPosisiGigi(0);
		kd.setRoda("Michellin");
		kd.setRodaBocor(false);
		kd.setSpion("BBS");
		
		
		kd.berjalan();
		System.out.println(kd.getKecepatan());
		kd.berjalan();
		kd.displayRpm();
		System.out.println(kd.getKecepatan());
		kd.rem();
		System.out.println(kd.getKecepatan());
	}
}
