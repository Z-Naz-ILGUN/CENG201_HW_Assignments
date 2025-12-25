public class Task4_Test {

    public static void main(String[] args) {

        // CREATE HOSPITAL SYSTEM
        HospitalSystem hospital = new HospitalSystem();

        // ADD 10 PATIENTS TO THE SYSTEM
        hospital.addPatient(new Patient(1, "Gregory House", 5, 30));
        hospital.addPatient(new Patient(2, "James Wilson", 8, 45));
        hospital.addPatient(new Patient(3, "Lisa Cuddy", 3, 25));
        hospital.addPatient(new Patient(4, "Allison Cameron", 9, 60));
        hospital.addPatient(new Patient(5, "Robert Chase", 4, 35));
        hospital.addPatient(new Patient(6, "Remy Hadley", 7, 50));
        hospital.addPatient(new Patient(7, "Chris Taub", 6, 28));
        hospital.addPatient(new Patient(8, "Eric Foreman", 2, 20));
        hospital.addPatient(new Patient(9, "Lawrence Kutner", 10, 70));
        hospital.addPatient(new Patient(10, "Amber Volakis", 1, 18));

        // ADD 5 NORMAL TREATMENT REQUESTS
        hospital.requestTreatment(1, false);
        hospital.requestTreatment(2, false);
        hospital.requestTreatment(3, false);
        hospital.requestTreatment(4, false);
        hospital.requestTreatment(5, false);

        // ADD 3 PRIORITY TREATMENT REQUESTS
        hospital.requestTreatment(6, true);
        hospital.requestTreatment(7, true);
        hospital.requestTreatment(9, true);

        // ADD 2 DISCHARGE RECORDS MANUALLY
        hospital.dischargeStack.push(new DischargeRecord(100));
        hospital.dischargeStack.push(new DischargeRecord(101));

        // PROCESS 4 TREATMENT REQUESTS (PRIORITY FIRST)
        hospital.processNextTreatment();
        hospital.processNextTreatment();
        hospital.processNextTreatment();
        hospital.processNextTreatment();

        // PRINT FINAL SYSTEM STATE
        hospital.printSystemState();
    }
}
/* Output:
Patients sorted by severity
PATIENT INFO [ ID: 4 | NAME: Allison Cameron | SEVERITY: 9 | AGE: 60]
PATIENT INFO [ ID: 2 | NAME: James Wilson | SEVERITY: 8 | AGE: 45]
PATIENT INFO [ ID: 5 | NAME: Robert Chase | SEVERITY: 4 | AGE: 35]
PATIENT INFO [ ID: 3 | NAME: Lisa Cuddy | SEVERITY: 3 | AGE: 25]
PATIENT INFO [ ID: 8 | NAME: Eric Foreman | SEVERITY: 2 | AGE: 20]
PATIENT INFO [ ID: 10 | NAME: Amber Volakis | SEVERITY: 1 | AGE: 18]
Treatment Queue
PRIORITY QUEUE
NORMAL QUEUE
Patient ID: 2
Patient ID: 3
Patient ID: 4
Patient ID: 5
Discharge Stack
Discharge Record [ Patient ID: 1 ]
Discharge Record [ Patient ID: 9 ]
Discharge Record [ Patient ID: 7 ]
Discharge Record [ Patient ID: 6 ]
Discharge Record [ Patient ID: 101 ]
Discharge Record [ Patient ID: 100 ]
 */