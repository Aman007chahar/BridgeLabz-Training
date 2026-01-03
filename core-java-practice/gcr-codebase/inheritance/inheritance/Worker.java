package inheritance;

public interface Worker {
    void performDuties();
}
class Person1 {
    String name;
    int id;
}
class Chef extends Person1 implements Worker {
    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}
class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}
