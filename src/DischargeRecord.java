public class DischargeRecord {
    int patientId; // DISCHARGED PATIENT ID
    long dischargeTime; //DISCHARGE TIME
// CREATE DISCHARGE RECORD
    public DischargeRecord(int patientId){
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
// RETURN DISCHARGE INFO
    @Override
    public String toString(){
        return "Discharge Record [ Patient ID: "+ patientId +" ]";
    }
}
