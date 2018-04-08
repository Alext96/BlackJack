/**
 * Created by Swagmaster on 2017-04-07.
 */
public class Kort {

    private Sviter sviter;
    private Värde värde;

    public Kort(Sviter sviter, Värde värde){
        this.sviter = sviter;
        this.värde = värde;
    }

    public String toString(){
        return this.sviter.toString() + "-" + this.värde.toString();
    }

    public Värde getVärde(){
        return this.värde;
    }

}
