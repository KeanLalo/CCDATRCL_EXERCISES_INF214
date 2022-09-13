
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your SURNAME.
    char[] surname = { 'L', 'A', 'L', 'O' };

    // 2. Display each character of your SURNAME on each line.
    for (int i = 0; i < surname.length; i++) {
        System.out.println(surname[i]);
    }

    // 3. Display the first character of your SURNAME.
    System.out.println(surname[0]);

    // 4. Display the last character of your SURNAME.
    System.out.println(surname[3]);

    // 5. Display the character of your SURNAME in reverse order.
    for (int i = surname.length - 1; i >= 0; i--) {
        System.out.println(surname[i]);
    }

    // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> studentNumber = new LinkedList<>();

    studentNumber.add("1");
    studentNumber.add("0");
    studentNumber.add("0");
    studentNumber.add("9");
    studentNumber.add("1");
    studentNumber.add("3");

    // 2. Add an asterisk (*) to the head/front of the Linked list.
    studentNumber.addFirst("*");
    
    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    studentNumber.addLast("*");
    System.out.println(studentNumber);
  
    // 4. Display the Linked list.
    System.out.println(studentNumber.get(7));

    // 5. Display the last character of the Linked list.
    studentNumber.set(7, "!");

    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
    studentNumber.set(7, "!");

    // 7. Remove the first character of the Linked list.
    studentNumber.remove("*");

    // 8. Display the LinkedList.
    System.out.println(studentNumber);

    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    Stack<String> name = new Stack<>();

        name.push("L");
        name.push("A");
        name.push("L");
        name.push("O");
    
    // 2. Print the Stack.
    System.out.println(name);

    // 3. Add a "INF214" to the stack.
    name.push("I");
    name.push("N");
    name.push("F");
    name.push("2");
    name.push("1");
    name.push("4");

    // 4. Print the Stack.
    System.out.println(name);

    // 5. Remove "INF214".
    name.remove("I");
    name.remove("N");
    name.remove("F");
    name.remove("2");
    name.remove("1");
    name.remove("4");

    // 6. Add "CCDATRCL-INF214".
    name.push("C");
    name.push("C");
    name.push("D");
    name.push("A");
    name.push("T");
    name.push("R");
    name.push("C");
    name.push("L");
    name.push("-");
    name.push("I");
    name.push("N");
    name.push("F");
    name.push("2");
    name.push("1");
    name.push("4");

    // 7. Print the Stack.
    System.out.println(name);
    

    }
}
