public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName + " ";

        // ЗАДАЧА 1
        System.out.println("ФИО сотрудника — " + fullName);

        //ЗАДАЧА 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + upperFullName);

        // ЗАДАЧА 3
        String fullName1 = "Иванов Семён Семёнович ";
        System.out.println("Данные Ф.И.О. сотрудника " + fullName1.replace('ё', 'e'));

    }
}