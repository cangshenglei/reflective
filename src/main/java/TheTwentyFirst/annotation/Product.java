package TheTwentyFirst.annotation;

public class Product implements Comparable<Product> {
    private Integer pid;
    private String name;
    private Double price;

    @Override
    public int compareTo(Product o) {
        return this.pid - o.pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Deprecated
    public void method1(){
        System.out.println("---------------");
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
