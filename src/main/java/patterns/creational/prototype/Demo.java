package patterns.creational.prototype;

import java.util.List;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop() ;
        bs.setShopName("NewStore");
        bs.loadData();
        System.out.println(bs);
        for (Book b: bs.getBooks()      ) {
            System.out.println(b);
        }
        bs.getBooks().remove(1) ;
        BookShop bs1 =(BookShop) bs.clone()  ;
        bs1.setShopName("BookStore2");
        System.out.println(bs1);
        Book nb = new Book(11, "Book11");
//        nb.setBookId( 11);
//        nb.setBookName("Book11");
        List<Book> newList = bs1.getBooks() ;
        newList.add(nb) ;
        bs1.setBooks(newList);

        System.out.println(bs1);
        System.out.println(bs);
        for (Book b: bs1.getBooks()      ) {
            System.out.println(b);
        }

        for (Book b: bs.getBooks()      ) {
            System.out.println(b);
        }
    }
}
