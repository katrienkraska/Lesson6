package task4;

public enum Vehicles {
    CAR(35000, "Black"),
    BIKE(12000, "Gray");

    private int cost;
    private String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        return name() + " Колір: " + color + " Вартість: " + cost;
    }

    public static void main(String[] args) {
        Vehicles myCar = Vehicles.CAR;
        System.out.println("Мій автомобіль: " + myCar);
    }
}


