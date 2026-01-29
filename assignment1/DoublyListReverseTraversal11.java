package assignment1;

public class DoublyListReverseTraversal11 {

        // Q11: طباعة عناصر الـ Doubly Linked List بالعكس (من الأخير للأول)
        static class DNode {
            int data;
            DNode prev;
            DNode next;

            DNode(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        // إضافة عنصر في نهاية القائمة
        static DNode addLast(DNode head, int value) {
            DNode newNode = new DNode(value);

            if (head == null) {
                return newNode;
            }

            DNode current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;

            return head;
        }

        // الحصول على آخر عقدة (Tail)
        static DNode getTail(DNode head) {
            if (head == null) return null;

            DNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current;
        }

        // Q11: طباعة من الذيل إلى الرأس
        static void printReverse(DNode tail) {
            DNode current = tail;
            while (current != null) {
                System.out.print(current.data);
                if (current.prev != null) System.out.print(" <- ");
                current = current.prev;
            }
            System.out.println();
        }

        // طباعة من الرأس إلى الذيل (للتأكد فقط)
        static void printForward(DNode head) {
            DNode current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) System.out.print(" -> ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

            DNode head = null;
            head = addLast(head, 10);
            head = addLast(head, 20);
            head = addLast(head, 30);
            head = addLast(head, 40);

            System.out.print("Forward: ");
            printForward(head);

            DNode tail = getTail(head);

            System.out.print("Reverse: ");
            printReverse(tail);
        }
    }

