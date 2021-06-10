package LinkedListImplementation;
/*
Created by Vamsi on 6/7/21 at 10:03 PM
*/
//Amazon Interview Question - Given a Linked List with a second pointer to a random node on the list, make a copy of it.


public class RandomHeadCopyLinkedList {

    public class RandomListNode
    {
        public int label;
        public RandomListNode next, random;
    }

    public RandomListNode copyRandom(RandomListNode head)
    {
        if (head == null)
            return head;

        RandomListNode now = head;

        while(now !=null)
        {
            RandomListNode copyCurr = new RandomListNode();
            copyCurr.label = now.label;
            copyCurr.next = now.next;
            now.next = copyCurr;
            now = now.next.next;
        }

        now = head;
        while(now!=null)
        {
            if(now.random != null)
            {
                now.next.random = now.random.next;
                now = now.next.next;
            }
        }

        RandomListNode copy = head.next;
        now = head;
        while(now.next != null)
        {
            RandomListNode res = now.next.next;
            now.next = now.next.next;
            now = now.next;
        }
        return copy;
    }

}
