package Task8;

public class Mainclass {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        System.out.println("Наполняем справочник");
        phonebook.add("Алёна", "4546427");
        phonebook.add("Ольга", "45764744");
        phonebook.add("Олег", "4464886");
        phonebook.add("Олег", "54687945");
        phonebook.add("Олег", "5655665");
        System.out.println(" ");

        System.out.println("Добавим допп. номер Олегу");

        phonebook.add("Олег", "48798452");

        System.out.println(" ");
        System.out.println("Все номера Олега");
        System.out.println(phonebook.get("Олег"));

    }
}