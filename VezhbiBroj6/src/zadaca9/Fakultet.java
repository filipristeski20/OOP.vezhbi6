package zadaca9;

public class Fakultet {
    private String imeNaFakultet;
    private int brojNaSmerovi;
    private int vkupnoStudenti;

    public Fakultet(String imeNaFakultet, int brojNaSmerovi, int vkupnoStudenti) {
        this.imeNaFakultet = imeNaFakultet;
        this.brojNaSmerovi = brojNaSmerovi;
        this.vkupnoStudenti = vkupnoStudenti;
    }

    public String toString(){
        return "Ime na fakultet: " + imeNaFakultet + " Broj na smerovi: " + brojNaSmerovi + " Vkupno studenti: " + vkupnoStudenti;
    }
}