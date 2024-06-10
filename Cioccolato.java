public class Cioccolato {
    int percentuale;
    int max = 100;
    // String cioccolatini;
    // String tavoletteCioccolato;
    // String cioccolatoCaldo;
    String tipo;
    String aggiunte;


    public Cioccolato(String tipo, int percentuale, String aggiunte){
        this.percentuale = percentuale;
        this.tipo = tipo;
        this.aggiunte = aggiunte;
    }


    public String produce() {
        return "Cioccolato [tipo=" + tipo + ", percentuale =" + percentuale + "]";
    }

    
    
    
}
