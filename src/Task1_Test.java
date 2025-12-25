public class Task1_Test {

    public static void main(String[] args) {

        // CREATE PATIENT LIST
        PatientList patientList = new PatientList();

        // ADD 5 PATIENTS TO THE LIST
        patientList.addPatient(new Patient(1, "Gregory House", 5, 30));
        patientList.addPatient(new Patient(2, "James Wilson", 8, 45));
        patientList.addPatient(new Patient(3, "Lisa Cuddy", 3, 25));
        patientList.addPatient(new Patient(4, "Allison Cameron", 9, 60));
        patientList.addPatient(new Patient(5, "Robert Chase", 4, 35));

        // REMOVE ONE PATIENT BY ID
        System.out.println("Removing patient with ID 3");
        patientList.removePatient(3);

        // SEARCH FOR A PATIENT BY ID
        System.out.println("Searching for patient with ID 4");
        Patient found = patientList.findPatient(4);
        if (found != null) {
            System.out.println("Patient found: " + found);
        } else {
            System.out.println("Patient not found");
        }

        // PRINT FINAL PATIENT LIST
        System.out.println("\nFinal Patient List:");
        patientList.printList();
    }
}
/* Output:
Removing patient with ID 3
Searching for patient with ID 4
Patient found: PATIENT INFO [ ID: 4 | NAME: Allison Cameron | SEVERITY: 9 | AGE: 60]

Final Patient List:
PATIENT INFO [ ID: 1 | NAME: Gregory House | SEVERITY: 5 | AGE: 30]
PATIENT INFO [ ID: 2 | NAME: James Wilson | SEVERITY: 8 | AGE: 45]
PATIENT INFO [ ID: 4 | NAME: Allison Cameron | SEVERITY: 9 | AGE: 60]
PATIENT INFO [ ID: 5 | NAME: Robert Chase | SEVERITY: 4 | AGE: 35]
 */
