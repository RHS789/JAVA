public class Sum {
    public static void tot(int a, int b) {
        int total = a + b;
        int avg = total / 2;
        System.out.println("THE SUM OF TWO NUMBER IS " + total);
        System.out.println("THE AVERAGE OF TWO NUMBER IS " + avg);
    }

    public static void main(String args[]) {
        tot(56, 90);
    }
}

/**
output:

>>javac Sum.java
>>java Sum

THE SUM OF TWO NUMBER IS 146
THE AVERAGE OF TWO NUMBER IS 73

 */