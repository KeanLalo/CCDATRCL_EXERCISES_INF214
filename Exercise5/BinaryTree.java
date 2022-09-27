public class BinaryTree {

    public static void main(String[] args) throws Exception {

        // Create root node A

        Node President = new Node("Lalo");

        // Create node B

        Node VicePresident = new Node("Dapitilio");

        // Create node C

        Node Secretary = new Node("Vargas");

        // Create node D

        Node Muse = new Node("Labon");

        // Create node E

        Node Escort = new Node("Aranilla");

        // Create node F

        Node Treasurer = new Node("Legaspi");

        // Create node G

        Node AIP = new Node("Verzosa");



        // Set left and right child of root node A

        President.left = VicePresident;

        President.right = Secretary;



        // Set left and right child of node B

        VicePresident.left = Muse;

        VicePresident.right = Escort;



        // Set left and right child of node C

        Secretary.left = Treasurer;

        Secretary.right = AIP;



        System.out.print("\nPre order Traversal: ");

        traversePreOrder(President);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(President);


    }

    // Traverse Preorder method

    static void traversePreOrder(Node node) {

        if (node != null) {

            System.out.print(" " + node.data);

            traversePreOrder(node.left);

            traversePreOrder(node.right);

        }

}
static void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);
    }
}

}
