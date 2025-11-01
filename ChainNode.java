public class ChainNode {

    ChainNode next;
    int data;

    ChainNode(int data) {
        this.data = data;
        this.next = null;
    } 

    ChainNode(int data, ChainNode next) {
        this.data = data;
        this.next = next;
    }
    
}
