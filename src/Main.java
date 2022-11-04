public class Main {
    public static void main(String[] args) {

        Author author = new Author("Guillaume", "Musso");
        Book book2 = new Book ( "After", author, 2003);
        Author author2 = new Author("Dan" , "Brown");
        Book book = new Book("The Da Vinci Code", author2, 2003);

        System.out.println( author.toString());
        System.out.println();
        System.out.println( book.toString());


    }

}










