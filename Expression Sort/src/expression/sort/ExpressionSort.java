/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expression.sort;

import java.util.Stack;

class Node {
    String data;
    Node left, right;

    public Node(String data) {
        this.data = data;
        left = right = null;
    }
}

public class ExpressionSort {

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    public static Node expressionTree(String postfix) {
        Stack<Node> st = new Stack<>();
        Node t1, t2, temp;

        String[] tokens = postfix.split(" "); // Split the expression by spaces

        for (String token : tokens) {
            if (!isOperator(token)) {
                temp = new Node(token);
                st.push(temp);
            } else {
                temp = new Node(token);

                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression!");
                }

                t1 = st.pop();
                t2 = st.pop();

                temp.left = t2;
                temp.right = t1;

                st.push(temp);
            }
        }

        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression!");
        }

        return st.pop();
    }

    public static void inorder(Node root) {
        if (root == null) return;

        boolean isOperator = isOperator(root.data);
        if (isOperator) System.out.print("(");  // Add parentheses for better readability

        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

        if (isOperator) System.out.print(")");
    }

    public static void main(String[] args) {
        String postfix = "a b n * + m l / - o q p * * + c k / +";

        try {
            Node root = expressionTree(postfix);
            System.out.print("Inorder Expression: ");
            inorder(root);
            System.out.println(); // Move to the next line
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
