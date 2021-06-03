/**Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
package Cats;

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Pushistik", 30),
                   new Cat("Tom", 40),
                   new Cat("Silver", 15),
                   new Cat("Gold", 20)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("______________________________");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("______________________________");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }

    }
}