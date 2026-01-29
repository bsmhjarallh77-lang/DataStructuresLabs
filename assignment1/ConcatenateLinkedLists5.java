package assignment1;

public class ConcatenateLinkedLists5 {

        // Q5: ربط قائمتين مرتبطتين (Singly Linked List) مع بعض
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

        // Q5: دالة لدمج/ربط قائمتين (تلصق الثانية بعد الأولى)
        static Node concatenate(Node head1, Node head2) {
            if (head1 == null) return head2;

            Node current = head1;
            while (current.next != null) {
                current = current.next;
            }
            current.next = head2;
            return head1;
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

            // إنشاء القائمة الأولى
            Node head1 = null;
            head1 = addLast(head1, 1);
            head1 = addLast(head1, 2);
            head1 = addLast(head1, 3);

            // إنشاء القائمة الثانية
            Node head2 = null;
            head2 = addLast(head2, 4);
            head2 = addLast(head2, 5);

            System.out.print("List 1: ");
            printList(head1);

            System.out.print("List 2: ");
            printList(head2);

            // دمج القائمتين
            Node mergedHead = concatenate(head1, head2);

            System.out.print("After concatenation: ");
            printList(mergedHead);
        }
    }

