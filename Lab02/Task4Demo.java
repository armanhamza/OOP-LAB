public class Task4Demo {

    public void changeNumber(int x) {
        System.out.println("Before Assigning x = " + x);
        x = 99;
        System.out.println("After Assigning x = " + x);
    }

    public void changeStudent(Student st) {
        System.out.println("Before Mutation, st.completedCredits = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("After Mutation, st.completedCredits = " + st.completedCredits);
    }

    public void replaceStudent(Student st) {
        System.out.println("Before Reassigning st.name = " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("After Reassigning st.name = " + st.name);
    }

    public static void main(String[] args) {
        Task4Demo demo = new Task4Demo();

        // EXPERIMENT A: Primitive Pass-by-Value
        int num = 10;
        System.out.println("Before Call: num = " + num);
        demo.changeNumber(num);
        System.out.println("After Call: num = " + num);

        // EXPERIMENT B: Object Field Mutation
        Student s1 = new Student();
        s1.completedCredits = 30;

        System.out.println("Before Call: s1.completedCredits = " + s1.completedCredits);
        demo.changeStudent(s1);
        System.out.println("After Call:  s1.completedCredits = " + s1.completedCredits);

        // EXPERIMENT C: Object Reassignment
        Student s2 = new Student();
        s2.name = "M.Arman Hamza";
        System.out.println("Before Call: s2.name = " + s2.name);
        demo.replaceStudent(s2);
        System.out.println("After Call:  s2.name = " + s2.name);
    }
}
