/**
class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

class TestStudent {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
*/

class Student {
    int a;
    String b;

    void insertRecord(int c, String d) {
        a = c;
        b = d;
    }

    void displayInformation() {
        System.out.println("Roll no: " + a + " | Name: " + b);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord(111, "Raghu");
        s1.displayInformation(); 
    }
}
