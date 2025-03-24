package Collections;

import java.util.Scanner;

class RevNode {
    int value;
    RevNode left;
    RevNode right;

    public RevNode(int value) {
        this.value = value;
        this.left = this.right = null;

    }
}

class Revision {
    RevNode root;

    public Revision() {
        this.root = null;
    }

    public void insert(int value) {
        RevNode node = new RevNode(value);
        if (root == null) {
            root = node;
            return;
        }
        RevNode current = root;
        RevNode parent = null;
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
        RevNode current = root;
        RevNode parent = null;
        while (current != null && current.value != value) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            System.out.println("Value doesn't exist in the tree");
            return;
        }
        if (current.left != null && current.right != null) {
            RevNode successor = current.right;
            RevNode successorParent = current;
            while (successor.left != null) {
                successor = successor.left;
                successorParent = successor;
            }
            current.value = successor.value;
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }
        } else {
            RevNode successor;
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
        }
    }

    public void inorderTraversal() {
        inorder(root);
        System.out.println();
    }

    public void inorder(RevNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public void preorderTraversal() {
        preorder(root);
        System.out.println();
    }

    public void preorder(RevNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorderTraversal() {
        postorder(root);
        System.out.println();
    }

    public void postorder(RevNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        Revision tree = new Revision();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the choice to move forward:");
            System.out.println("1:Insert");
            System.out.println("2:delete");
            System.out.println("3:Inorder traversal");
            System.out.println("4:Preorder traversal");
            System.out.println("5:Postorder traversal");
            int choice = input.nextInt();
            int value;
            switch (choice) {
                case 1:
                    System.out.println("please Enter the value you want to insert");
                    value = input.nextInt();
                    while (value != 0) {
                        tree.insert(value);
                        value = input.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("please Enter the value you want to insert");
                    value=input.nextInt();
                    while(value!=0) {
                        tree.deleteByValue(value);
                        value = input.nextInt();
                    }
                    break;
                case 3:
                    tree.inorderTraversal();
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
                    break;
                default:

                    System.out.println("please Enter a valid choice");
                    break;
            }

        }
    }
}