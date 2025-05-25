public Game {
    /*
    Simulated game of drawing and discarding cards in five rounds each, starting with a 5 hand.
    Attributes:
        deck - current draw deck.
        discards - all cards discarded by player. (another deck basically)
        hand - cards curently in the players hand
    Methods:
        Constructor - instantiates the game
        main - runs the game loop. Considering putting it into a different class.
        toString - prints the game. IDK whether I actually need it.
        Poker Hands Methods:
            --INFO--
            All poker hands, ascending order:
            High Card, One Pair, Two Pair, Three of a Kind,
            Straight, Flush, Full House, Four of a Kind,
            Straight Flush, Royal Flush
            High Card - Nothing above, picks the highest card in your hand
            One Pair - Have two cards with matching rank. Better rank, better pair.
            Two Pair - Have two One Pairs in the same hand, aka 2 different pairs.
                       PS. All 4 do not match. If they do, it's 4 of a kind, a MUCH better hand.
            Three of a Kind - Have 3 cards matching ranks.
            Straight - Have an ordered rank in all 5 cards. Ex. 2, 3, 4, 5, 6. Higher last card, higher straight.
                       PS. "A" rank normally beats "K", here it is the same as if there was a "1" rank. Ex. A, 2, 3, 4, 5.
            Flush - Have 5 cards with the same suit.
            Full House - Have a 3 of a Kind and a One Pair in the same hand.
            Four of a Kind - Have 4 cards with the same rank.
            Straight Flush - Flush, but also a straight. AKA same suit, but ascending ranks.
            Royal Flush - Same suit, where the ranks are: 10, J, Q, K, A.
            TODO- FIND WAYS TO DIFFERENTIATE BETWEEN THE SAME POKER HAND FOR EVERY ONE. AKA WHAT MAKES ONE ONE PAIR BEAT ANOTHER?
            --END INFO--
            --ACTUAL METHODS--
            PS. For the methods, check descending from highest hand to lowest hand.
            Stop when you get a true from one, and then check for the high card,
            or get false from everything else, and then check for high card anyways.

            checkHighCard - checks if there is a high card in the hand. Returns highest ranked card.
            checkOnePair - checks if there is a pair in the hand. Returns true if there is, false if not.
            checkTwoPair - checks if there are two pairs in the hand.
            checkThreeOfAKind - checks if there is a three of a kind in the hand.
            checkStraight - checks if there is a straight in the hand.
            checkFlush - checks if there is a flush in the hand.
            checkFullHouse - checks if there is a full house in the hand.
            checkFourOfAKind - checks if there is a four of a kind in the hand.
            checkStraightFlush - checks if there is a straight flush in the hand.
            checkRoyalFlush - checks if there is a royal flush in the hand.

            TODO- FIND WAYS TO CHECK FOR THE PROBABILITY OF OBTAINING SAID HAND BASED ON WHAT'S LEFT IN THE DECK AND WHAT'S IN THE HAND AT THE MOMENT.
     */
    // attributes
    Deck deck;
    Deck discards;
    Deck hand;

    // constructor
    public Game() {
        /*
        Instantiate the draw deck, fill it with the proper 54 cards, shuffle it.
        Instantiate the discard deck, do NOT add anything there yet.
        Instantiate the hand deck, draw the first 5 cards from the top of the deck, and add those cards to the hand.
         */
    }
    // methods
}