/*
 * Mitchell Van Braeckel
 * 17/11/2016
 * Searching Exercise
    BookID class to store the list of books read from a txt file
        --> contains:
            a) book ID #
            b) book title
 */

package searchingex;

// imports

public class BookID {
        // ATTRIBUTES
    private int id;
    private String title;
        // CONSTRUCTORS
    /**
     * Default Constructor -- initializes a new BookID w/ default values for reference ID # and title
     */
    public BookID() {
        id = -1;
        title = "";
    }
    /**
     * Secondary Constructor -- creates a new BookID w/ full values
     * @param num the reference ID number of the book
     * @param name the title of the book
     */
    public BookID(int num, String name) {
        this();
        id = num;
        title = name;
    }
        // BEHAVIOURS
    /**
     * mutator method - changes the reference ID number of a book
     * @param num the new reference ID number of the book
     */
    public void setID(int num) {
        id = num;
    }
    /**
     * accessor method - retrieves the reference ID number of a book
     * @return the reference ID number of the book
     */
    public int getID() {
        return id;
    }
    /**
     * mutator method - changes the title of a book
     * @param name the new title of the book
     */
    public void setTitle(String name) {
        title = name;
    }
    /**
     * accessor method - retrieves the title of a book
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }
    // =========================================================================
    /**
     * comparator method -- compares two books to each other
     * @param other the other book being compared
     * @return true if they have the same reference ID number
     */
    public boolean equals(BookID other) {
        boolean same = false;
        if(other.getID() == id) {
            same = true;
        } //else (stay false) //end if
        return same;
    }
    /**
     * clone method -- creates an exact copy of a book
     * @return a full clone of the book
     */
    public BookID clone() {
        return new BookID(getID(), getTitle());
    }
    /**
     * retrieves all the info about a BookID
     * @return a string representation of the BookID
     */
    public String toString() {
        return    "ID:\t" + getID() +
                "\nTitle:\t" + getTitle();
    }
} // end bookID class
