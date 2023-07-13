public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("Пётр", "Овчинников", 25, "Мужчина", "Дворник");
        people[1] = new Person("Анна", "Щеглова", 18, "Женщина", "Секретарь");
        people[2] = new Person("Игорь", "Серов", 22, "Мужчина", "Тракторист");
        people[3] = new Person("Светлана", "Золотова", 30, "Женщина", "Медсестра");

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }
    }
}
