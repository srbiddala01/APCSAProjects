package apcs.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ALSearch {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> ints = new ArrayList<Integer> ();
        // fill with random values
        for (int i=0; i<20; i++) {
            ints.add ((int)(Math.random()*20));
        }
        // print list
        System.out.println ("The list is: \n"+ints);

        // search for all possible values
        for (int i=0; i<20; i++) {
            int loc = ints.indexOf(i);
            System.out.println ("The value " + i + " is at position " + loc);
        }

        System.out.println ("\nRepeating using your linearSearch");
        // repeat using your own linearSearch method
        for (int i=0; i<20; i++) {
            int loc = linearSearch(ints, i);
            System.out.println ("The value " + i + " is at position " + loc);
        }

        System.out.println ("\nSorting List");
        // sort the list
        Collections.sort(ints);

        // print list
        System.out.println ("The list is now: \n"+ints);

        System.out.println ("\nRepeating using your binarySearch");
        // repeat using your own binarySearch method
        for (int i=0; i<20; i++) {
            int loc = binarySearch(ints, i);
            System.out.println ("The value " + i + " is at position " + loc);
        }
    }

    public static int linearSearch (ArrayList<Integer> vals, Integer item) {
        // loop through the arraylist
        // for each item in the list, check to see if it is the item
        // if it is, immediately return its position
        // if you go through the entire loop without finding it, return -1
        for (int i = 0; i < vals.size(); i++){
            if (vals.get(i) == item){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (ArrayList<Integer> vals, Integer item) {
        // set up a start and end index to 0 and size()-1
        int startIndex = 0;
        int endIndex = vals.size() - 1;
        // repeat as long as start and end are valid index values (end must be >= start)
        while (startIndex <= endIndex){
            int midIndex = ((startIndex + endIndex)/2);
            if(vals.get(midIndex) == item) {
                return midIndex;
            } else if (vals.get(midIndex) < item){
                endIndex = startIndex + 1;
            } else{
                startIndex = midIndex - 1;
            }
        }
        //   check the value at the midpoint to see if it the item
        //   if it is, return its position (the midpoint)
        //   if item comes "before" the midpoint, adjust the end index to narrow the search range by half
        //   if item comes "after" the midpoint, adjust the start index to narrow the search range by half

        return -1;
    }
}

