
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        System.out.println("Всего кошек: " + Cat.getCatCount());

        cat3.feed(10.0);
        System.out.println("Третья кошка в состоянии: " + cat3.getStatus());

        cat1.meow();
        System.out.println("Вес первой кошки: " + cat1.getWeight());

        for(double i = cat1.getWeight(); i > cat1.getMinWeight(); i--){
            cat1.meow();
        }

        System.out.println(cat1.getStatus());
        System.out.println("Теперь кошек: " + Cat.getCatCount());


        System.out.println("Теперь кормим вторую кошку");

        System.out.println("Вес второй кошки: " + cat2.getWeight());
        double amount = 30.0;

        for( double i = cat2.getWeight(); i < cat2.getMaxWeight(); i = i + amount){
            cat2.feed(amount);
        }

        System.out.println(cat2.getWeight());
        System.out.println(cat2.getStatus());
        System.out.println("Теперь кошек: " + Cat.getCatCount());

        System.out.println("Вес съеденной еды второй кошкой равен: " + cat2.getWeightOfFoodEaten());
        cat2.toilet();
        System.out.println(cat2.getStatus());
        Cat.CAT_COUNT++;
        System.out.println("Вторая кошка воскресла");
        System.out.println("Теперь кошек: " + Cat.getCatCount());
    }
}