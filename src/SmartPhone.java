public class SmartPhone extends Prodotto {
  private long codiceIMEI;
  private int memoria;

  // costrutore
  public SmartPhone(int codice, String nome, String marca, int prezzo, int iva, int codiceIMEI, int memoria) {
    super(codice, nome, marca, prezzo, iva);
    this.codiceIMEI = codiceIMEI;
    this.memoria = memoria;
  }

  // getter and setter

  public long getCodiceIMEI() {
    return codiceIMEI;
  }

  public void setCodiceIMEI(long codiceIMEI) {
    this.codiceIMEI = codiceIMEI;
  }

  public int getMemoria() {
    return memoria;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  @Override
  public String toString() {
    return "SmartPhone [codiceIMEI =" + codiceIMEI + ", memoria = " + memoria
        + ", Nome = " + getNome() + ", Marca = " + getMarca()
        + ", Prezzo = " + getPrezzo() + ", Iva = " + getIva() + "%"
        + ", prezzoTotale = " + prezzoTotale();
  }

}
