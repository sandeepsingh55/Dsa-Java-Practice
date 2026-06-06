package LInkedlist;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // method for adding first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // method for adding last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // mthod for traversing
    public void printlist() {
        Node temp = head;
        if (head == null) {
            System.out.println("linked lis is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // METHOD FOR ADDING AT SPECIFIC INDEX
    public void addatmiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnNode.next = temp.next;
        temp.next = newnNode;
    }

    // method for removing first
    public int removefirst() {
        if (size == 0) {
            System.out.println("empty list");

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // METHOD FOR REMOVING FROM LAST
    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empth");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // METHOD FOR SEARCHING KEY IN LL
    public static int searchinLL(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    // METHODS FOR REVERSING LINKEDLIST
    public void reveselis() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // METHODS FOR REMOVING NTH NODE FROM LAST
    public void removeNth(int n) {
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        int i = 1;
        int toFind = sz - n;
        Node prev = head;
        while (i < toFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // FINDING MID NODE
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // check palimdrome
    public boolean checkpalimdrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // 1st step
        Node midNode = findmid(head);
        // 2nd step to reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step 3 check left half to right half
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public boolean detectloop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // method for removing loop
    public static void removecycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        // 1 step to detech cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == true) {
            return;
        }
        // 2 finding meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public void zigzaglist() {
        // find mid node
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse node
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alteranate merging
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // update
            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        // l.addFirst(1);
        // l.addFirst(2);
        // l.addFirst(3);
        // l.addLast(4);
        // l.addLast(5);
        // l.addFirst(88);
        // l.addFirst(20);
        // l.addatmiddle(9, 3);
        // l.removefirst();
        // l.removelast();
        // System.out.println(l.size);
        // l.printlist();
        // int res = searchinLL(5);
        // System.out.println(res);
        // l.reveselis();
        // l.removeNth(3);
        // l.addFirst(5);
        // l.addFirst(23);
        // l.printlist();
        // l.addFirst(1);
        // l.addFirst(2);
        // l.addFirst(2);
        // l.addFirst(1);
        // l.printlist();
        // System.out.println(l.checkpalimdrome());
        // System.out.println(l.detectloop());
        // System.out.println(l.removefirst());
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.printlist();
        l.zigzaglist();
        l.printlist();

    }

}
