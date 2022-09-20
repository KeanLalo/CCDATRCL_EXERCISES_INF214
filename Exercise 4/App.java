import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> ClassList = new LinkedList<>();

        // Enqueue 5 classmates
        ClassList.add("Kean Jerald I. Lalo");
        ClassList.add("Kean John Daptilio");
        ClassList.add("James Francis Jalalon");
        ClassList.add("Carlos Leslie Legaspi");
        ClassList.add("Jenina Velle Masangcay");

        // get size of the queue
        System.out.println(ClassList.size());

        // get front of the queue
        System.out.println(ClassList.peek());

        // dequeue 5 class mates
        ClassList.remove();
        ClassList.remove();
        ClassList.remove();
        ClassList.remove();
        ClassList.remove();
       
        // enqueue another 5 classmates
        ClassList.add("Jul Seth Mari Mercado");
        ClassList.add("J-Rhyzz Tanghal");
        ClassList.add("Tristan Angelo Teneferie");
        ClassList.add("Gavin Kyle Torres");
        ClassList.add("Ma. Teresa Jesmari Erl Labon");

        // display all elements of the queue.
        System.out.println(ClassList.size());

        //get front of the queue
        System.out.println(ClassList.peek());
    }
}
