package lists;
import java.util.Iterator;

public class SList<T>{
    protected class ListNode<T>{
        T item;
        ListNode next;

        private ListNode(T value){
            this.item = value;
            this.next = null;
        }

        private ListNode(T value, ListNode next){
            this.item = value;
            this.next = next;
        }
    }


    private ListNode sentinelNode;
    private int listSize;
    public SList(){
        sentinelNode = new ListNode(null);
        listSize = 0;
    }
    public SList(T value){
        ListNode headNode = new ListNode(value);
        sentinelNode = new ListNode(null, headNode);
        listSize = 1;
    }

    public void addFirst(T value){
        ListNode newheadNode = new ListNode(value, sentinelNode.next);
        this.sentinelNode.next = newheadNode;
        this.listSize += 1;
    }

    public T getFirst(){
        if(sentinelNode.next == null){
            return null;
        }
        return (T)sentinelNode.next.item;
    }

    public int size(){
        return listSize;
    }


    //Q3
    public void duplicate(int k) {
        // TODO
    }

    // Q4
    public void compressNodes() {
        // TODO
    }

    // Q5
    public SList<T> slice(int startIdx, int endIdx, int k) {
        // TODO
        return null;
    }

    /*
        Do not modify this method in any way.
     */
    public boolean equals(Object o) {
        if(o == null){
            return false;
        } else if(!(o instanceof SList)) {
            return false;
        }

        ListNode currentRunner = this.sentinelNode.next;
        ListNode oRunner = ((SList) o).sentinelNode.next;
        while(currentRunner != null && oRunner != null) {
            if(!currentRunner.item.equals(oRunner.item)) {
                return false;
            }
            currentRunner = currentRunner.next;
            oRunner = oRunner.next;
        }

        if(currentRunner == null && oRunner == null) {
            return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder stringRepr = new StringBuilder();
        ListNode runner = sentinelNode.next;
        while(runner != null){
            stringRepr.append(runner.item);
            if(runner.next != null){
                stringRepr.append(",");
            }
            runner = runner.next;
        }
        return stringRepr.toString();
    }
}
