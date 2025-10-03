package Super_This_Keywords;

public class Lab182 {
    public static void main(String[] args) {
        man m = new man();
        m.message();
        System.out.println("***************");
        woman mw = new woman();
        mw.message();
        System.out.println("***************");
        person p = new person();
        p.message();
    }
}

class person {
    void message() {
        System.out.println("I am a Person");
    }
}
class man extends person {
    void message(){
        super.message();
        System.out.println("I am a Man");
    }
}
class woman extends person {
    void message(){
        super.message();
        System.out.println("I am a Woman");
    }
}
