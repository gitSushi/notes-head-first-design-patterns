public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        Duck[] allMyDucksInARow = {
            mallardDuck,
            redHeadDuck,
            rubberDuck,
            decoyDuck,
        };

        for(Duck duck : allMyDucksInARow) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
        }
        
        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
