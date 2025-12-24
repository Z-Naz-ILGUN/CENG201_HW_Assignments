public class TreatmentQueueNode {
    public TreatmentRequest data;
    public TreatmentQueueNode next;
//CREATE QUEUE NODE
    public TreatmentQueueNode(TreatmentRequest data){
        this.data = data;
        this.next = null;
    }
}
