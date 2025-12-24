public class TreatmentRequest {
    public int patientId;
    public long arrivalTime;
    public boolean isPriority;
//CREATE TREATMENT REQUEST
    public TreatmentRequest(int patientId, boolean isPriority){
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.isPriority = isPriority;
    }
// RETURN TREATMENT REQUEST INFO
    @Override
    public String toString(){
        return "Request[ Patient ID" + patientId + ", priority: "+ isPriority +"]";
    }
}
