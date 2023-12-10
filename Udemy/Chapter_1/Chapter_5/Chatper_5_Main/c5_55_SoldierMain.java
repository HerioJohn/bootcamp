package Udemy.Chapter_1.Chapter_5.Chatper_5_Main;

import Udemy.Chapter_1.Chapter_5.Chapter_5_Class.c5_55_Soldier;

public class c5_55_SoldierMain {

  public static void main(String[] args) {

      c5_55_Soldier soldier_1 = new c5_55_Soldier();

      c5_55_Soldier soldier_2 = new c5_55_Soldier();

      soldier_1.checkState();

      soldier_1.editAllState(10, 5, 5);

      soldier_1.checkState();

      soldier_1.printOutRace();



  }

}
