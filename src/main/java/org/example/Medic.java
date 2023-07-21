package org.example;

public class Medic extends Hero{

    private int healPoints;

    public Medic(int health, int damage, String superAbility,int healPoints) {
        super(health, damage, superAbility);
        this.healPoints=healPoints;
    }


    public void increaseExperience(){
        healPoints+=healPoints*0.1;
        System.out.println("Medic increased healing experience: "+healPoints);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied super ability: "+ getSuperAbility());
    }


}
