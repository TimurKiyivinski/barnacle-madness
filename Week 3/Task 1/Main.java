class Main
{

    public static void printBook(Book book)
    {
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println("");
    }

    public static void main(String [] args)
    {
        Book book1 = new Book("Muhammad", "How to Fly");
        Book book2 = new Book("Miss Nina", "How to get an HD in JAVA");
        printBook(book1);

        book1.setAuthor("James");
        printBook(book1);

        book1.setTitle("How to eat ice cream");

        printBook(book1);
        printBook(book2);
    }
}
