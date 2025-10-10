public abstract class Candy implements Comparable<Candy> {
    private String name;
    private double weight;
    private double sugar;
    private double volume;

    public Candy(String name, double weight, double sugar, double volume) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
        this.volume = volume;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public double getSugar() { return sugar; }
    public double getVolume() { return volume; }

    @Override
    public int compareTo(Candy other) {
        return Double.compare(this.volume, other.volume);
    }

    @Override
    public String toString() {
        return name + " (вага: " + weight + ", цукор: " + sugar + ", об’єм: " + volume + ")";
    }
}
