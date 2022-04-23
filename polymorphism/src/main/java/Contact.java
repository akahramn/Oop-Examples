import java.util.ArrayList;

public class Contact {

    private String name;
    private ArrayList<Integer> contactNumList = new ArrayList<Integer>();

    public void createContact(String name, int num) {
        this.name = name;
        this.contactNumList.add(num);
    }

    public void createContact(String name, int num1, int num2) {
        this.name = name;
        this.contactNumList.add(num1);
        this.contactNumList.add(num2);

    }

    public void showContact() {
        System.out.println("Name : " + this.name + ", Num: " + this.contactNumList.toString());
    }
}
