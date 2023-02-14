public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck () {}

	public abstract void display ();

    public void swim () {
        System.out.println("All ducks float, even the decoys !");
    }

    public void performFly () {
        flyBehavior.fly();
    }

    public void performQuack () {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setFlyBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}