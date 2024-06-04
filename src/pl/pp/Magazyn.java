package pl.pp;

    public class Magazyn {
    private final int numerMagazynu;
    private int dostepnaPrzestrzenMagazynowa;
    private String nazwaWlasciciela;
    private String emailWlasciciela;
    private String numerTelefonuWlasciciela;
    private int zajetaPrzestrzen;

    // Konstruktor
    public Magazyn(int numerMagazynu, int dostepnaPrzestrzenMagazynowa, String nazwaWlasciciela, String emailWlasciciela, String numerTelefonuWlasciciela) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzestrzenMagazynowa = dostepnaPrzestrzenMagazynowa;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.emailWlasciciela = emailWlasciciela;
        this.numerTelefonuWlasciciela = numerTelefonuWlasciciela;
        this.zajetaPrzestrzen = 0;
    }

    // Gettery
    public int getNumerMagazynu() {
        return numerMagazynu;
    }

    public int getDostepnaPrzestrzenMagazynowa() {
        return dostepnaPrzestrzenMagazynowa;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public String getEmailWlasciciela() {
        return emailWlasciciela;
    }

    public String getNumerTelefonuWlasciciela() {
        return numerTelefonuWlasciciela;
    }

    // Settery
    public void setDostepnaPrzestrzenMagazynowa(int dostepnaPrzestrzenMagazynowa) {
        this.dostepnaPrzestrzenMagazynowa = dostepnaPrzestrzenMagazynowa;
    }

    public void setEmailWlasciciela(String emailWlasciciela) {
        this.emailWlasciciela = emailWlasciciela;
    }

    public void setNumerTelefonuWlasciciela(String numerTelefonuWlasciciela) {
        this.numerTelefonuWlasciciela = numerTelefonuWlasciciela;
    }

    // Metoda dodająca towar
    public void dodajTowar(int ilosc) {
        if (ilosc > dostepnaPrzestrzenMagazynowa - zajetaPrzestrzen) {
            System.out.println("Brak wystarczającej przestrzeni w magazynie.");
            return;
        }
        zajetaPrzestrzen += ilosc;
        System.out.println("Dodano " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (dostepnaPrzestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
    }

    // Metoda usuwająca towar
    public void usunTowar(int ilosc) {
        if (ilosc > zajetaPrzestrzen) {
            System.out.println("Brak wystarczającej ilości towaru w magazynie.");
            return;
        }
        zajetaPrzestrzen -= ilosc;
        System.out.println("Usunięto " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (dostepnaPrzestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
    }

    // Metoda sprawdzająca zajętość magazynu
    public void sprawdzZajetosc() {
        System.out.println("Zajęta przestrzeń magazynowa: " + zajetaPrzestrzen + " jednostek.");
        System.out.println("Dostępna przestrzeń magazynowa: " + (dostepnaPrzestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
    }

    // Metoda aktualizująca dane kontaktowe właściciela
    public void aktualizujKontakt(String nowyEmail, String nowyNumerTelefonu) {
        this.emailWlasciciela = nowyEmail;
        this.numerTelefonuWlasciciela = nowyNumerTelefonu;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.println("Nowy email: " + nowyEmail);
        System.out.println("Nowy numer telefonu: " + nowyNumerTelefonu);
    }
}

