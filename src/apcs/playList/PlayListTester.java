package apcs.playList;
// This is the tester for part 0.

import apcs.playList.PlayList;

public class PlayListTester {
    public static void main(String[] args) {
        System.out.println ("Testing Constructor");
        PlayList aList = new PlayList (20);
        System.out.println ("size: " + aList.size());
        System.out.println ("max size: " + aList.capacity());
    }
}

