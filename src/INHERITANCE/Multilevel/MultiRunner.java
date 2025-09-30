package INHERITANCE.Multilevel;

public class MultiRunner extends Sson {
    public static void main(String[] args) {
        //Ggrandfather ggf = new Ggrandfather();
        //ggf.home(); if new Ggrandfather Object is created // DC of Ggrandfather
                                                            // Grandfathers 1 BHK
        //Ggrandfather ggf = new Ffather();//DC of Ggrandfather
        //ggf.home();                     //DC of Ffather
                                         //Fathers 2 BHK
        //Ggrandfather ggf = new Sson();      //DC of Ggrandfather
        //ggf.home();                        //DC of Ffather
                                            //DC of Sson
                                           //Fathers 2 BHK
        //Ffather ff = new Ffather();     //DC of Ggrandfather
        //ff.home();                      //DC of Ffather
                                        //Fathers 2 BHK
        //Ffather ff = new Ggrandfather();    //This is not possible as lower to higher case



    }
}
