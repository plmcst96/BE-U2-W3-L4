package cristinapalmisani.BEU2W3L3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Author dante = new Author("Dante Alighieri");
        Author giacomo = new Author("Giacomo Leopardi");

        Page page1 = new SinglePage();
        Page page2 = new SinglePage();
        Page page3 = new SinglePage();
        Page page4 = new SinglePage();
        Section section1 = new Section();
        Section section2 = new Section();
        section1.addPage(page1);
        section1.addPage(page2);
        section2.addPage(page1);
        section2.addPage(page2);
        section2.addPage(page3);
        section2.addPage(page4);

        Book book = new Book();
        book.addAuthor(dante);
        book.addAuthor(giacomo);
        book.addPage(page1);
        book.addPage(page2);
        book.addPage(page3);
        book.addPage(section1);
        book.addPage(section2);

        book.print();
        System.out.println("Pages number: " + book.getPagesNumber());
    }
}
