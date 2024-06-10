public class Tavoletta extends Cioccolato{
    private double peso;
    private String aggiunte;
    private int numCioccolatini;
    public Tavoletta(String tipoCioccolato, double percentuale, 
                        String aggiunte, double peso, int numCioccolatini){
        super(tipoCioccolato, percentuale);
        this.peso = peso;
        this.aggiunte = aggiunte;
        this.numCioccolatini = numCioccolatini;
    }

    @Override
    public String produce(){
        String padre = super.produce();
        return  padre + " " + numCioccolatini;
    }

    //grandezza calcolata in base al numCioccolatini
    public int calcoloCosto(){
        if(numCioccolatini<=4){
            return 4;
        } else if (numCioccolatini>4 && numCioccolatini<=8) {
            return 8;
        } else if (numCioccolatini>8 && numCioccolatini<=12) {
            return 12;
        } else if (numCioccolatini>12 && numCioccolatini<=16) {
            return 16;
        } else if (numCioccolatini>16 && numCioccolatini<=20) {
            return 20;
        } else {
            return 24;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAggiunte() {
        return aggiunte;
    }

    public void setAggiunte(String aggiunte) {
        this.aggiunte = aggiunte;
    }

    public int getNumCioccolatini() {
        return numCioccolatini;
    }

    public void setNumCioccolatini(int numCioccolatini) {
        this.numCioccolatini = numCioccolatini;
    }
}