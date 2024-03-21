import java.util.Scanner;

// Class to calculate average and percentage of marks
class Result {
    // Method to calculate average
    public float Avg(int sub1, int sub2, int sub3) {
        return (sub1 + sub2 + sub3) / 3;
    }

    // Method to calculate percentage
    public float Percentage(int sub1, int sub2, int sub3) {
        float total = sub1 + sub2 + sub3;
        return (total / 300) * 100;
    }
}

// Class Student inheriting from Result class
class Stude extends Result {
    int physics;
    int maths;
    int chemistry;

    // Method to display average marks
    public void result1() {
        System.out.println(Avg(physics, maths, chemistry));
    }

    // Method to display percentage marks
    public void result2() {
        System.out.println(Percentage(physics, maths, chemistry));
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Stude s = new Stude();
            System.out.print("Enter student " + i + " physics marks: ");
            s.physics = sc.nextInt();
            System.out.print("Enter student " + i + " maths marks: ");
            s.maths = sc.nextInt();
            System.out.print("Enter student " + i + " chemistry marks: ");
            s.chemistry = sc.nextInt();
            s.result1(); // Display average
            s.result2(); // Display percentage
        }
    }
}
