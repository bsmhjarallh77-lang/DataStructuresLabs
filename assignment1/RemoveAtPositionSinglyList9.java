package assignment1;

public class RemoveAtPositionSinglyList9 {


        // Q9: حذف عنصر من قائمة مرتبطة مفردة عند موقع (Position) معيّن
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

        // Q9: دالة لحذف عقدة من موقع محدد (0-based index)
        static Node removeAtPosition(Node head, int position) {

            if (head == null || position < 0) {
                return head;
            }

            // إذا كان الحذف من أول القائمة
            if (position == 0) {
                return head.next;
            }

            Node current = head;

            // الوصول للعقدة التي قبل موقع الحذف
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }

            // التأكد أن الموقع صحيح
            if (current.next != null) {
                current.next = current.next.next;
            }

            return head;
        }

        // طباعة عناصر القائمة
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

            System.out.print("Original list: ");
            printList(head);

            int positionToRemove = 2;

            // تنفيذ الحذف
            head = removeAtPosition(head, positionToRemove);

            System.out.print("List after removing position " + positionToRemove + ": ");
            printList(head);
        }
    }

