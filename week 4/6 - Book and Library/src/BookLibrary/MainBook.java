package BookLibrary;
public class MainBook {
    public static void main(String[] args) {
        Book book1;
        book1 = new Book();
        book1.title = "Java Prigramming";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        
        book1.printDetails();
        System.out.println("-------------");
        book1.updatePrice(250);
        book1.markAsAvailable();
        book1.printDetails();
        System.out.println(book1.isPublishedAfter(2000));
        
    }
}
