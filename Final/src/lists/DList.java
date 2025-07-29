
package lists;
public class DList {
    private class DListNode {
        DListNode prev;
        DListNode next;
        int item;

        private DListNode(int value){
            this.item = value;
            this.prev = null;
            this.next = null;
        }

        private DListNode(int value, DListNode prev, DListNode next){
            this.item = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private DListNode sentFront;
    private DListNode sentBack;

    public DList(int value){
        sentFront = new DListNode(-1);
        sentBack = new DListNode(-1);

        DListNode headNode = new DListNode(value, sentFront, sentBack);

        sentFront.next = headNode;
        sentBack.prev = headNode;
    }

    public DList(){
        sentFront = new DListNode(-1);
        sentBack = new DListNode(-1, sentFront, null);
        sentFront.next = sentBack;
    }

    public void addFront(int value){
        DListNode newHead = new DListNode(value);
        newHead.prev = sentFront;

        DListNode currentHead = sentFront.next;
        currentHead.prev = newHead;

        sentFront.next = newHead;
        newHead.next = currentHead;
    }

    public void addLast(int value){
        DListNode newTail = new DListNode(value);
        newTail.next = sentBack;

        DListNode currentTrail = sentBack.prev;
        currentTrail.next = newTail;

        sentBack.prev = newTail;
        newTail.prev = currentTrail;
    }

    /*
        Question 2
     */
    public void partition() {
       // TODO
    }

    public boolean equals(Object o) {
        if(!(o instanceof DList)) {
            return false;
        }
        DListNode runner = this.sentFront.next;
        DListNode otherRunner = ((DList) o).sentFront.next;
        while(runner != null && otherRunner != null) {
            if(runner.item != otherRunner.item) {
                return false;
            }
            runner = runner.next;
            otherRunner = otherRunner.next;
        }
        return runner == null && otherRunner == null;
    }
}
