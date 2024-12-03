public class Televisori extends Prodotto {

  private int dimensioni;
  private boolean smartTV;

  // costruttore
  public Televisori(int codice, String nome, String marca, int prezzo, int iva, int dimensioni, boolean smartTV) {
    super(codice, nome, marca, prezzo, iva);
    this.dimensioni = dimensioni;
    this.smartTV = smartTV;
  }

  // getter and setter
  public int getDimensioni() {
    return dimensioni;
  }

  public void setDimensioni(int dimensioni) {
    this.dimensioni = dimensioni;
  }

  public boolean isSmartTV() {
    return smartTV;
  }

  public void setSmartTV(boolean smartTV) {
    this.smartTV = smartTV;
  }

  @Override
  public String toString() {
    return "Televisori"
        + ", Nome = " + getNome() + ", Marca = " + getMarca()
        + ", Prezzo = " + getPrezzo() + ", Iva = " + getIva() + "%"
        + ", prezzoTotale = " + prezzoTotale() + ", dimensioni = " + dimensioni +
        ",  smart tv ?  " + smartTV;
  }

}
