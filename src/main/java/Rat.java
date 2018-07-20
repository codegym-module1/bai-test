public class Rat {
    private String name;
    private int weight;
    private int speed;

    public Rat() {
    }

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void run(Rat rat) {
        System.out.println("Chuột đang chạy với tốc độ "+speed);
    }

    @Override
    public String toString() {
        return "Rat {Name "+ getName()+". Speed "+getSpeed()+". Weight "+getWeight()+"}";
    }
}
