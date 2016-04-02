package Zad1;

public class Sklep {

	private static int nrSklepu = 0;
	private static double cenaHurtowa;
	private static double cenaDetaliczna;
	private double iloscJablek;

	public Sklep() {
		nrSklepu = nrSklepu + 1;

	}

	public static void setCenaHurtowa(double cenaH) {
		cenaHurtowa = cenaH;
	}

	public static void setCenaDetaliczna(double cenaD) {
		cenaDetaliczna = cenaD;
	}

	public double getCenaHurtowa() {
		return cenaHurtowa;
	}

	public double getCenaDetaliczna() {
		return cenaDetaliczna;
	}

	public void kupno(double kupno) {
		this.setIloscJablek(this.getIloscJablek() + kupno);
	}

	public void sprzedaż(double sprzedane) {
		this.setIloscJablek(this.getIloscJablek() - sprzedane);

	}

	public double getIloscJablek() {
		return iloscJablek;
	}

	public void setIloscJablek(double iloscJablek) {
		this.iloscJablek = iloscJablek;
	}

	public String toString() {
		return "Sklep nr " + getNrSklepu() + " aktulany stan jabłek " + getIloscJablek();
	}

	public double wydatki() {
		return iloscJablek * getCenaHurtowa();

	}

	public double dochody() {
		return iloscJablek * getCenaDetaliczna();
	}

	public double zysk() {
		return dochody() - wydatki();
	}

	public static int getNrSklepu() {
		return nrSklepu;
	}

}
