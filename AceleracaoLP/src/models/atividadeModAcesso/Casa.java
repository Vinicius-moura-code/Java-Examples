package models.atividadeModAcesso;

public class Casa extends Porta{
    private Porta porta1 = new Porta();
    private Porta porta2 = new Porta();
    private Porta porta3 = new Porta();
    private String cor;


    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public void pintaCasa(String cor){
        setCor(cor);
    }

    public int quantasPortasAbertas(){
        int i = 0;
        var p1 = porta1.estaAberta();
        var p2 = porta2.estaAberta();
        var p3 = porta3.estaAberta();

        if(p1){
            i++;
        }
        if(p2){
            i++;
        }
        if(p3){
            i++;
        }
        return i;
    }
}
