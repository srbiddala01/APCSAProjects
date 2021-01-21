package apcs.playList;

/**
 * The PlayList class allows the client to modify a playlist of songs with a number of playlist management methods operations from custom methods including those to add songs to the playlist, retrieve/print the playlist, change songs, and remove songs.
 * (among other functions). This class utilizes arrays to keep track of the songs, plays, and other aspects of the playlist.
 @author Shriya Biddala and Vasilisa Malenkiy
 */
public class PlayList {
    private String[] songs;
    private int[] plays;
    private int size;

    /**
     * This is a constructor; it initializes the size of both Songs and Plays arrays to the variable capacity.
     * Precondition: The capacity specified is in the playlist.
     *@param capacity The actual size of both Songs and Plays arrays.
     */
    public PlayList(int capacity) {
        songs = new String[capacity];
        plays = new int[capacity];
        size = 0;
    }

    /**
     * Accesses the sizes (the number of elements in both arrays regardless of their capacity) of both the songs and the number of plays arrays.
     * Post-condition: The size of the array (not the capacity) would be returned once this method's called.
     * @return Returns the current size of the playlist.
     */
    public int size() {
        return size;
    }

    /**
     * Sets the length of the songs array.
     * Post-condition: The capacity (the designated length of the songs array- songs.length) would be returned once this method's called.
     * @return The current length of the songs array.
     */
    public int capacity() {
        return songs.length;
    }

    /**
     * Allows the user to add their songs into the songs array.
     * Preconditions: song_name specified is in the playlist. An exception would occur if the playlist is full.
     * Post-conditions: The size of the songs array increments by 1 once a song has been added to the songs array.
     * @param song_name The name of the song that the user inputs.
     * @throws RuntimeException if the playlist if the playlist is full.
     */
    public void add(String song_name) {
        if (size < songs.length) {
            songs[size] = song_name;
            size++;
        } else if (size == songs.length) {
            throw new RuntimeException("Sorry. The Playlist is full.");
        }
    }

    public String toString() {
        String info = "";
        if (size == 0) {
            info = "Your playlist is empty";
        } else {
            for (int i = 0; i < size; i++) {
                info = info + '\n' + i + ": " + "Title: " + songs[i] + "; " + "Plays: " + plays[i];
            }
        }
        return info;
    }

    /**
     * Allows the user to access a particular song at its index of the songs array. Throws an exception if the requested index is out of bounds, hence "the requested index (the song's location) is out of bounds".
     * Precondition: The index specified is in the playlist. Index must be greater than 0 and less than size.
     * @param index The index where the requested song is at.
     * @return Returns the index of where the requested song is located in the array.
     * @throws RuntimeException if the requested index is out of bounds for the size.
     */
    public String getSong(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("The requested index is out of bounds");
        }
        return songs[index];
    }

    /**
     * Returns the value of the plays array stored at the specified index. Throws an exception if the requested index is out of bounds, hence "the requested index (the song's location) is out of bounds".
     * Precondition: The index specified is in the playlist. Index must be greater than 0 and less than size.
     * @param index The location (index) where the requested play resides within the plays array.
     * @return the value of the plays array stored at the specified index
     * @throws RuntimeException if the requested index is out of bounds for the size.
     */
    public int getPlays(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("The requested index is out of bounds");
        }
        return plays[index];
    }

    /**
     * "Plays" the song that was requested by the client. Throws an exception if the requested song isn't within the songs array, hence "the requested index (the song's location) is out of bounds".
     * Precondition: The index specified is in the playlist. The index must be greater than zero and less than size.
     * Post-condition: The number of plays (play count) for that song is incremented by 1.
     * @param index The location (index) where the requested song is located at within the songs array.
     * @return Returns the song at the index where the requested song is located at.
     * @throws RuntimeException if the requested index is out of bounds for the size.
     */
    public String play(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("The requested index is out of bounds");
        } else {
            plays[index]++;
            return songs[index];
        }
    }
    /**
     * Accepts a String of song name, loops through the songs array and if an item in the songs array that matches the name parameter, the method returns the index of the matching song.
     * Precondition: The songName specified is in the playlist
     * @param songName The name of the song the user wants the index of in the songs array.
     * @return The index of the song that matches the songName parameter. If no song in the songs array matches the songName parameter, the method returns -1.
     */
    public int indexOf(String songName) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes the song at the requested index. Throws an exception if the requested index is out of bounds, hence "the requested index (the song's location) is out of bounds".
     * Precondition: The index specified is in the playlist. The index must be greater than zero and less than capacity()
     * Post-condition: The song and plays at the specified index are removed, thus size of both array decrease by 1.
     * @param index The requested location (index) where the user wants the song to be removed, within the songs array.
     * @throws RuntimeException if the requested index is out of bounds for the size.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("The requested index is out of bounds");
        } else {
            for (int i = index; i < songs.length - 1; i++) {
                songs[i] = songs[i + 1];
            }
            songs[songs.length - 1] = "";

            for (int i = index; i < plays.length - 1; i++) {
                plays[i] = plays[index + 1];
            }
            plays[plays.length - 1] = 0;
            size--;
        }

    }
    /**
     * Allows the user to add songs to an index (location) of their playlist while recording the number of times it has been played. Throws an exception if the songs array is full and/or the requested location isn't within the songs array.
     * Precondition: The index and songName specified are in the playlist. The index must be greater than zero and less than capacity(). The size must not equal the capacity.
     * Post-condition: The size of both arrays increment by 1.
     * @param index Keeps track of the index of the item.
     * @param songName The name of the song the user wants to add the location of.
     * @throws RuntimeException if the requested index is out of bounds for the size.
     * @throws RuntimeException if the playlist is full.
     */
    public void add(int index, String songName) {
        if (index < 0 || index > capacity()) {
            throw new RuntimeException("The requested index is out of bounds");
        } else if (size == capacity()) {
            throw new RuntimeException("Your playlist is full!");
        } else {
            for (int i = songs.length - 1; i > index; i--) {
                songs[i] = songs[i - 1];
            }
            songs[index] = songName;
            for (int i = plays.length - 1; i > index; i--) {
                plays[i] = plays[i - 1];
            }
            plays[index] = 0;
        }
        size++;
    }

    /**
     * Sets the index (location) of a song the user inputs (the user can set the location of their songs in their playlist), after the user adds it.
     * Precondition: The index and songName specified are in the playlist. The index where the user wants their song to be set at shouldn't exceed the length of the songs and plays arrays (a.k.a capacity).
     * Post-condition: The songName is assigned to the song at the specified index and the plays at the specified index set to zero.
     * @param index The index where the song is going to be set at.
     * @param songName The name of the song the user want to set into the songs array.
     * @throws RuntimeException if the requested index is invalid.
     */
    public void set(int index, String songName) {
        if (index < 0 || index > capacity()) {
            throw new RuntimeException("The requested index is invalid");
        }
        songs[index] = songName;
        plays[index] = 0;
    }

    /**
     * Find the client's favorite songs based on the number of times it was played (referring to the plays array).
     * Precondition: The client's playlist shouldn't be empty.
     * Post-condition: The client's favorite song, based on the number of times it has been played, would be printed to the console.
     * @return The name of the client's favorite song.
     * @throws RuntimeException if the playlist is empty.
     */
    public String getFavorite() {
        int max = plays[0];
        int maximum = 0;

        if (size == 0) {
            throw new RuntimeException("Your playlist is empty");
        }
        else {
            for (int i = 0; i < size ; i++){
                if (plays[i] > max) {
                    max = plays[i];
                    maximum = i;
                }
            }
        }
        return songs[maximum];
    }
}