public class DischargeStackNode {
    DischargeRecord data; // DISCHARGE INFO
    DischargeStackNode next;
// CREATE STACK NODE
    public DischargeStackNode(DischargeRecord data){
        this.data = data;
        this.next = null;
    }
}