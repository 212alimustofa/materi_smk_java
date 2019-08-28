import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector vectorStrings = new Vector<String>();
        vectorStrings.add("Object 1");
        vectorStrings.add("Object 2");
        vectorStrings.add("Object 3");
        vectorStrings.add("Object 4");
        vectorStrings.add("Object 5");

        Iterator iterator = vectorStrings.iterator()
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}