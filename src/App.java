public class App {
    public static void main(String[] args) throws Exception {
       Solution solution = new Solution();
       
       
    }
}

class Node{
    int val;
    Node next;
    public Node(int value){
        this.val = value;
        this.next = null;
    }
    
    public int getValue() {
        return val;
    }
    public Node getNext() {
        return next;
    }
   
    
    
}
class Solution {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        int carry = 0;

        while(l1 != null || l2!=null|| carry!=0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        Node result = dummyHead.next;
        dummyHead.next = null;
        return result;


        
    }
}

