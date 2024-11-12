package be.vdab;

import java.text.DecimalFormat;

public class TestProgramma {

    public static void main(String[] args) {
        var opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);

        var opel2 = new Personenwagen("Jan Klaasen",
                14599.0F, 105, 6.8F, "1-KLM-099", 5, 5);
        opel2.toon();
        System.out.println(opel2);

        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2);

        var volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);

        var volvo2 = new Vrachtwagen("Michel Dewolf",
                214599.0F, 440, 33.1F, "1-PRD-441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);

        var voertuigen = new Voertuig[4];
        voertuigen[0] = opel1;
        voertuigen[1] = opel2;
        voertuigen[2] = volvo1;
        voertuigen[3] = volvo2;

        var fmt = new DecimalFormat("#0.00");

        System.out.println("\n*** Kyotoscore ***");
        System.out.println("Kyotoscore : " + fmt.format(opel1.getKyotoScore()));
        System.out.println("Kyotoscore : " + fmt.format(opel2.getKyotoScore()));
        System.out.println("Kyotoscore : " + fmt.format(volvo1.getKyotoScore()));
        System.out.println("Kyotoscore : " + fmt.format(volvo2.getKyotoScore()));

        System.out.println("\n*** Array van vervuilers ***");
        var vervuilers = new Vervuiler[5];
        vervuilers[0] = opel1;
        vervuilers[1] = opel2;
        vervuilers[2] = volvo1;
        vervuilers[3] = volvo2;
        vervuilers[4] = new Stookketel(7.5F);
        for (var vervuiler : vervuilers) {
            System.out.println("vuil: " + fmt.format(vervuiler.berekenVervuiling()));
        }

        System.out.println("\n--- toString() ---");
        for (var voertuig : voertuigen) {
            System.out.println(voertuig);
        }

        System.out.println("\n--- method toon() ---");
        for (var voertuig : voertuigen) {
            voertuig.toon();
        }

        System.out.println("\n*** Array van private geg van auto's ***");
        var voertuigen2 = new Privaat[4];
        voertuigen2[0] = opel1;
        voertuigen2[1] = opel2;
        voertuigen2[2] = volvo1;
        voertuigen2[3] = volvo2;
        for (var auto : voertuigen) {
            auto.geefPrivateData();
        }

        System.out.println("\n*** Array van milieu geg van auto's ***");
        var voertuigen3 = new Milieu[4];
        voertuigen3[0] = opel1;
        voertuigen3[1] = opel2;
        voertuigen3[2] = volvo1;
        voertuigen3[3] = volvo2;
        for (var auto : voertuigen3) {
            auto.geefMilieuData();
        }
    }
}
