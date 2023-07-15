public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
    }

    public static void task1_2() {
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName+ " " + firstName + " " +middleName;
        System.out.println(fullName);
        String capitalFullName = fullName.toUpperCase();
        System.out.println(capitalFullName);

    }

    public static void task3() {
        String firstName = "Семён";
        String lastName = "Иванов";
        String middleName = "Семёнович";
        String fullName = lastName+ " " + firstName + " " +middleName;
        String s2 = fullName.replace('ё', 'е');
        System.out.println(s2);

    }

}