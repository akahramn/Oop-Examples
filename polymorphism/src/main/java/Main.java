public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Contact contact1 = new Contact();

        contact1.createContact("Jonh Mayer", 432112);
        contact1.showContact();

        contact.createContact("Abdullah Kahraman", 123456, 12312);
        contact.showContact();
    }
}
