public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public  String toString () {
        return "Название книги  " + bookName + "\n " + authorName + "\n Год выпуска книги   " + publishingYear;
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


}




