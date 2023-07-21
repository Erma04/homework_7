package org.example;

public class Main {
    public static void main(String[] args) {
       HavingSuperAbility[] heroes= {
               new Magic(130,50,"Fire"),
               new Medic(100,0,"Heal",100),
               new Warrior(110,40,"Double damage")};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if(heroes[i] instanceof Medic){
                ((Medic) (heroes[i])).increaseExperience();
            }

        }




    }
}