
public class BlackJack {

//välkommen
    public static void main(String[] args){
        System.out.println("Välkommen till Blackjack!");

        //skapa kortlek
        Kortlek spelKortlek = new Kortlek();
        spelKortlek.skapaFullKortLek();
        spelKortlek.blanda();

        System.out.println(spelKortlek);
    }

}
