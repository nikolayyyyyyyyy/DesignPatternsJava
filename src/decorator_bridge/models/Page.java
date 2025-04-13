package decorator_bridge.models;

public class Page {

    private final int number;
    private final String text;

    public Page(int n, String text){
        this.number = n;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Number of page: %d, Content: %s",this.number,this.text);
    }
}
