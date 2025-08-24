package Practice8;


public class SelfTryStringEF {
    public static void main(String[] args) {
        String[][] fruits = {{"Banana","Pineapple","Guava","Berry"},
                                {"Apple","Grape","Mango","Orange"}
        };
        String fruit1 = "Apple"; String fruit2 = "Plum";
        boolean found1 = false; boolean found2 = false;

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                if (fruits[i][j].contentEquals(fruit1)){
                    found1 = true;
                }
                if (fruits[i][j].contentEquals(fruit2)){
                    found2 = true;
                }
            }
        }
        if (found1 && found2){
            System.out.println(fruit1+" And "+fruit2+" both are found in the list");
        } else if (found1){
            System.out.println(fruit1+" found in the list, but "+fruit2+" not found");
        } else if (found2){
            System.out.println(fruit2+" found in the list, but "+fruit1+" not found");
        } else {
            System.out.println("Neither "+fruit1+" nor "+fruit2+" found");
        }
    }
}
