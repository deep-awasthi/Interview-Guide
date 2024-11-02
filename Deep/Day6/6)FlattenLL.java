//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}


// } Driver Code Ends
// User function Template for Java

class FlattenLL {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if(root==null){
            return root;
        }
        
        root.next = flatten(root.next);
        root = merge(root, root.next);
        return root;
    }
    
    Node merge(Node a, Node b){
        Node temp = new Node(0);
        Node res = temp;
        while(a!=null && b!=null){
            if(a.data>b.data){
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
            else {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            }
        }
        
        if(a!=null){
            temp.bottom = a;
        }
        if(b!=null){
            temp.bottom = b;
        }
        
        
        return res.bottom;
    }
}

//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.bottom;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        while (t-- > 0) {
            String[] workArray = sc.nextLine().trim().split(" ");
            int n = workArray.length;

            Node head = null;
            Node pre = null;

            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(workArray[i]);
                int data = sc.nextInt();
                Node temp = new Node(data);
                if (head == null) {
                    head = temp;
                    pre = temp;
                } else {
                    pre.next = temp;
                    pre = temp;
                }

                Node preB = temp;
                for (int j = 0; j < m - 1; j++) {
                    int tempData = sc.nextInt();
                    Node tempB = new Node(tempData);
                    preB.bottom = tempB;
                    preB = tempB;
                }
            }

            // Consume the remaining newline if there's any
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            Solution ob = new Solution();
            Node root = ob.flatten(head);
            printList(root);
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends
