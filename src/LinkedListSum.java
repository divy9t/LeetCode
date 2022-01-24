import java.sql.PreparedStatement;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class LinkedListSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9, null)))))));
        ListNode l2 = new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, null))));

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode next = null;
        int initialSum = l1.val + l2.val;

        int carry = 0;
        if (initialSum > 0) {
            carry = initialSum / 10;
            result.val = initialSum % 10;
        } else {
            result.val = 0;
        }

        ListNode nextOne = l1.next;
        ListNode nextTwo = l2.next;


        while (nextOne != null || nextTwo != null) {
            int sum;
            ListNode newNode = new ListNode();
            if (nextOne != null && nextTwo != null){
                sum = nextOne.val + nextTwo.val + carry;
                nextOne = nextOne.next;
                nextTwo  = nextTwo.next;

            }else if (nextOne != null){
                sum = nextOne.val + carry;
                nextOne = nextOne.next;
            }else {
                sum = nextTwo.val + carry;
                nextTwo = nextTwo.next;
            }

            if (sum > 0) {
                carry = sum / 10;
                newNode.val = sum % 10;
            }else{
                carry = 0;
                newNode.val = 0;
            }
            if (next == null){
                result.next = newNode;
                next = result.next;
            }else{
                next.next = newNode;
                next = newNode;
            }

        }

        if (carry != 0){
            ListNode reminder = new ListNode();
            reminder.val = carry;
            Objects.requireNonNullElse(next, result).next = reminder;
        }

        return result;

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
