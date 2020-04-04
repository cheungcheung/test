package Factory;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    //购物车
    private List<ShangPing> shoppingCar;


    public Person(String name) {
        this.name = name;
        this.shoppingCar = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShangPing> getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(List<ShangPing> shoppingCar) {
        this.shoppingCar = shoppingCar;
    }

    /**
     *
     * @param o
     * @return
     */
    public void buy(ShangPing o){

        shoppingCar.add(o);

        //System.out.println(shoppingCar.size());

    }



}
