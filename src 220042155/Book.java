public class Book extends Product {
    private String author;

    private String publisherName;

    private String genre;

    public Book(String name, String description, int quantity, double basePrice,int code, String author,
                String publisherName, String genre) {

        super(name, description, quantity,basePrice,code);
        this.author = author;
        this.publisherName = publisherName;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


@Override

    public double discountPrice() {
    double total = super.discountPrice();


    if (genre.equals("Literature"))
        return calculatePrice() - (((double) 13 / 100) * calculatePrice());

    else if(genre.equals("Science Fiction"))
        return calculatePrice() - (((double) 12 / 100) * calculatePrice());

    else
        return total;

}



    public void displayBookinfo(){
        System.out.println("Name :"+ getName());
        System.out.println("Quantity :"+getQuantity());
        System.out.println("Description :"+  getDescription());
        System.out.println("Og Price :"+ getBasePrice());
        System.out.println("Discount Price :"+discountPrice());

    }
    }

