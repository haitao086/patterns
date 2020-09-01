package creational.prototype;

public final class Book {
    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }

    public String getBookName() {
        return bookName;
    }

//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }

    @Override
    public String toString() {
//        return super.toString();
        return "Book [bookId = " + bookId +", bookName = " + bookName +"]" ;
    }

    public Book(int id, String name) {
        this.bookId = id;
        this.bookName = name;
    }
}
