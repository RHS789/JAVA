public class SleepTest extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepTest t1 = new SleepTest();
        SleepTest2 t2 = new SleepTest2();
        t1.start();
        t2.start();
    }
}

class SleepTest2 extends Thread {
    public void run() {
        for (int i = 5; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

/**
 
>>javac SleepTest.java
>>java SleepTest

1
5
2
6
7
3
4
8
9

 */