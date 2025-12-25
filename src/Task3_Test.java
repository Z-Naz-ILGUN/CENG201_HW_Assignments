public class Task3_Test {

    public static void main(String[] args) {

        // CREATE DISCHARGE STACK
        DischargeStack dischargeStack = new DischargeStack();

        // ADD 5 DISCHARGE RECORDS
        dischargeStack.push(new DischargeRecord(101));
        dischargeStack.push(new DischargeRecord(102));
        dischargeStack.push(new DischargeRecord(103));
        dischargeStack.push(new DischargeRecord(104));
        dischargeStack.push(new DischargeRecord(105));

        // PROCESS (POP) 2 DISCHARGE RECORDS
        System.out.println("Processing 2 discharge records:");
        System.out.println(dischargeStack.pop());
        System.out.println(dischargeStack.pop());

        // PRINT REMAINING STACK
        System.out.println("\nRemaining Discharge Stack:");
        dischargeStack.printStack();
    }
}
/* Output:
Processing 2 discharge records:
Discharge Record [ Patient ID: 105 ]
Discharge Record [ Patient ID: 104 ]

Remaining Discharge Stack:
Discharge Record [ Patient ID: 103 ]
Discharge Record [ Patient ID: 102 ]
Discharge Record [ Patient ID: 101 ]
 */