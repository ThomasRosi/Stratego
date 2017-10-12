package game;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
*<p>
*List are used to create the IA and place it in the game
*<p>
*@author ROSI THOMAS
*/

public class List {
    
    Scanner sc = new Scanner(System.in);

/**
*<p>
*This method is only used to create a list for the user but will be deleted afer the GUI of the game
*<p>
*@return a list of int[4][10] used to know which pieces the user want in his game
*/
    public int[][] setList(){
        //Maximum number of every pieces.
        int maxFlag = 1;
        int maxBomb = 6;
        int maxSpy = 1;
        int maxScout = 8;
        int maxMiner = 5;
        int maxSergeant = 4;
        int maxLieutenant = 4;
        int maxCaptain = 4;
        int maxMajor = 3;
        int maxColonel = 2;
        int maxGeneral = 1;
        int maxMarshall = 1;
        //creation of a void list.
        int[][] list = new int[4][10];
        //User complete the list with his own pieces, starting from left-bottom corner to right-top corner.
        for(int i = 0; i<4; i++){
            for (int j = 0 ; j<10;j++){
                int a = 0;
                int b = 0;
                do{
                    do{
                        boolean k;
                        do{
                            System.out.println("You have to place :");
                            if (maxFlag > 0) {System.out.println(maxFlag + " flag. (Press 0)");}
                            if (maxSpy > 0) {System.out.println(maxSpy + " spy. (Press 1)");}
                            if (maxScout > 0) {System.out.println(maxScout + " scout(s). (Press 2)");}
                            if (maxMiner > 0) {System.out.println(maxMiner + " miner(s). (Press 3)");}
                            if (maxSergeant > 0) {System.out.println(maxSergeant + " sergeant(s). (Press 4)");}
                            if (maxLieutenant > 0) {System.out.println(maxLieutenant + " lieutenant(s). (Press 5)");}
                            if (maxCaptain > 0) {System.out.println(maxCaptain + " captain(s). (Press 6)");}
                            if (maxMajor > 0) {System.out.println(maxMajor + " major(s). (Press 7)");}
                            if (maxColonel > 0) {System.out.println(maxColonel + " colonel(s). (Press 8)");}
                            if (maxGeneral > 0) {System.out.println(maxGeneral + " general. (Press 9)");}
                            if (maxMarshall > 0) {System.out.println(maxMarshall + " marshall. (Press 10)");}
                            if (maxBomb > 0) {System.out.println(maxBomb + " bomb(s). (Press 11)");}
                            System.out.println("Which piece do you want to place in line "+(i+1)+"/ Column "+(j+1)+" ?");
                            String str = sc.nextLine();
                            try {
                                a = Integer.parseInt(str);
                                list[i][j] = a;
                                k = true;
                                } catch (Exception e) {
                                System.out.println("You have not enter a integer, please restart ! " + e.getMessage());
                                k = false;
                            }
                        }while(k == false);
                        if (a > 11 || a < 0) { System.out.println("You have not choose a number between 0 and 11 ! Please restart !");}
                    }while(a > 11 || a < 0);
                    String c = " ";
                    if (a == 0) {
                        b = maxFlag;
                        c = "flag";
                        if (b != 0) {maxFlag--;}
                    }
                    else if (a == 1) {
                        b = maxSpy;
                        c = "spy";
                        if (b != 0) {maxSpy--;}
                    }
                    else if (a == 2) {
                        b = maxScout;
                        c = "scouts";
                        if (b != 0) {maxScout--;}
                    }
                    else if (a == 3) {
                        b = maxMiner;
                        c = "miners";
                        if (b != 0) {maxMiner--;}
                    }
                    else if (a == 4) {
                        b = maxSergeant;
                        c = "segeants";
                        if (b != 0) {maxSergeant--;}
                    }
                    else if (a == 5) {
                        b = maxLieutenant;
                        c = "lieutenants";
                        if (b != 0) {maxLieutenant--;}
                    }
                    else if (a == 6) {
                        b = maxCaptain;
                        c = "captains";
                        if (b != 0) {maxCaptain--;}
                    }
                    else if (a == 7) {
                        b = maxMajor;
                        c = "majors";
                        if (b != 0) {maxMajor--;}
                    }
                    else if (a == 8) {
                        b = maxColonel;
                        c = "colonels";
                        if (b != 0) {maxColonel--;}
                    }
                    else if (a == 9) {
                        b = maxGeneral;
                        c = "general";
                        if (b != 0) {maxGeneral--;}
                    }
                    else if (a == 10) {
                        b = maxMarshall;
                        c = "marshall";
                        if (b != 0) {maxMarshall--;}
                    }
                    else if (a == 11) {
                        b = maxBomb;
                        c = "bombs";
                        if (b != 0) {maxBomb--;}
                    }
                    if (b == 0) {System.out.println("You already placed all your "+c+".");}
                }while(b == 0);
            }
        }
        return list;
    }
    
/**
*<p>
*This methode create a list of int[4][10] used to choose disposition of IA's pieces
*Ite create some lists pre-defined and choose one by a random
*<p>
*@return the list chosen by IA
*/
    public int[][] setListIA(){
        
        Random random = new Random();
        ArrayList a = new ArrayList(10);
        int[][] set1 = {{0,11,11,5,6,4,2,3,11,4},{11,4,11,3,3,6,7,4,3,5},{7,11,3,1,9,8,2,6,2,10},{2,8,2,5,2,6,2,5,2,7}};
        int[][] set2 = {{4,11,11,3,3,4,5,0,11,2},{11,11,2,4,5,6,1,11,3,6},{10,2,7,4,2,3,2,9,8,6},{2,2,3,7,5,8,6,5,2,7}};
        int[][] set3 = {{6,5,3,7,0,7,4,6,11,11},{3,3,2,11,11,11,1,6,3,4},{2,3,10,8,2,5,5,9,7,2},{11,2,4,6,2,5,2,4,2,8}};
        //int[][] set4 = {{},{},{},{}};
        //int[][] set5 = {{},{},{},{}};
        //int[][] set6 = {{},{},{},{}};
        //int[][] set7 = {{},{},{},{}};
        //int[][] set8 = {{},{},{},{}};
        //int[][] set9 = {{},{},{},{}};
        //int[][] set10 = {{},{},{},{}};
        a.add(set1);
        a.add(set2);
        a.add(set3);
        int n = a.size();
        int index = random.nextInt(n);
        int[][] listIA = (int[][]) a.get(index);
        return listIA;
    }
} 