import java.util.Date;

public class Book implements Comparable<Book>{

    private String bookName;
    private int pageNumber;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int pageNumber, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getPageNumber(){
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }



}
