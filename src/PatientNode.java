public class PatientNode {
    public Patient data;
    public PatientNode next; //REFERENCE TO THE NEXT NODE
// CREATE A NEW NODE FOR THE LINKED LIST
    public PatientNode(Patient data){
        this.data = data;
        this.next = null;
    }
}
