package fikt.edu.mk;

public class Covek {

    private String ime;
    private String prezime;
    private int godini;
    private String grad;

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodini() {
        return godini;
    }

    public void setGodini(int godini) {
        if ((godini<0) || (godini>120)) {
            this.godini=0;
        }
        else
        this.godini = godini;
    }


    public void pecatiGodini(){
        System.out.println("Covekot ima godini: " + godini);
    }
}
