package Leetcode_problems;

import java.util.Scanner;

// ListNode class representing a single node in the linked list
class ListNode {
    int val;        // Value stored in the node
    ListNode next;  // Pointer to the next node in the list

//    // Constructor with value and next node
//    public ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }

    // Constructor with only value
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Method to print the linked list
    public void printList() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to handle linked list creation and operations
public class listnode_demo {

    // Method to create a linked list from user input
    public static ListNode createListFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The list is empty.");
            return null;
        }

        System.out.println("Enter the values of the nodes:");
        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode; // First node becomes the head
                current = head;
            } else {
                current.next = newNode; // Link the new node
                current = current.next;
            }
        }

        return head; // Return the head of the linked list
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        System.out.println("Creating a linked list from user input...");
        ListNode head = createListFromInput();
        if (head != null) {
            System.out.println("The linked list is:");
            head.printList();
        }
    }
}


