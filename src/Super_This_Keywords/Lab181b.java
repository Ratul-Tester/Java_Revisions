package Super_This_Keywords;

import Practice11.Human;

public class Lab181b {
    public static void main(String[] args) {
        Man m = new Man();
        m.message();
        System.out.println("*******************");
        Man ma = new Woman();
        ma.message();
        System.out.println("*******************");
        Man man = new human();
        man.message();
        System.out.println("*******************");

    }
}

class Man{
    void message(){
        System.out.println("I am a Man");
    }
    void display(){
        this.message();
    }

}
class Woman extends Man{
    void message(){
        System.out.println("She ia a Woman");
    }
    void display(){
        super.message();
        this.message();
    }
}
class human extends Woman{
    void message(){
        System.out.println("We are Humans");
    }
    void display() {
        super.display();
        this.message();
    }
}
class Species extends Human {
    void message(){
        System.out.println("I am the Origin, I am 'SPECIES' ");
    }
    void display(){
        this.message();
    }

}