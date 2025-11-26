import java.util.Scanner;

public class lab5 {
    static class Student {
        String familia;
        String name;
        int year;
        int month;

        public Student(String f, String n, int y, int m) {
            familia = f;
            name = n;
            year = y;
            month = m;
        }

        public void show() {
            System.out.println("Фамилия: " + familia);
            System.out.println("Имя: " + name);
            System.out.println("Год: " + year);
            System.out.println("Месяц: " + month);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student("Мазманян", "Владимир", 2006, 4);
        students[1] = new Student("Стрельцов", "Игорь", 2006, 5);
        students[2] = new Student("Ильин", "Константин", 2006, 2);

        // Самый старший
        System.out.println("Самый старый:");
        Student old = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].year < old.year) {
                old = students[i];
            }
        }
        old.show();

        // Средний год
        System.out.println("\nСредний год:");
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].year;
        }
        double avg = sum / 3.0;
        System.out.println("Средний: " + avg);

        // Старше среднего
        System.out.println("\nСтарше среднего:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].year < avg) {
                students[i].show();
            }
        }

        // Сортировка по фамилиям
        System.out.println("\nСортировка по фамилии:");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].familia.compareTo(students[j].familia) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }

        // Поиск
        System.out.print("\nНайти фамилию: ");
        String find = sc.nextLine();
        boolean ok = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].familia.equals(find)) {
                ok = true;
                System.out.println("Нашел!");
                students[i].show();

                System.out.print("Новое имя: ");
                String newName = sc.nextLine();
                students[i].name = newName;

                System.out.println("После замены:");
                students[i].show();
                break;
            }
        }

        if (!ok) {
            System.out.println("Не нашел");
        }

        sc.close();
    }
}