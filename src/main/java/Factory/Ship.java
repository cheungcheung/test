package Factory;

public class Ship implements ShangPing {

    private int id;

    private String name;

    private int price;

    //商店名,也就是创建这个商品的工厂类类名
    private String shopName;






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    @Override
    public void setContent(int id, String name, int price, String shopName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shopName = shopName;
    }

}
