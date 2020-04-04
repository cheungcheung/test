package Factory;

import java.util.*;

public class Test {

    public static void main(String[] agrs){

        Person person = new Person("cheung");


        ShangPingFactory factory = new BusFactory();

        //仓库
        Queue<ShangPing> wareHouse = new ArrayDeque<>();



        for (int i=0; i<2;i++) {
            ShangPing shangPing = factory.getShangPing();

            shangPing.setContent(1+i, "一汽", 2000, factory.getClass().getSimpleName());

            wareHouse.add(shangPing);

        }

        //System.out.println(wareHouse.size());

//        ShangPing item = wareHouse.poll();
//
//        while (item!=null){
//            person.buy(item);
//            item = wareHouse.poll();
//        }

        while (wareHouse.size() != 0){
            ShangPing aa = wareHouse.poll();
            person.buy(aa);
        }

        List<ShangPing> shoppingCar = person.getShoppingCar();

        show(shoppingCar);

    }




    public static void show(Collection<ShangPing> shoppingCar){
        for(ShangPing shangPing : shoppingCar){

            System.out.println("商品id:" + shangPing.getId() + " 商品名:" + shangPing.getName() + " 商品价钱:"
                    + shangPing.getPrice() + " 商店名:" + shangPing.getShopName());
        }
    }

}
