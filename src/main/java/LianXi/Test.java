package LianXi;

import java.util.List;

public class Test {

    public static void main(String args[]) throws Exception{




        Person person = new Person("张三");



        Book book = new Book(3,"语文",12);
        Book book2 = new Book(4,"唐诗",12);
        Dog dog = new Dog(5,"小白",14);
        Dog dog2 = new Dog(6,"大黑",15);
        Car car = new Car(1,"宝马",5);
        Car car2 = new Car(2,"奔驰",20);


        person.buy(book);
        person.buy(car);
        person.buy(dog);







        //List<LianXi.ShangPin> ll = person.getList();
        //print1(ll);


        //person.show();


        //List<LianXi.ShangPin> list1 = person.show3(5);
        //List<LianXi.ShangPin> list2= person.show3(10);
        //List<LianXi.ShangPin> list3 = person.show3(2);

        //print(list1);
        //print(list2);
        //print(list3);

        //第二题
        //List<LianXi.ShangPin> shangPinList = person.show5(5,9);
        //print1(shangPinList);

        //第三题
        //List<LianXi.ShangPin> shangPins = person.show6(99, LianXi.Car.class);
        //print2(shangPins);

        //第四题
        //List<LianXi.ShangPin> shangPins1 = person.show7(new Class[]{LianXi.Car.class,LianXi.Book.class});
        //print1(shangPins1);

        //第五题
        //person.show8(1,2,5);


        //第六题
        //List<LianXi.ShangPin> shangPins3 = person.show9();
        //print1(shangPins3);

        //第七题
        //print1(ll);
        //System.out.println();
        List<LianXi.ShangPin> list = person.show10(LianXi.Car.class,LianXi.Dog.class);
        //print1(list);

        //第八题
        //LianXi.ShangPinFactory.shangPinType(LianXi.Car.class);
        //classType(aa);

    }

    public static void print(List<ShangPin> list){
        for (int i=0;i<list.size();i++){
            ShangPin shangPin = list.get(i);
            String a = shangPin.getName();
            System.out.println(a);
        }
    }


    public static void print1(List<ShangPin> list){
        for (int i=0;i<list.size();i++){
            ShangPin shangPin = list.get(i);
            System.out.println("id:"+shangPin.getId()+",  商品名:"+shangPin.getName()+",  价格:"+shangPin.getPrice()
            +", 商品类型:"+shangPin.getClass().getSimpleName());
        }
    }


    public static void classType(Class cls){
        System.out.println(cls.getName());
    }




}
