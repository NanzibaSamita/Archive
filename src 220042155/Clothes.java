public class Clothes extends Product {

    private int size;

    public Clothes(String name , String description ,int quantity, double basePrice , int code, int size)
    {
        super(name ,description,quantity ,basePrice,code);
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize (int size) {
        this.size= size;
    }

    public void displayClotheinfo() {
        System.out.println("Name :" + getName());
        System.out.println("Quantity :" + getQuantity());
        System.out.println("Description :" + getDescription());
        System.out.println("Og Price :" + calculatePrice());
        System.out.println("Discount Price :" + discountPrice());

    }






}
