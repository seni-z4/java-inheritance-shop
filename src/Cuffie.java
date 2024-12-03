public class Cuffie extends Prodotto {
  private String colore;
  private boolean wireless;

  // costruttore
  public Cuffie(int codice, String nome, String marca, int prezzo, int iva, String colore, boolean wireless) {
    super(codice, nome, marca, prezzo, iva);
    this.colore = colore;
    this.wireless = wireless;
  }

  // getter and setter
  public String getColore() {
    return colore;
  }

  public void setColore(String colore) {
    this.colore = colore;
  }

  public boolean isWireless() {
    return wireless;
  }

  public void setWireless(boolean wireless) {
    this.wireless = wireless;
  }

  @Override
  public String toString() {
    return "Cuffie colore= " + colore + ", Colore = " + getColore() + ", Nome = "
        + getNome() + ", isWireless = " + isWireless() + ",  Marca = " + getMarca() + ",  Prezzo = " + getPrezzo()
        + ", Iva = " + getIva() + ",  Codice = " + getCodice() + ", prezzoTotale = " + prezzoTotale();
  }

}
