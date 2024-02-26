public class App {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.put("Иван", "+7999");
        phonebook.put("Иван", "+7988");

        System.out.println(phonebook.getAll());
    }
}
