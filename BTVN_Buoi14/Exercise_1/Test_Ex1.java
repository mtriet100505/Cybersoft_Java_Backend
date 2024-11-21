package Exercise_1;

import java.util.List;
import java.util.ArrayList;
public class Test_Ex1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product laptop = new Laptop("Ui9", "Dell XPS 15", 1500, 10, "Intel i7", 16);
        Product smartphone = new Smartphone("IP16", "iPhone 16", 1000, 20, "12MP");
        Product tablet = new Tablet("ipM4", "iPad Pro", 1200, 15, true, "2732x2048");
        products.add(laptop);
        products.add(smartphone);
        products.add(tablet);
        for (Product product : products) {
            System.out.println(product);
            System.out.println("Discounted Price: " + product.calculate_discounted_price(10));
            if(product instanceof Exercise_1.Laptop){
                Exercise_1.Laptop l=(Exercise_1.Laptop)product;
                System.out.println("Processor: " + l.getProcessor() + ", RAM: " + l.getRam() + "GB");
                System.out.println("Discount laptop: "+l.calculate_discounted_price(10));
            } else if (product instanceof Exercise_1.Smartphone){
                Exercise_1.Smartphone s=(Exercise_1.Smartphone)product;
                System.out.println("Camera Quality: " + s.getCameraQuality());
                System.out.println("Discount Exercise_1.Smartphone: "+s.calculate_discounted_price(10));
            } else if (product instanceof Exercise_1.Tablet) {
                Exercise_1.Tablet t=(Exercise_1.Tablet )product;
                System.out.println("Screen Resolution: " + t.getScreenResolution());
                System.out.println("Discount Exercise_1.Tablet: "+t.calculate_discounted_price(10));
            }
            System.out.println("---------------------------------------------------------------------");
        }
        for(Product product:products){
            if("iPhone 16".equals(product.getName())){
                products.remove(product);
            }
        }
        for (Product product : products) {
            System.out.println(product);
            System.out.println("Discounted Price: " + product.calculate_discounted_price(10));
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
 /*


     */