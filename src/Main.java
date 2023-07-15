public class Main {
    public static void main(String[] args) {

       Car car = new Car("mini cooper",1000000);
       Phone phone = new Phone("Iphone 13",120000);
       House house = new House("Elitka",100);
        System.out.println("User's car : "+ car.getModel()+", "+" price : "+car.getPrice());
        System.out.println("User's phone : "+phone.getName()+", "+ " price : "+phone.getPrice());
        System.out.println("User's house : "+house.getName()+", "+" area : "+house.getArea());












    }
}