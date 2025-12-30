class Person {

   
    void personalDetails() {
        String name = "GSP";
        int age = 19;
        String location = "TUNI";

        System.out.println("---- Personal Details ----");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Location  : " + location);
    }

   
    void qualificationDetails() {
        String degree = "B.Tech";
        String branch = "Artifical Intelligence and Machine learning ";
        String college = "Aditya University";

        System.out.println("\n---- Qualification Details ----");
        System.out.println("Degree    : " + degree);
        System.out.println("Branch    : " + branch);
        System.out.println("College  : " + college);
    }

    public static void main(String[] args) {
        Person p = new Person(); // object creation
        p.personalDetails();
        p.qualificationDetails();
    }
}