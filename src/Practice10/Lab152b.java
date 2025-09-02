package Practice10;

public class Lab152b {
    public static void main(String[] args) {
        sum(2,3);
        sub("Rama",30);
        int addresult = add(2,5);
        System.out.println(addresult);
        subu("Krishna",300);

    }
    static void sum(int a, int b){
        System.out.println(a+b+"Ram");
    }
    static void sub(String name, int age){
        System.out.println(name+age);
    }
    static int add(int a, int b){
        return a+b;
    }
    static void subu(String name, int age){
        System.out.println(name+age);
    }
}
