package fikt.edu.mk;

public class Student extends Covek{
    private String brIndeks;
    private String fakultet;
    private double prosek;

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public String getBrIndeks() {
        return brIndeks;
    }

    public void setBrIndeks(String brIndeks) {
        this.brIndeks = brIndeks;
    }

    @Override
    public void pecatiGodini() {
        //super.pecatiGodini();
        System.out.println("Studentot ima godini: " + this.getGodini());
    }
}
