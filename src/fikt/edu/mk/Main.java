package fikt.edu.mk;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Covek ilija = new Covek();
        ilija.setIme("Ilija");
        ilija.setPrezime("Jol");
        ilija.setGodini(80);

        System.out.println("Prezime: " + ilija.getPrezime());
        System.out.println("Godini: " + ilija.getGodini());
        ilija.setGrad("Bitola");


        Student s = new Student();

        s.setIme("Student");
        s.setPrezime("Studentkovski");
        s.setGodini(21);
        s.setGrad("Bitola");
        s.setFakultet("FIKT");
        s.setBrIndeks("99/KNI");
        s.setProsek(6.5);
        System.out.println("Prezime: " + s.getPrezime());
        System.out.println("brIndeks: " + s.getBrIndeks());


        //Pomosna.pecatiGodini(s);

        ilija.pecatiGodini();
        s.pecatiGodini();

    }



}
