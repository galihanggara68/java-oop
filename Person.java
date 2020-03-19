package first;

public class Person {
	// Properties usually private
	private String warnaRambut;
	private String warnaKulit;
	private double tinggiBadan;
	
	protected String nama;
	
	// State
	private boolean sedangLapar; // True | False
	private boolean sedangDuduk; // True | False
	
	private double tekananDarah; // Angka
	private double fit;
	private int detakJantung;
	
	public void setSedangLapar(boolean sedangLapar) {
		this.sedangLapar = sedangLapar;
	}

	public boolean isSedangLapar() {
		return sedangLapar;
	}

	public boolean isSedangDuduk() {
		return sedangDuduk;
	}

	public double getTekananDarah() {
		return tekananDarah;
	}

	public double getFit() {
		return fit;
	}

	public int getDetakJantung() {
		return detakJantung;
	}

	public String getWarnaRambut() {
		return warnaRambut;
	}

	public void setWarnaRambut(String warnaRambut) {
		this.warnaRambut = warnaRambut;
	}

	public String getWarnaKulit() {
		return warnaKulit;
	}

	public void setWarnaKulit(String warnaKulit) {
		this.warnaKulit = warnaKulit;
	}

	public double getTinggiBadan() {
		return tinggiBadan;
	}

	public void setTinggiBadan(double tinggiBadan) {
		this.tinggiBadan = tinggiBadan;
	}

	// Methods usually public
	public void makan(String makanan) {
		System.out.println("Makan " + makanan);
		sedangLapar = false;
		tekananDarah = 142.2;
		detakJantung = 110;
		fit = 90;
	}
	
	public void berjemur(int lamanya) {
		System.out.println("Orang Berjemur Selama " + lamanya);
		sedangLapar = true;
		warnaKulit = "Sawo Gosong";
		fit = 100;
	}
	
	public String berbicara(String[] kataKata) {
		String mengucapkan = "";
		for(int i = 0; i < kataKata.length; i++) {
			mengucapkan += kataKata[i];
		}
		return mengucapkan;
	}
	
	public String berbicaraSatuKata(String kata) {
		return "Berbicara " + kata;
	}
	
	
}
