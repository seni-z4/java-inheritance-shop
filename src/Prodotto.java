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

}
