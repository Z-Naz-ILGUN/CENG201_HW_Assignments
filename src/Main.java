public class Main {

    public static void main(String[] args) {

        HospitalSystem hospital = new HospitalSystem();


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


        hospital.requestTreatment(1, false);
        hospital.requestTreatment(2, false);
        hospital.requestTreatment(3, false);
        hospital.requestTreatment(4, false);
        hospital.requestTreatment(5, false);

        hospital.requestTreatment(6, true);
        hospital.requestTreatment(7, true);
        hospital.requestTreatment(9, true);


        hospital.dischargeStack.push(new DischargeRecord(100));
        hospital.dischargeStack.push(new DischargeRecord(101));


        hospital.processNextTreatment();
        hospital.processNextTreatment();
        hospital.processNextTreatment();
        hospital.processNextTreatment();


        hospital.printSystemState();
    }
}
