package pl.pp;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
    Magazyn magazyn = new Magazyn(1, 5000, "Właściciel Magazynu", "owner@magazyn.pl", "+48 123 456789");
    magazyn.dodajTowar(3000);
    magazyn.usunTowar(1000);
    magazyn.dodajTowar(2500);
    magazyn.sprawdzZajetosc();
    magazyn.aktualizujKontakt("newowner@magazyn.pl", "+48 987 654321");
}
}
