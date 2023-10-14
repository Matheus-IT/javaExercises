package librarycatalogue;

import java.util.Map;
import java.util.HashMap;

public final class LibraryCatalogue {
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1.0;

    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod,
                            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;        
    }
    
    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 756, 999999);

        bookCollection.put("Harry Potter", harry);
        
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setCurrentDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }

    private void nextDay() {
        setCurrentDay(getCurrentDay() + 1);
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }
    
    // INSTANCE METHODS
    
    public void checkOutBook(String title) {
        Book book = getBook(title);

        if (book.isCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " +
            (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());

        if (daysLate > 0) {
            System.out.println("You owe the library $" + getInitialLateFee() + daysLate * getFeePerLateDay() +
            " because your book is " + daysLate + " days late.");
        } else {
            System.out.println("Book returned, thank you!");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
        "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }
}
