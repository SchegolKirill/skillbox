
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat("Вася", 3500.0);
        Cat cat5 = new Cat(cat4);
        getCat();
        getCat();
        getCat();

        cat4.setColor(CatsColor.RED);
        System.out.println(cat4.getColor());
        System.out.println(cat5.getName());
        System.out.println(cat5.getWeight());


        System.out.println("Всего кошек: " + Cat.getCatCount());

        cat3.feed(10.0);
        System.out.println("Третья кошка в состоянии: " + cat3.getStatus());

        cat1.meow();
        System.out.println("Вес первой кошки: " + cat1.getWeight());

        for(double i = cat1.getWeight(); i > Cat.MIN_WEIGHT; i--){
            cat1.meow();
        }

        System.out.println(cat1.getStatus());
        System.out.println("Теперь кошек: " + Cat.getCatCount());


        System.out.println("Теперь кормим вторую кошку");

        System.out.println("Вес второй кошки: " + cat2.getWeight());
        double amount = 30.0;

        for( double i = cat2.getWeight(); i < Cat.MAX_WEIGHT; i = i + amount){
            cat2.feed(amount);
        }

        System.out.println(cat2.getWeight());
        System.out.println(cat2.getStatus());
        System.out.println("Теперь кошек: " + Cat.getCatCount());

        System.out.println("Вес съеденной еды второй кошкой равен: " + cat2.getWeightOfFoodEaten());
        cat2.toilet();
        System.out.println(cat2.getStatus());
        Cat.setCatCount(Cat.getCatCount() + 1);
        System.out.println("Вторая кошка воскресла");
        System.out.println("Теперь кошек: " + Cat.getCatCount());
    }

    private static Cat getCat(){
        return new Cat("Мурка", 1100.0);
    }
}