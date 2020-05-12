
public class Deck
{
    private Card[] CardsinDeck;
    private Rank rankValue;
    private Suit suitValue;
    int currentcard=1;

    public void deck() {
        CardsinDeck = new Card[52];

        for (int i = 52; i > 0; i--) {
            CardsinDeck[i] = new Card(rankValue, suitValue);
        }
    }
        public Deck deal()
        {
        if(currentcard < CardsinDeck.length){
            return(CardsinDeck[currentcard++]);

        }
        public void shuffle(int NumofShuffles)
            {
            for(int i = 0; i<NumofShuffles; i++)
            {
             currentcard = (int)(52*Math.random()*NumofShuffles);
            }
            }

    }
    }

