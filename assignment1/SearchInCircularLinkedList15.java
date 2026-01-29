package assignment1;

public class SearchInCircularLinkedList15 {


        // Q15: البحث عن عنصر في Circular Linked List وإرجاع موقعه (Position)
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

        // Q15: دالة البحث (0-based index)، ترجع -1 إذا لم يتم العثور على العنصر
        static int search(Node head, int target) {

            if (head == null) {
                return -1;
            }

            Node current = head;
            int position = 0;

            do {
                if (current.data == target) {
                    return position;
                }
                current = current.next;
                position++;
            } while (current != head);

            return -1;
        }

        // طباعة عناصر القائمة (بعدد محدد لتجنب loop لا نهائي)
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
            head = addLast(head, 40);

            System.out.print("Circular list: ");
            printList(head, 8);

            int target = 30;

            // تنفيذ البحث
            int pos = search(head, target);

            if (pos != -1) {
                System.out.println("Element " + target + " found at position: " + pos);
            } else {
                System.out.println("Element " + target + " not found.");
            }
        }
    }

