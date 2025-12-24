public class TreatmentQueue {
    private TreatmentQueueNode priorityFront;
    private TreatmentQueueNode priorityRear;
    private TreatmentQueueNode normalFront;
    private TreatmentQueueNode normalRear;
    private int size;
//INITIALIZE EMPTY QUEUE
    public TreatmentQueue(){
        priorityFront = priorityRear = null;
        normalFront = normalRear = null;
        size = 0;
    }
// CHECK IF QUEUE IS EMPTY
    public boolean isEmpty(){
        return size == 0;
    }
//ADD TREATMENT REQUEST TO QUEUE
    public void enqueue(TreatmentRequest request){
        TreatmentQueueNode newNode = new TreatmentQueueNode(request);
        if(request.isPriority){ //CHECK IF PATIENT IS PRIORITY
            if(priorityRear == null){
                priorityFront = priorityRear = newNode;
            }else{
                priorityRear.next = newNode; // LINK NEW NODE
                priorityRear = newNode; // UPDATE REAR
            }
        }else{ //IF NOT, NORMAL REQUEST
            if(normalRear == null) {
                normalFront = normalRear = newNode;
            }else {
                normalRear.next = newNode;
                normalRear = newNode;
            }
        }
        size++; //INCREASE SIZE

    }
// NEXT TREATMENT REQUEST
    public TreatmentRequest dequeue(){
        if(isEmpty())
            return null;

        TreatmentQueueNode temp;
        if(priorityFront != null) { //PRIORITY PATIENTS FIRST
            temp = priorityFront;
            priorityFront = priorityFront.next;

            if (priorityFront == null)
                priorityRear = null;
        }else { //PRIORITY PATIENTS ARE TREATED, THEN NORMAL PATIENTS ARE PLACED IN THE QUEUE
            temp = normalFront;
            normalFront = normalFront.next;

            if (normalFront == null)
                normalRear = null;
        }
        size --; //DECREASE SIZE
        return temp.data;
    }
    //RETURNS QUEUE SIZE
    public int size() {
        return size;
    }
//PRINTS QUEUES
    public void printQueue(){
        System.out.println("PRIORITY QUEUE");
        TreatmentQueueNode current = priorityFront;
        while(current != null){
            System.out.println("Patient ID: " + current.data.patientId);
            current = current.next;
        }

        System.out.println("NORMAL QUEUE");
        current = normalFront;
        while(current != null){
            System.out.println("Patient ID: "+ current.data.patientId);
            current = current.next;
        }
    }
}
