import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

  public static void main(String[] args) {

    SmartPhone sp = new SmartPhone(0, null, null, 0, 0, 0, 0);

    // controllare che prodotto ha inserito il utente
    ArrayList<Prodotto> products = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    while (true) {

      // do you have the fedelta card
      System.out.println("do you have the felda card ... (y/n)");
      String card = input.nextLine();

      // variable memeory dicherazione
      int memeory = 0;

      sp.cartafedelta(card);

      System.out.println("scelgi un numero");
      System.out.println("1. smart phone");
      System.out.println("2. televisori");
      System.out.println("3. cuffie");
      System.out.println("4. exit");

      // String nomeProdotto = input.nextLine();
      int nomeProdotto = input.nextInt();

      if (nomeProdotto < 1 || nomeProdotto > 4) {
        System.out.println("numero inserito e valido");
        continue;
      } else if (nomeProdotto == 4) {
        System.out.println("Uscita dal programma. Arrivederci!");
        break;
      }

      input.nextLine();

      // marca del prodotto
      System.out.println("inserii la marca del prodotto");
      String voci = input.nextLine();

      // codice del prodotto
      System.out.println("inserici il codice del prodotto");
      int cdprodotto = Integer.parseInt(input.nextLine());

      System.out.println("inserii i prezzp del prodotto");
      int pricing = Integer.parseInt(input.nextLine());

      System.out.println("iva quanto per %");
      int iva = Integer.parseInt(input.nextLine());

      switch (nomeProdotto) {
        case 1:
          System.out.println("inserire il codiceIMEI");
          int codiceIMEI = input.nextInt();

          System.out.println("inserici il memory");
          memeory = input.nextInt();
          sp.scontoPhoneMemoria(memeory);
          products.add(new SmartPhone(cdprodotto, "SmartPhone", voci, pricing, iva, codiceIMEI, memeory));
          break;
        case 2:
          System.out.println("inserici il dimenzioni ");
          int dim = input.nextInt();

          System.out.println("e un smart tv o no.. type (true/false)");
          boolean smart = input.nextBoolean();

          products.add(new Televisori(cdprodotto, "Televisori", voci, pricing, iva, dim, smart));
          break;
        case 3:
          System.out.println("inserici il colore del prodotto: ");
          String col = input.nextLine();

          System.out.println("e wireless.. scrivi (true/false)");
          boolean wire = input.nextBoolean();

          products.add(new Cuffie(cdprodotto, "cuffie", voci, pricing, iva, col, wire));

        case 4:
          return;
        default:
          System.out.println("inserici un numero valid nella lista (1-3)");
          break;
      }

      for (Prodotto p : products) {
        System.out.println(p);
        System.out.println();
      }

    }
  }

}
