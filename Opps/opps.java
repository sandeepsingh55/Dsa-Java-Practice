package Opps;

public class opps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        p1.settip(5);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        Add s = new Add();
        System.out.println(s.Add(2, 30));
        Dog a = new Dog();
        a.speak();
        a.bark();
        cat c = new cat();
        c.bark();
        c.speak();
        c.mew();
        Duck d = new Duck();
        d.walk();
        d.swim();

    }
}

class Pen {
    String colour;
    int tip;

    void setcolor(String newcolor) {
        this.colour = newcolor;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }

    String getcolor() {
        return this.colour;
    }

    int gettip() {
        return this.tip;
    }
}

class Add {
    int x;
    int y;

    int Add(int x, int y) {
        return x + y;
    }
}

class Animal {
    void speak() {
        System.out.println("animal can barks");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("hu hu huuu");
    }
}

class cat extends Dog {
    void mew() {
        System.out.println("mew mew");
    }
}

interface walkable {
    void walk();
}

interface swimable {
    void swim();
}

class Duck implements walkable, swimable {

    public void walk() {
        System.out.println("duck can walk");
    }

    public void swim() {
        System.out.println("duck can swim");
    }
}