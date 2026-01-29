package assignment1;

public class InsertInCircularLinkedList13 {


        // Q13: إدخال عقدة في موقع محدد داخل Circular Linked List
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // إضافة عنصر في نهاية القائمة الدائرية
        static Node addLast(Node head, int value) {
            Node newNode = new Node(value);

            if (head == null) {
                newNode.next = newNode; // الإشارة لنفسه (دائري)
                return newNode;
            }

            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
            return head;
        }

        // Q13: إدخال عنصر في موقع محدد (0-based index)
        static Node insertAtPosition(Node head, int value, int position) {

            Node newNode = new Node(value);

            // إذا كانت القائمة فاضية
            if (head == null) {
                newNode.next = newNode;
                return newNode;
            }

            // الإدخال في أول القائمة
            if (position == 0) {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.next = head;
                head = newNode;
                return head;
            }

            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
                if (current == head) {
                    return head; // الموقع خارج حدود القائمة
                }
            }

            newNode.next = current.next;
            current.next = newNode;

            return head;
        }

        // طباعة عناصر القائمة (نحدد عدد دورات لتجنب loop لا نهائي)
        static void printList(Node head, int count) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            for (int i = 0; i < count; i++) {
                System.out.print(current.data);
                if (i < count - 1) System.out.print(" -> ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

            Node head = null;
            head = addLast(head, 10);
            head = addLast(head, 20);
            head = addLast(head, 30);

            System.out.print("Original list: ");
            printList(head, 6);

            // إدخال عنصر في الموقع 1
            head = insertAtPosition(head, 15, 1);

            System.out.print("After insertion: ");
            printList(head, 7);
        }
    }
