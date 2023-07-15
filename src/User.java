public class User {
    private Car car;
    private Phone phone;
    private House house;


    public User(Car car) {
        this.car = car;

    }
    public User(Phone phone){
        this.phone=phone;
    }
    public User(House house){
        this.house=house;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public House getHouse(House house) {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


}
