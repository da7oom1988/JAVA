public class Adult extends Patient {

    private char level, diet;


    public Adult(int size, String name, String fileNum, char gender, double weight, double height, char level, char diet) {
        super(size, name, fileNum, gender, weight, height);
        this.level = level;
        this.diet = diet;
    }


    public void calculateTypicalWeight(){
        double BI;
        switch (this.level){
            case 'Y':
                BI = 2;
                break;
            case 'M':
                BI = 2.5;
                break;
            default:
                BI = 3;
                break;
        }

        if(super.gender == 'M'){
            super.typicalWeight = 50 + (BI * (super.height / 10));
        }else {
            super.typicalWeight = 45 + (BI * (super.height / 10));
        }
    }

    public String toString() {
        return "File Number: " + super.getFileNum() +
                "\nPatient Name: " + super.name +
                "\nGender: " + super.gender +
                "\nWeight: " + super.weight +
                "\nHeight: " + super.height +
                "\nTypical Weight: " + super.typicalWeight +
                "\nType Of Patient: ADULT" +
                "\nLevel: " + this.level +
                "\nDiet: " + this.diet;
    }
}

