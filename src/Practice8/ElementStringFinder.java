package Practice8;

public class ElementStringFinder {
    public static void main(String[] args) {
        String[][] fruitss = {{"Apple","Pineapple","Grape","Banana"},
                              {"Plum","Mango","Orange","Guava"}};
        String findfruit1 = "Aple";
        String findfruit2 = "Pum";
        boolean found1 = false;
        boolean found2 = false;

        for (int i = 0; i < fruitss.length; i++) {
            for (int j = 0; j < fruitss[i].length; j++) {
                if (fruitss[i][j].contentEquals(findfruit1)){
                    found1 = true;
                }
                if (fruitss[i][j].contentEquals(findfruit2)){
                    found2 = true;
                }
            }
        }   if (found1 && found2){
            System.out.println(findfruit1+" and "+findfruit2+" both are found in the list");
        }   else if (found1) {
            System.out.println(findfruit1+" found, but "+findfruit2+" not found in the list");
        }   else if (found2) {
            System.out.println(findfruit2+" found, but "+findfruit1+" not found in the list");
        }   else {
            System.out.println("Neither "+findfruit1+" nor "+findfruit2+" found in the list");
        }
    }
}
