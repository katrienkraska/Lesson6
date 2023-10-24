package task2;

public enum Animals {
    DOG(5),
    CAT(2),
    MONKEY(1),
    LION(7);

    private int age;

    Animals(int age) {
        this.age = age;
    }
    public String toString (){
        return name() + " (вік " + age + " років )";
    }

    public static void main(String[] args) {
        Animals myPet = Animals.CAT;
        System.out.println("Моя улюбена тварина " + myPet);
    }
}
