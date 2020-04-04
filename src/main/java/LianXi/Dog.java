package LianXi;

public class Dog implements ShangPin{

    private int id;
    private String Name;
    private int price;

    public Dog(int id, String name,int price){
        this.Name = name;
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
    public String getName() {
        return this.Name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public void setName(String name){
        name = this.Name;
    }

    public void setPrice(int price){
        price = this.price;
    }
}
