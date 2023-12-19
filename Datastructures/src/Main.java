import at.konstantin.Lists.LinkedList;
import at.konstantin.Lists.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("7");
        list.add("8");
        list.print();

        list.remove(6);

        System.out.println(" ");

        list.print();
    }
}