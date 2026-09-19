public class Student{    
    
    String name;
    int completedCredits;
    String studentId;

    //Task 3 modifications.
    //Signature: enroll(String)
    void enroll(String courseCode){
        System.out.println(courseCode);
    }
    //Signature: enroll(String,int)
    void enroll(String courseCode, int section){
        System.out.println(courseCode + "and" + section);
    }
    //Signature: enroll(int)
    void enroll(int numericCourseCode){
        System.out.println(numericCourseCode);
    }

    void displayData(){
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(completedCredits);

    }
    //Task 2 modifications.
    public void addCredits(int credits) {
        completedCredits += credits;  }  

    public int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits;
        return remaining;
    }

    public String Summary() {
        return ("Name:" + name + "  ID:" + studentId + "  Completed Credits:" + completedCredits);        
    }
}

    
