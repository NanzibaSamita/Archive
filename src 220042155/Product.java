public class Product {
    private String name;

    private int quantity;

    private String description;

    private double basePrice;

    private int code;



    public Product(String name, String description, int quantity, double basePrice,int code ) {
        this.name = name;
        this.quantity = quantity;
        this.description=description;
        this.basePrice=basePrice;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description= description;
    }




    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity= quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice= basePrice;
    }


    public double calculatePrice(){
        return getQuantity() * getBasePrice();
    }
    public double discountPrice(){
        if (code==1234)
            return (calculatePrice()-(.1*calculatePrice()))-50;
        else
            return calculatePrice()-(.1*calculatePrice());

    }



}