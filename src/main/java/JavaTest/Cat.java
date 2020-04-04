package JavaTest;

public class Cat {

    private String name;
    private int hp;
    private int gongJiLi;

    public Cat(String name, int hp, int gongJiLi) {
        this.name = name;
        this.hp = hp;
        this.gongJiLi = gongJiLi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGongJiLi() {
        return this.gongJiLi;
    }

    public void setGongJiLi(int gongJiLi) {
        this.gongJiLi = gongJiLi;
    }
}
