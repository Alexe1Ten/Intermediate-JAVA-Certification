public class App {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.put("Иван", "+7999");
        phonebook.put("Иван", "+7988");
        phonebook.put("Катя", "+7911");
        phonebook.put("Николай Анатольевич", "+7918");
        phonebook.put("Николай Анатольевич", "+7938");
        phonebook.put("Николай Анатольевич", "+7939");

        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.delContact("Катя");
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.clear();
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        System.out.println(phonebook.empty());
    }
}
