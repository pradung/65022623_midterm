
class Product {
    public String name;
    public double price;
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
         this.price = price; 
        }
}

class Electronics extends Product {
    public String brand;
    public String model ;
    public Electronics(String name, double price, String brand , String model) {
        setName(name) ;
         setPrice(price) ;
          this.brand = brand ;
          this.model = model ;

    }

    public String getBrand() {
         return brand; }

    public void setBrand(String brand) {
         this.brand = brand; 
        }

    public String getmodel() {
         return model; }

    public void setmodel(String model) {
         this.model = model; 
        }

}


class Book extends Product {
    public String author ;
    public int pages ;

    public Book(String name, double price, String author, int pages) {
        setName(name) ;
         setPrice(price) ;
          this.author = author ;
           this.pages = pages ;

    }
    public String getAuthor() {
         return author; 
        }
    public void setAuthor(String author) {
         this.author = author; 
        }
    public int getPages() {
         return pages; 
        }
    public void setPages(int pages) {
         this.pages = pages; 
        }

}


class Smartphone extends Electronics {
    public String operatingSystem;
    public Smartphone(String name, double price, String brand, String operatingSystem,String model) {

        super(name, price, brand, model);
         this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
         return operatingSystem; 
        }
    public void setOperatingSystem(String operatingSystem) {
         this.operatingSystem = operatingSystem; 
        }

}


public class mid {

    public static void main(String[] args) {

        Product chair = new Product(); chair.setName("chair"); chair.setPrice(500.0);

        Electronics television = new Electronics("Television", 20000.0, "Samsung", "Model:Neo QLED");

        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "ios", "Model: Iphone 99");

        Book book = new Book("OOP Programming", 250.0, "John Doe", 300);

        System.out.println("Product Name: " + chair.getName()); System.out.println("Product Price: " + chair.getPrice());
        System.out.println("************************************");

        System.out.println("Product Name: " + television.getName()); System.out.println("Product Price: " + television.getPrice());

        System.out.println("Brand: " + television.getBrand()); System.out.println(television.model);
        System.out.println("************************************");
        

        System.out.println("Product Name: " + iphone.getName()); System.out.println("Product Price: " + iphone.getPrice());

        System.out.println("Brand: " + iphone.getBrand()); System.out.println(iphone.model); System.out.println("Operating System: " + iphone.getOperatingSystem());
        System.out.println("************************************");

        System.out.println("Product Name: " + book.getName()); System.out.println("Product Price: " + book.getPrice());

        System.out.println("Author: " + book.getAuthor()); System.out.println("Number of Pages: " + book.getPages());

    }

}
