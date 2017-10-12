/**
package game;

import pieces.Array;



public class Main {

    public static void main(String[] args){
        Array array = new Array();
        List l = new List();
        //int[][] list = l.setList();
        //Liste provisoire permettant à passer au-dessus de l'étape d'entrée des pièces (facilité les tests)
        int[][] list = {{1,2,3,4,5,6,0,8,9,3},{2,2,3,4,5,6,7,8,9,11},{3,11,3,4,5,6,7,8,9,11},{2,2,3,4,5,6,7,8,9,11}};
        array.set(list);
        int[][] listIA = l.setListIA();
        array.setIA(listIA);
        array.affichage();
        int n = 1;
        Tiles t;
        do {
            //Tour IA
            if (n%2 == 0){
                System.out.println("Red Team to move ! (IA)");
                //array.randomIA();
                array.averageIA();
                System.out.println(" ");
                array.affichage();
            }
            //Tour USER
            else if (n%2 == 1){
                System.out.println("Blue Team to move ! (USER)");
                do{
                    do{
                        t = array.tilesChoice();
                        if (!t.getPiece().getBelongs()) {System.out.println("This piece belongs to your opponent !");}
                    }while(!t.getPiece().getBelongs());
                    if (!array.mvtTest(t)){
                        System.out.println("You can not move this piece !");}
                }while(!array.mvtTest(t));
                array.mvtChoice(t);
                System.out.println(" ");
                array.affichage();
            }
            n++;
        }while(!array.end(n));
        if (n%2 == 1) {System.out.println("DEFEAT !");}
        else if (n%2 == 0) {System.out.println("VICTORY !");}
    }

}
*/