public class TestPatient {


    public static void main(String[] args) {
        Patient[] patients = new Patient[7];
        System.out.println("1. the patients array has been created..");

        Patient p1 = new Adult(5,"Aziz", "123", 'M', 90, 175, 'Y','V');
        Patient p2 = new Child(5,"Nour", "111", 'F', 20 , 30, 'T');
        System.out.println("2. Two Patients have been created..");

        Doctor dr1 = new Doctor("555", "Ali", 'M');
        p1.addDoctor(dr1);
        System.out.println("3. Dr. Ali Has been add to patient Aziz..");

        p2.addDoctor(new Doctor("456", "Sara Ahmed", 'F'));
        System.out.println("4. Dr. Sara Has been add to patient Nour..");

        Patient p3;
        System.out.println("5. The third Patient has been created..");

        p3 = new Child(5, "Faisal", "789", 'M', 8,20, 'I');
        System.out.println("6. All the info of Patient Faisal is add..");

        p3.addDoctor(dr1);
        System.out.println("7. Dr. Ali Has been add to patient Faisal..");

        p1.addDoctor(new Doctor("121" , "Reem", 'F'));
        System.out.println("8.  Dr. Reem Has been add to patient Aziz..");

        patients[0] = p1;
        patients[1] = p2;
        patients[2] = p3;
        System.out.println("9. All Patiens have been add to patiens Array..");

        p1.calculateTypicalWeight();
        p2.calculateTypicalWeight();
        p3.calculateTypicalWeight();
        System.out.println("10. All patients weight have been calculated..");

        System.out.println("11. Patients Info: ");
        System.out.println("=======================================");
        for (int i = 0 ; i < 3 ; i++){
            patients[i].display();
        }





    }


}

