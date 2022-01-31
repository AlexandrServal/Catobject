public class Main {

    public static class Cat {

        String name;
        int age;

        // конструктор класса Cat
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void say() {
            System.out.println("Мяу!");
        }

        public void jump() {
            System.out.println("Jump");
        }
        
        public static void main(String[] args) {

            Cat barsik = new Cat( "Barsik",5);
            Cat tom = new Cat( "Tom",  10);
            System.out.println(barsik.name + " " + barsik.age);
            System.out.println(tom.name + " " + tom.age);

            barsik.say();
            tom.jump();
        }
    }
}
