public class Task2_Test {

    public static void main(String[] args) {

        // CREATE TREATMENT QUEUE
        TreatmentQueue queue = new TreatmentQueue();

        // ADD 8 TREATMENT REQUESTS
        queue.enqueue(new TreatmentRequest(1, false));
        queue.enqueue(new TreatmentRequest(2, false));
        queue.enqueue(new TreatmentRequest(3, false));
        queue.enqueue(new TreatmentRequest(4, false));
        queue.enqueue(new TreatmentRequest(5, false));
        queue.enqueue(new TreatmentRequest(6, false));
        queue.enqueue(new TreatmentRequest(7, false));
        queue.enqueue(new TreatmentRequest(8, false));

        // PROCESS (DEQUEUE) 3 REQUESTS
        System.out.println("Processing 3 treatment requests:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // PRINT REMAINING QUEUE
        System.out.println("\nRemaining Treatment Queue:");
        queue.printQueue();
    }
}
/* Output:
Processing 3 treatment requests:
Request[ Patient ID1, priority: false]
Request[ Patient ID2, priority: false]
Request[ Patient ID3, priority: false]

Remaining Treatment Queue:
PRIORITY QUEUE
NORMAL QUEUE
Patient ID: 4
Patient ID: 5
Patient ID: 6
Patient ID: 7
Patient ID: 8
 */