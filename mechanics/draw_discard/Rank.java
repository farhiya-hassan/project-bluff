public Rank {
    /*
    for comparing ranks to each other to determine which is better or worse.
    not the most applicable rn, but a feature later for comparing player's hands
     */
    // Char instead of String, so that we can use the shortened form
    // (ex. "K" instead of "King")
    char rank;
    public Rank(char rank) {
        this.rank = rank;
    }
    // TODO: Learn how to override and implement compare to for comparing high cards
    public compareTo() {

    }
}