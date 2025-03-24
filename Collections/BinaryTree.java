package Collections;

import java.util.Scanner;

class NodeForBinary {
    public int value;
    public NodeForBinary left;
    public NodeForBinary right;

    NodeForBinary(int value) {
        this.value = value;
        this.left = right = null;
    }
}

public class BinaryTree {
    NodeForBinary root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        NodeForBinary node = new NodeForBinary(value);
        if (root == null) {
            root = node;
            return;
        }
        NodeForBinary current = root;
        NodeForBinary parent = null;
        while (current != null) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return;
            }
        }
        if (value < parent.value) {
            parent.left = node;
        } else {
            parent.right = node;
        }

    }

    public void deleteByValue(int value) {
        NodeForBinary current = root;
        NodeForBinary parent = null;
        while (current != null && current.value != value) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            return;
        }
        //now the value have matched
        if (current.right == null || current.left == null) {//when the current node has atmost 1 child node
            NodeForBinary successor;
            if (current.left != null) {
                successor = current.left;
            } else {
                successor = current.right;
            }
            if (parent == null) {
                root = successor;
            } else if (parent.left == current) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
        }// if the node has two child nodes
        else {
            NodeForBinary successor = current.right;
            NodeForBinary successorParent = current;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            current.value = successor.value;
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }

        }
    }

    public void inOrderTraversal() {
        traversal(root);
    }

    public void traversal(NodeForBinary root) {
        if (root != null) {
            traversal(root.left);
            System.out.println(root.value + " ");
            traversal(root.right);
        }

    }

    public void preorderTraversal() {
        preorder(root);
        System.out.println();
    }

    public void preorder(NodeForBinary root) {
        if (root != null) {
            System.out.println(root.value);
            preorder(root.left);
            preorder(root.right);
        }

    }

    public void postorderTraversal() {
        postOrder(root);
        System.out.println();

    }

    public void postOrder(NodeForBinary root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the choice to proceed");
            System.out.println("1:Insert" +
                    "2:Delete" +
                    "3:Inorder traversal" +
                    "4:Preorder traversal" +
                    "5:Postorder traversal" +
                    "6:Exit"
            );
            int choice = input.nextInt();
            int value;
            switch (choice) {
                case 1:
                    System.out.println("Enter the value you want to insert, to stop inserting enter 0");
                    value = input.nextInt();
                    while (value != 0) {
                        tree.insert(value);
                        value = input.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Enter the value you want to delete, to stop deleting Enter 0");
                    value = input.nextInt();
                    while (value != 0) {
                        tree.deleteByValue(value);
                        value = input.nextInt();
                    }
                    break;
                case 3:
                    tree.inOrderTraversal();
                    break;
                case 4:
                    tree.preorderTraversal();
                    break;
                case 5:
                    tree.postorderTraversal();
                    break;

                case 6:
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("please enter a valid choice");
                    break;


            }
        }
    }
}
