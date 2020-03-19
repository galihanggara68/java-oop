package first;

public class Person {
	// Properties usually private
	private String warnaRambut;
	private String warnaKulit;
	private double tinggiBadan;
	
	public String nama;
	
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
	public void makan() {
		sedangLapar = false;
		tekananDarah = 142.2;
		detakJantung = 110;
		fit = 90;
	}
	
	public void berjemur() {
		System.out.println("Orang Berjemur");
	}
	
	public void jalan() {
		System.out.println("Orang Jalan");
	}
}
