package LianXi;

public class Car implements ShangPin {

    private int id;

    private String name;

    private int price;

    public Car(int id,String name,int price){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        id = this.id;
    }

    @Override
    public String getName(){
        return this.name;
    }
    public void  setName(String name){
        name = this.name;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
    public void  setPrice(int price){
        price = this.price;
    }



}
