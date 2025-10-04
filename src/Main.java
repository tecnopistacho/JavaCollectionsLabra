import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListTasks.taskL1();
        ListTasks.taskL2();
        ListTasks.taskL3();
        ListTasks.taskL4();
        ListTasks.taskL5();
        ListTasks.taskL6();

        System.out.println("----");
        SetTasks.taskS1();
        SetTasks.taskS2();
        SetTasks.taskS3();

        System.out.println("----");
        MapTasks.taskM1();
        MapTasks.taskM2();
        MapTasks.taskM3();

        System.out.println("----");
        Scanner scanner = new Scanner(System.in);
        ComboTasks.taskC1(scanner);
        ComboTasks.taskC2(scanner);
        ComboTasks.taskC3(scanner);
        ComboTasks.taskC4(scanner);
        scanner.close();

        System.out.println("----");
        AdvancedTasks.taskA1();
        AdvancedTasks.taskA2();
        AdvancedTasks.taskA3();
    }

    
}
