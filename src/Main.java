public class Main {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("person1", "123");
        phoneBook.addPhoneNumber("person2", "1234");
        phoneBook.addPhoneNumber("person3", "1235");
        phoneBook.addPhoneNumber("person4", "1236");
        phoneBook.addPhoneNumber("person5", "1237");
        phoneBook.addPhoneNumber("person6", "1238");

        phoneBook.printPhoneBook();
    }
}
