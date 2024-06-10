public class Cioccolatino extends Cioccolato{
    private String forma;
    private String ripieno;
    private static final int COSTO_PREDEFINITO = 2;


    public Cioccolatino(String tipo, int percentuale, String aggiunte, String fomra, String ripieno){
        super(tipo, percentuale, aggiunte, COSTO_PREDEFINITO);
        this.forma=forma;
        this.ripieno= ripieno;
        
    }


    public String getForma() {
        return forma;
    }


    public void setForma(String forma) {
        this.forma = forma;
    }


    public String getRipieno() {
        return ripieno;
    }


    public void setRipieno(String ripieno) {
        this.ripieno = ripieno;
    }


    public static int getCostoPredefinito() {
        return COSTO_PREDEFINITO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cioccolatino  ");
        sb.append("forma=").append(forma);
        sb.append(", ripieno=").append(ripieno);
        sb.append(", costo=").append(COSTO_PREDEFINITO);
        return sb.toString();
    }

    
}