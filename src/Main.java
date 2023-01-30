import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>(new OrderBookNameComparator());

        Book book1 = new Book("Tehlikeli Oyunlar", 100, "Oğuz Atay", 2005);
        Book book2 = new Book("Devlet", 200, "Platon", 1600);
        Book book3 = new Book("Dönüşüm", 80, "Franz Kafka", 2000);
        Book book4 = new Book("Kürk Manyolu Madonna", 150, "Sabahattin Ali", 2010);
        Book book5 = new Book("Nutuk", 543, "Mustafa Kemal Atatürk", 1927);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Iterator<Book> itr = books.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next().getBookName());
        }

        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        books2.addAll(books);

        Iterator<Book> itr2 = books2.iterator();
        System.out.println("------------------------");
        while (itr2.hasNext()) {
            System.out.println(itr2.next().getBookName());
        }
    }
}
