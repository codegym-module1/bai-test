public class Cat {
    private String name;
    private int speed;

    public Cat() {
    }

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void run(Cat cat) {
        System.out.println("Mèo đang chạy với tốc độ " + speed);
    }

    public boolean catchRat(Rat rat) {
        if (rat.getSpeed() == getSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Rat rat) {
        if (rat.getWeight() < 10) {
            System.out.println("Mum mum, chuột hơi gầy");
        } else if (rat.getWeight() > 10) {
            System.out.println("Mum mum, chuột béo đấy");
        } else {
            System.out.println("Meo meo, đói");
        }
    }
}
