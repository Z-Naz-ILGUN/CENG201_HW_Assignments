// PATIENT INFO
public class Patient {
    public int id;
    public String name;
    public int severity;
    public int age;
// CREATES A PATIENT OBJECT
    public Patient(int id, String name, int severity, int age){
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
// RETURNS PATIENT INFO AS STRING
    @Override
    public String toString(){
        return "PATIENT INFO [ ID: " + id + " | NAME: " + name + " | SEVERITY: "+ severity+ " | AGE: "+ age +"]";
    }

}
