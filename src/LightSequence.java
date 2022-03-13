public class LightSequence {

// attributes not shown


    /**
     * The parameter seq is the initial sequence used for
     * <p>
     * the light display
     */

    public LightSequence(String seq) { /* implementation not shown */ }


    /**
     * Inserts the string segment in the current sequence,
     * <p>
     * starting at the index ind. Returns the new sequence.
     */

    public String insertSegment(String segment, int ind) { /* implementation not shown */
        return "hi";
    }


    /**
     * Updates the sequence to the value in seq
     */

    public void changeSequence(String seq) { /* implementation not shown */ }


    /**
     * Uses the current sequence to turn the light on and off
     * <p>
     * for the show
     */

    public void display() { /* implementation not shown */ }


    public static void main(String[] args) {
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
    }

}