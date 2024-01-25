package cristinapalmisani.BEU2W3L3.composite;

public class SinglePage implements Page{

    @Override
    public int getPagesNumber() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Single page");
    }
}
