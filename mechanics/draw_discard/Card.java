public Card {
    /*
    For storing information about a card
    Attributes:
        suit - the suit of a card (ex. Spades, Hearts)
        rank - the rank of a card (ex. 3, K, A)
        joker - whether or not this card is a joker (if joker, suit and rank do NOT matter
        PS. Suits aren't ordered to be more valuable than each other, but the ranks are.
            So, the comparing of the ranks happens in the Rank class.
            Also, IDK how to make the joker not also have a suit and rank, so I just made a boolean
            for it, and will probably make every joker card have -1 as a rank
            and joker as suit or something to start, then change as you go.
            Plan is to have jokers be any card you want them to be at any moment,
            doing this by transforming it into the ideal card,
            but, jokers
            cannot be an irregular card. (IDK proper term for it)
            An irregular card having a different suit from the accepted 4 or a different rank from the accepted 13.
    Methods:
        Just basic getters and setters for all attributes.
     */

    // attributes
    String suit;
    Rank rank;
    boolean joker;
    // constructor
    public Card(String suit, Rank rank, boolean joker) {
        this.suit = suit;
        this.rank = rank;
        this.joker = joker;
    }
    // getters and setters
    public getSuit() {
        return suit;
    }
    public getRank() {
        return rank;
    }
    public getJoker() {
        return joker;
    }
    public setSuit(Suit suit) {
        this.suit = suit;
    }
}