public class Phone{
    private String name;
    private int price;

    public Phone(String name,int price){
        this.name=name;
        this.price=price;
    }

    public Phone(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
