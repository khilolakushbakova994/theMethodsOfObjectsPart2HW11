import java.util.Objects;

public class Book {
    private final String authorName;
    private final String bookName;
    private int publishingYear;

    public Book(String bookName, String authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
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
        return publishingYear == book.publishingYear && Objects.equals(authorName, book.authorName) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, publishingYear);
    }

    public String toString () {
        return "Название книги  " + bookName + "\n Писатель  " + authorName + "\n Год выпуска книги   " + publishingYear;

    }

}


