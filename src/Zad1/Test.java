package Zad1;

public class Test {

	public static void main(String[] args) {

		Sklep.setCenaHurtowa(1.5);
		Sklep.setCenaDetaliczna(3);
		Sklep sklep1 = new Sklep();
		Sklep sklep2 = new Sklep();
		Sklep sklep3 = new Sklep();
		sklep1.kupno(100);
		sklep2.kupno(200);
		sklep3.kupno(300);
		System.out.println("Sklepy: \n" + sklep1 + '\n' + sklep2 + '\n' + sklep3 + '\n');
		sklep1.sprzedaż(95);
		sklep2.sprzedaż(100);
		sklep3.sprzedaż(250);
		podajZyski(sklep1); // uwaga: to jest wywołanie metody z klasy Test,
		podajZyski(sklep2); // którą to metodę też trzeba napisać
		podajZyski(sklep3);

	}

	public static void podajZyski(Sklep s) {
		System.out.println("Sklep nr " + s.getNrSklepu() + " aktualny stan jabłek " + s.getIloscJablek() + " kg\nWydatki "+s.wydatki()+
				"\nDochody: "+s.dochody()+"\nZysk: "+s.zysk());

	}

}