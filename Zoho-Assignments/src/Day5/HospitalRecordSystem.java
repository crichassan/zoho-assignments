package Day5;
import java.util.Scanner;

// Base class
class MedicalRecord {
    protected String recordId;
    protected String patientName;
    protected String dateOfVisit;
    protected String diagnosis;

    // Input common details
    public void inputRecordDetails(Scanner scanner) {
        System.out.print("Enter Record ID: ");
        recordId = scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        patientName = scanner.nextLine();

        System.out.print("Enter Date of Visit (YYYY-MM-DD): ");
        dateOfVisit = scanner.nextLine();

        System.out.print("Enter Diagnosis: ");
        diagnosis = scanner.nextLine();
    }

    // Display method (to be overridden)
    public void displayRecord() {
        System.out.println("\nRecord ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

// Subclass for In-Patients
class InPatientRecord extends MedicalRecord {
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails(Scanner scanner) {
        inputRecordDetails(scanner);

        System.out.print("Enter Room Number: ");
        roomNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Room Charges per Day: ");
        roomCharges = Double.parseDouble(scanner.nextLine());
    }

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    // Override display method
    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: ₹" + roomCharges);
        System.out.println("Total Charges: ₹" + calculateTotalCharges());
    }
}

// Subclass for Out-Patients
class OutPatientRecord extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails(Scanner scanner) {
        inputRecordDetails(scanner);

        System.out.print("Enter Doctor Name: ");
        doctorName = scanner.nextLine();

        System.out.print("Enter Consultation Fee: ");
        consultationFee = Double.parseDouble(scanner.nextLine());
    }

    // Override display method
    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: ₹" + consultationFee);
    }
}

// Main class
public class HospitalRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Hospital Record System ====");
        System.out.print("Is the patient In-Patient or Out-Patient? (I/O): ");
        String type = scanner.nextLine().trim().toUpperCase();

        if (type.equals("I")) {
            InPatientRecord inPatient = new InPatientRecord();
            System.out.println("\n-- Enter In-Patient Details --");
            inPatient.inputInPatientDetails(scanner);
            System.out.println("\n-- In-Patient Medical Record --");
            inPatient.displayRecord();

        } else if (type.equals("O")) {
            OutPatientRecord outPatient = new OutPatientRecord();
            System.out.println("\n-- Enter Out-Patient Details --");
            outPatient.inputOutPatientDetails(scanner);
            System.out.println("\n-- Out-Patient Medical Record --");
            outPatient.displayRecord();

        } else {
            System.out.println("Invalid type entered!");
        }

        scanner.close();
    }
}
