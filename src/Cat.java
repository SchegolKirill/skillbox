
public class Cat
{
    private static int CAT_COUNT;
    private CatsColor color;

    public static final int EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;

    private String name;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        CAT_COUNT++;

    }

    public Cat(String name, double weight){
        this.name = name;
        this.weight = weight;
        CAT_COUNT++;
    }

    public Cat (Cat cloneCat){
        this(cloneCat.getName(), cloneCat.weight);
        CAT_COUNT++;
    }

    public static void setCatCount(int catCount) {
        CAT_COUNT = catCount;
    }

    public static int getCatCount() {
        return CAT_COUNT;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            CAT_COUNT--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            CAT_COUNT--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public double getWeightOfFoodEaten(){
        return weight - originWeight;
    }

    public double toilet(){
        System.out.println("poof");
        return weight = weight - getWeightOfFoodEaten();
    }

    public void setColor(CatsColor catsColor){
        color = catsColor;
    }

    public CatsColor getColor() {
        return color;
    }

    public String getName(){
        return name;
    }
}