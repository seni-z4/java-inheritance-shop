public class Prodotto {

  // attributi //variable di istanza //campi
  private int codice;
  private String nome;
  private String marca;
  private int prezzo;
  private int iva;

  // costruttore parametizato
  public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
    this.codice = codice;
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // getter and setter

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(int prezzo) {
    this.prezzo = prezzo;
  }

  public int getIva() {
    return iva;
  }

  public void setIva(int iva) {
    this.iva = iva;
  }

  // getter dei codice
  public int getCodice() {
    return codice;
  }

  // methodo prezzo base con iva incluso
  public int prezzoTotale() {
    return prezzo + (prezzo * iva / 100);
  }

  @Override
  public String toString() {
    return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", iva=" + iva
        + ", prezzoTotale()=" + prezzoTotale() + "]";
  }

  // bonus
  double prezzoTotaleScontato = prezzoTotale();

  public void cartafedelta(String card) {
    // controllo se ha la carta fedelta
    if (card.equalsIgnoreCase("y")) {
      System.out.println("hai diritto a un sconto del 2%");
      prezzoTotaleScontato -= (prezzoTotaleScontato * 2 / 100);
    } else {
      System.out.println("non hai il sconto del 2% vai a registarti nel nostro sito e rihedi la carta fed");
    }

  }

  public void scontoPhoneMemoria(int memeory) {
    if (memeory > 32) {
      System.out.println("hai un sconto del 5%");
      prezzoTotaleScontato -= (prezzoTotaleScontato * 5 / 100);
    }
  }

}
