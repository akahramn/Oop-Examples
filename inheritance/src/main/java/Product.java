
public class Product {
    private String name;
    private double price;
    private int numberOfCopies;

    public void sellCopies() {
        if(numberOfCopies > 0) {
            numberOfCopies --;
            System.out.println("One copy has sold!");
        }else {
            System.out.println("Albums has sold out");
        }
    }

    public void orderCopies(int num) {
        numberOfCopies += num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies < 0) {
            this.numberOfCopies = 0;
        }else {
            this.numberOfCopies = numberOfCopies;
        }
    }
}
