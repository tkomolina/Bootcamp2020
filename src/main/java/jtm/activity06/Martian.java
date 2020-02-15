package jtm.activity06;

public class Martian implements Humanoid, Alien, Cloneable {

    private int weight;
    private boolean alive;
    String[] backpack;

    public Martian(){
        this.weight=42;
        this.alive=true;
        this.backpack = new String[10];
    }

    @Override
    public void eatHuman(Humanoid humanoid) {

        //humanoid represents human, needed to be eaten. Human is being killed
        //     *                 when it is eaten an alien gains his weight
        if (humanoid.isAlive()=="Alive"){
            this.weight=this.weight+humanoid.getWeight();
            humanoid.killHimself();
        }
    }

    @Override
    public int getLegCount() {
        return LEG_COUNT;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight=weight;
    }

    @Override
    public String killHimself() {
       this.alive=true;
        return "I AM IMMORTAL!";
    }

    @Override
    public int getArmCount() {
        return ARM_COUNT;
    }

    @Override
    public String[] getBackpack() {
        return this.backpack;
    }

    @Override
    public void addToBackpack(String item) {
        for (int i = 0; i < backpack.length; i++) {
            if (backpack[i] == null) {
                backpack[i] = item;
                break;
            }
        }
    }

    @Override
    public String isAlive() {
        this.alive=true;
        return "I AM IMMORTAL!";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //TODO
        Martian m = new Martian();
        m.setWeight(this.getWeight());
        //Clone method should completely clone / duplicate this object, with all it’s field values and return newly created Martian.

        return m;
    }



}
