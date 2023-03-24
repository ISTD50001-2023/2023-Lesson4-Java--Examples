package Example2;

public abstract class Duck {

    interface FlyBehaviour{
        void fly();
    }

    interface QuackBehaviour{
        void quack();
    }

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    private String name;

    public Duck(String name){
        this.name = name;
    }

    // TODO 1 write setters for FlyBehaviour and QuackBehaviour
    // TODO 2 complete methods fly() and quack()

    public void fly(){
    }

    public void quack(){
    }

    public abstract void display();

    // TODO 3 Realize that there could be a problem if the client called fly() before calling set().
    // TODO 3 How would you solve the problem?



}
