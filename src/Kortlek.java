import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Swagmaster on 2017-04-07.
 */
public class Kortlek {
//instans
    private ArrayList<Kort> kort;

    //konstruktor
    public Kortlek()
    {
        this.kort = new ArrayList<Kort>();
    }

    public void skapaFullKortLek()
    {
        //generera kort
        for(Sviter kortSviter: Sviter.values()){
            for(Värde kortVärde : Värde.values()){
                //lägg till nytt kort
                this.kort.add(new Kort(kortSviter, kortVärde));
            }
        }
    }

    public void blanda(){
        ArrayList<Kort> tmpKortlek = new ArrayList<Kort>();
        //random
        Random random = new Random();
        int randomKortIndex = 0;
        int originalStorlek = this.kort.size();
        for(int i = 0; i < originalStorlek; i++){
            //generera random index max-min +1 + min
            randomKortIndex = random.nextInt((this.kort.size()-1 - 0) + 1) + 0;
            tmpKortlek.add(this.kort.get(randomKortIndex));
            //ta bort från originella deck
            this.kort.remove(randomKortIndex);
        }

        this.kort = tmpKortlek;

    }

    public String toString(){
        String kortOutput = "";
        int i = 0;
        for (Kort ettKort : this.kort){
            kortOutput += "\n" + i + "-" + ettKort.toString();
            i++;
        }
        return kortOutput;
    }

    public void taBortKort(int i){
        this.kort.remove(i);
    }

    public Kort getKort(int i){
        return this.kort.get(i);
    }

    public void addKort(Kort addKort){
        this.kort.add(addKort);
    }

    //dra kort från kortleken

    public void draw(Kort comingFrom){
        this.kort.add(comingFrom);
    }

}
