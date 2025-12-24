// SINGLY LINKED LIST
public class PatientList {
    private PatientNode head; // FIRST NODE OF THE LINKED LIST
//ADDS PATIENT TO THE END OF THE LIST
    public void addPatient(Patient p) {
        PatientNode newNode = new PatientNode(p);
        if (head == null) { // IF THE LIST IS EMPTY NEW NODE BECOMES HEAD
            head = newNode;
            return;
        }
        PatientNode current = head;
        while (current.next != null) { // TRAVERSE TO LAST NODE
            current = current.next;
        }
        current.next = newNode; // ATTACH NEW NODE AT THE END
    }
// REMOVE PATIENT WITH ID NUMBER
    public boolean removePatient(int id){
        if(head == null) return false;

        if(head.data.id == id){
            head = head.next;
            return true;
        }
        PatientNode previous = head;
        PatientNode current = head.next;

        while(current != null){
            if(current.data.id == id){
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
    return false; // PATIENT NOT FOUND
    }
// FIND PATIENT WITH ID NUMBER
    public Patient findPatient(int id){
        PatientNode current = head;

        while( current != null){
            if(current.data.id == id) return current.data; //PATIENT FOUND
            current = current.next;
        }
        return null; //PATIENT NOT FOUND
    }
// PRINTS ALL PATIENTS
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        PatientNode current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}