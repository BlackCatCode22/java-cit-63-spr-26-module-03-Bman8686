package mystuff;

import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        MyStuff myRig = new MyStuff();
        myRig.myTruck = "Peterbilt";
        myRig.myModel = "365";
        myRig.myYear = 1985;
        myRig.myColor = "blue";
        myRig.fullLoad = true;

        MyStuff myRig2 = new MyStuff();
        myRig2.myTruck = "Kenworth";
        myRig2.myModel = "W900";
        myRig2.myYear = 1986;
        myRig2.myColor = "White";
        myRig2.fullLoad = false;


        System.out.println(myRig.fullLoad);


    }
}
