public class Child extends Patient {

    private char ageGroup;


    public Child(int size, String name, String fileNum, char gender, double weight, double height, char ageGroup) {
        super(size, name, fileNum, gender, weight, height);
        this.ageGroup = ageGroup;
    }

    public void calculateTypicalWeight(){
        double BI;
        switch (this.ageGroup){
            case 'I':
                BI = 0.5;
                break;
            case 'T':
                BI = 1;
                break;
            default:
                BI = 1.3;
                break;
        }

        if(super.gender == 'M'){
            super.typicalWeight = 5 + (BI * (super.height / 10));
        }else {
            super.typicalWeight = 4 + (BI * (super.height / 10));
        }
    }

    public String toString() {
        return "File Number: " + super.getFileNum() +
                "\nPatient Name: " + super.name +
                "\nGender: " + super.gender +
                "\nWeight: " + super.weight +
                "\nHeight: " + super.height +
                "\nTypical Weight: " + super.typicalWeight +
                "\nType Of Patient: CHILD" +
                "\nAge Group: " + this.ageGroup;

    }

}

