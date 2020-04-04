package Factory;

public interface ShangPing {

    int getId();
    String getName();
    int getPrice();
    String getShopName();

    void setId(int id);
    void setName(String name);
    void setPrice(int price);
    void setShopName(String shopName);

    void setContent(int id, String name, int price, String shopName);



}
