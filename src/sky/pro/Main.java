package sky.pro;

    public class Main {

    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("ФИО сотрудника-" + lastName + " " + firstName + " " + middleName);


        //Задание 2
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета -" + fullName.toUpperCase());

        //Задание 3
        fullName = "Иванов Сёмён Семёнович";
        System.out.println("Данные ФИО сотрудника -" + fullName.replace('ё','е'));
            String[] names = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника -");
        for (int i = 0; i < names.length; i++) {
            String name;
            while ((name = names[i]).contains("ё")) {
                int index = name.indexOf("ё");
                names[i] = name.substring(0, index) + "ё" + name.substring(index + 1);
            }
            if (i == name.length() - 1) {
                System.out.print(names[i]);
            } else {
                System.out.print(names[i] + " " );
            }
        }
    }
}




