package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements  Cloneable {
    private String shopName ;
    private List<Book> books = new ArrayList<>();

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        BookShop newBookShop = new BookShop();
        newBookShop.setShopName( this.shopName);
        List<Book> newBooks = new ArrayList<>();
        for (Book b :this.getBooks()) {
            newBooks.add(new Book(b.getBookId(), b.getBookName())) ;
        }
        newBookShop.setBooks(newBooks);
        return newBookShop ;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData( ) {
        for (int i = 0 ; i<5; i++) {
            Book b = new Book(i, "Book_" + i ) ;
//            b.setBookId(i) ;
//            b.setBookName( "book_" + i);
            books.add(b) ;
        }
    }
}
