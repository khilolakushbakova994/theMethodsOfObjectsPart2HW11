public class Main {
    public static void main(String[] args) {
        String author2 = new String("Dan Brown");
        Author author = new Author("Guillaume", "Musso");
        Book book = new Book("The Da Vinci Code", author2, 2003);
        System.out.println("Название книги  "+ book.getBookName());
        System.out.println("Автор книги  " + book.getAuthorName());
        System.out.println("Год первой печати книги  " + book.getPublishingYear());

        System.out.println( author.toString());
        System.out.println( book.toString());



    }

}










