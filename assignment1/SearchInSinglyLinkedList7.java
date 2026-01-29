package assignment1;

public class SearchInSinglyLinkedList7 {

        // Q7: البحث عن عنصر في قائمة مرتبطة مفردة وإرجاع موقعه (Position)
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // إضافة عنصر في نهاية القائمة
        static Node addLast(Node head, int value) {
            Node newNode = new Node(value);

            if (head == null) {
                return newNode;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return head;
        }

        // Q7: دالة ترجع موقع العنصر (0-based). إذا ما لقى ترجع -1
        static int searchPosition(Node head, int target) {
            int position = 0;
            Node current = head;

            while (current != null) {
                if (current.data == target) {
                    return position;
                }
                current = current.next;
                position++;
            }

            return -1;
        }

        // طباعة القائمة
        static void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) System.out.print(" -> ");
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

            System.out.print("List: ");
            printList(head);

            int target = 30;

            // تنفيذ البحث
            int pos = searchPosition(head, target);

            if (pos != -1) {
                System.out.println("Element " + target + " found at position: " + pos);
            } else {
                System.out.println("Element " + target + " not found.");
            }
        }
    }

