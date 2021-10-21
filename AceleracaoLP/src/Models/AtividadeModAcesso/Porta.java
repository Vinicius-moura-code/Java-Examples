package Models.AtividadeModAcesso;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimX;
    private double dimY;
    private double dimZ;


    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimX() {
        return dimX;
    }

    public void setDimX(double dimX) {
        this.dimX = dimX;
    }

    public double getDimY() {
        return dimY;
    }

    public void setDimY(double dimY) {
        this.dimY = dimY;
    }

    public double getDimZ() {
        return dimZ;
    }

    public void setDimZ(double dimZ) {
        this.dimZ = dimZ;
    }

    public void abre(){
        setAberta(true);
    }
    public void fecha(){
        setAberta(false);
    }
    public void pinta(String cor){
        setCor(cor);
    }
    public boolean estaAberta(){

        return aberta;
    }

}
