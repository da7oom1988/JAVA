public class Patient {
    protected String name;
    private String fileNum;
    protected char gender;
    protected double weight, height, typicalWeight;
    protected int numOfDoctors;

    Doctor[] doctors;

    public Patient(int size, String name, String fileNum, char gender, double weight, double height) {
        this.name = name;
        this.fileNum = fileNum;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.numOfDoctors = 0;
        doctors = new Doctor[size];
        calculateTypicalWeight();
    }


    public void calculateTypicalWeight(){
        this.typicalWeight = 0;
    }

    public boolean addDoctor(Doctor d){
        if(numOfDoctors >= doctors.length)
            return false;

        doctors[numOfDoctors] = d;
        numOfDoctors++;

        return true;
    }

    public double getTypicalWeight() {
        return typicalWeight;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void display(){


        String drNames = "";
        for(int i = 0 ; i < numOfDoctors ; i++){
            if(i > 0)
                drNames += ", ";
            drNames += doctors[i].getName();
        }
        String str = "The Patient " + this.name + " has " + this.numOfDoctors +
                " doctors, they are: " + drNames + " and weighs " + this.weight + " Kg and his/her " +
                "typical weight is " + typicalWeight;

        System.out.println("--------------------------------");
        System.out.println("File Number: " + this.fileNum);
        System.out.println(str);
        System.out.println("--------------------------------");

    }


    public String getFileNum() {
        return fileNum;
    }
}

