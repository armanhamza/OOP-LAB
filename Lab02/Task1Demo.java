public class Task1Demo {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name="M.Arman Hamza";
        s1.studentId="SP26-BAI-034";
        s1.completedCredits=17;

        s2.name="Abdul Rehamn Azam";
        s2.studentId="SP26-BAI-003";
        s2.completedCredits=15;

        s3.name="M.Abdullah Bilal";
        s3.studentId="SP26-BAI-026";
        s3.completedCredits=16;

        s1.displayData();
        s2.displayData();
        s3.displayData();
        // Updating completedCredits
        s2.completedCredits +=10;

        System.out.println("Updated Data:");
        s1.displayData();
        s2.displayData();
        s3.displayData();        

        //s1,s2,and s3 are instance variables and each has unique memory locations.
        //Therefore,changing any one does not effect others because they do not share same memory.


}
}
