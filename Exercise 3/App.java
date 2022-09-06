// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack ninja_turtles = new Stack(5);
  
      // Insert new elements into the stack
      ninja_turtles.push("MichaelAngelo");
      ninja_turtles.push("Donatello");
      ninja_turtles.push("Leonardo");
      ninja_turtles.push("Raphael");
  
      // Show the size of the stack
      System.out.println("The Brawn of the Team: " + ninja_turtles.size());
  
      // Show top element in the stack
      System.out.println("The Leader of the Team: " + ninja_turtles.peek());
  
      // Remove top element in the stack
      ninja_turtles.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      ninja_turtles.printStack();
  
      // Show top element in the stack
      System.out.println("The Leader of the Team: " + ninja_turtles.peek());
    }
  }
