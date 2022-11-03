import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }


    public String getBookName() {
        return bookName;

    }

    public int getPublishingYear() {
        return publishingYear;
    }


    public void setPublishingYear() {
        this.publishingYear = 2022;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }

    @Override
    public String toString() {
        return
                "Название книги'" + bookName + '\'' + " \n"+
                " Автор книги - " + authorName.toString() + " \n" +
                " Год выпуска  " + publishingYear;

    }
}




