/*
* This is a class that pushes
* and prints out elemetns.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-18
*/

import java.util.ArrayList;

public final class MrCoxallStack {
    /** This is an ArrayList for stacking data. */
    private ArrayList<Integer> stackList = new ArrayList<Integer>();

    /**
    * This function pushes
    * elemets in to the ArrayList.
    * @param anElement
    */
    public void pushNumber(final int anElement) {
        this.stackList.add(anElement);
    }

    /** This function pritns out the elements in the ArrayList. */
    public void printStack() {
        for (int counter = 0; counter < this.stackList.size(); counter++) {
            System.out.println(this.stackList.get(counter));
        }
    }
}
