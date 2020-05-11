public class Card {
    String suit;
    String rank;
    int Denomonation;
    Suit aSuit;
    Rank aRank;
    public Card(String Ranks , String Suits, int rankDenomination ){
        rank=rankDenomination;
    suit=Suits;
    Denomonation= rankDenomination;
    aSuit = new Suit(suit,0);
    aRank = new Rank(rank,Denomination);
}

    public String card(aRank + " of "+ aSuit.toString);

    }