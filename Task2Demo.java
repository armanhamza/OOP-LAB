public class Task2Demo {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="M.Arman Hamza";
        s1.studentId="SP26-BAI-034";
        s1.completedCredits=17;

        s2.name="Abdul Rehamn Azam";
        s2.studentId="SP26-BAI-003";
        s2.completedCredits=15;

    //Calling method Summary().
        System.out.println("Before Updateding Data:");
        System.out.println(s1.Summary());
        System.out.println(s2.Summary()); 

        // Calling method addCredits.
        s1.addCredits(10);
        s2.addCredits(25);

        int degreeCredits=133;
        //Calling method remainingCredits().
        s1.remainingCredits(degreeCredits);
        s2.remainingCredits(degreeCredits);

        //Printing Updated Data.
        System.out.println();
        System.out.println("Updated Data:");

        System.out.println(s1.Summary());
        System.out.println(s2.Summary());         
        System.out.println("Remaining credits of s1:"+s1.remainingCredits(degreeCredits));
        System.out.println("Remaining credits of s2:"+s2.remainingCredits(degreeCredits));
}
}
