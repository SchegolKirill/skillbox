
public class Cat
{
    public static int CAT_COUNT;

    private double originWeight;
    private double weight;

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
        if(weight < minWeight) {
            CAT_COUNT--;
            return "Dead";
        }
        else if(weight > maxWeight) {
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
}