package ex02_product_description;

public class Product {

    private String name;
    private int size;
    private double percentage;

    public Product (String name, int size, double percentage){
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String productDescription (){
        String descr = "";
        if (percentage == Math.floor(percentage)) {
            descr = " * " + size + "CL " + String.format("%.0f", percentage) + "%";
        } else {
            descr = " * " + size + "CL " + String.format("%.1f", percentage) + "%";
        }
        return descr;
    }

    public static void main(String[] args) {
        Product x = new Product("Jupiler", 33, 3.3333);
        Product y = new Product("Duvel",100, 7);
        System.out.println(x.productDescription());
        System.out.println(y.productDescription());
    }
}
