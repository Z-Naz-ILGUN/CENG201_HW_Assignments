import java.util.HashMap;
public class HospitalSystem {
    PatientList patientList = new PatientList(); //PATIENT LINKED LIST
    TreatmentQueue treatmentQueue = new TreatmentQueue(); // TREATMENT QUEUE
    DischargeStack dischargeStack = new DischargeStack(); // DISCHARGE HISTORY

    HashMap<Integer, Patient> patientMap = new HashMap<>();
// ADD PATIENT TO THE SYSTEM
    public void addPatient(Patient p){
        patientList.addPatient(p); // ADD TO LINKED LIST
        patientMap.put(p.id, p); // ADD TO HASHMAP
    }
//CREATE TREATMENT REQUEST
    public void requestTreatment(int patientId, boolean priority){
        treatmentQueue.enqueue(new TreatmentRequest(patientId, priority));
    }
// PROCESS NEXT TREATMENT REQUEST
    public void processNextTreatment(){
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request == null)
            return;

        Patient p = patientMap.get(request.patientId);
        if(p != null)
            dischargeStack.push(new DischargeRecord(p.id)); // RECORD DISCHARGE
            patientList.removePatient(p.id); // REMOVE PATIENT FROM PATIENT LIST
            patientMap.remove(p.id); // REMOVE PATIENT FROM MAP
    }
// CONVERT PATIENT MAP TO ARRAY
    private Patient[] getPatientAsArray(){
        int count = patientMap.size();
        Patient[] array = new Patient[count];

        int i = 0;
        for (Patient p : patientMap.values()){
            array[i++] = p;
        }
        return array;
    }
// ARRAYS CAN BE SORTED, HASHMAPS CAN'T. NOW WE ARE GOING TO USE BUBBLE SORT TO SORT PATIENTS BY SEVERITY (DESCENDING)
    private void bubbleSortBySeverity(Patient[] array){
        int n = array.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(array[j].severity < array[j+1].severity){ //IF CURRENT PATIENT'S SEVERITY IS LOWER THAN NEXT PATIENT
                    Patient temp = array[j];
                    array[j] = array[j+1]; //MOVE HIGHER SEVERITY PATIENT FORWARD
                    array[j+1] = temp; // MOVE LOWER SEVERITY PATIENT AFTER
                }
            }
        }
    }
// PRINT COMPLETE SYSTEM STATE
    public void printSystemState(){
        System.out.println("SYSTEM STATE");

        Patient[] patients = getPatientAsArray();
        bubbleSortBySeverity(patients);

        System.out.println("Patients sorted by severity");
        for(Patient p: patients){
            System.out.println(p);
        }

        System.out.println("Treatment Queue");
        treatmentQueue.printQueue();

        System.out.println("Discharge Stack");
        dischargeStack.printStack();
    }
}
