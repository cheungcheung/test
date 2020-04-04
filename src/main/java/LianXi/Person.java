package LianXi;

import java.util.*;

public class Person {


    private String name;

    private List<ShangPin> list ;


    public Person(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        name = this.name;
    }

    public List getList() {
        return this.list;
    }

    public void setList(List list) {
        list = this.list;
    }


    public void buy(ShangPin o) {

        list.add(o);
    }


    public void show() {

        for (int i = 0; i < list.size(); i++) {

            ShangPin c = list.get(i);
            String d = c.getName();
            int e = c.getPrice();
            System.out.println("清单" + d + e);
            System.out.println("--------");


        }


    }


    public void show2() {
        for (int i = 0; i < list.size(); i++) {
            ShangPin c = list.get(i);
            int p = c.getPrice();
            if (p < 10) {
                //System.out.println("价格低于10的商品名:"+c.getName());
            }
        }
    }

    public List<ShangPin> show3(int max) {
        List<ShangPin> m = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            ShangPin c = list.get(i);
            int p = c.getPrice();

            if (p < max) {
                m.add(c);

            }
        }

        return m;
    }

    //第二题
    public List<ShangPin> show5(int min, int max) {
        List<ShangPin> zhiDing = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ShangPin u = list.get(i);
            int jiaQian = u.getPrice();
            if (jiaQian >= min & jiaQian <= max) {
                zhiDing.add(u);
            }
        }


        return zhiDing;
    }

    //第三题
    public <T extends ShangPin> List<ShangPin> show6(int price, Class<T> cls) {

        List<ShangPin> sp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ShangPin n = list.get(i);
            int jiaQian = n.getPrice();
            String shanPinMing = n.getClass().toString();

            //System.out.println("shanpingming:"+shanPinMing);
            //System.out.println(cls.toString());
            if (jiaQian <= price & shanPinMing.equals(cls.toString())) {
                sp.add(n);
            }
        }

        return sp;
    }

    //第四题
    public <T extends ShangPin> List<ShangPin> show7(Class<T>... arr) {

        List<ShangPin> ss = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {

            String arrName = arr[j].toString();

            for (int i = 0; i < list.size(); i++) {
                ShangPin xxx = list.get(i);
                String listName = xxx.getClass().toString();

                if (listName.equals(arrName)) {
                    ss.add(xxx);
                }

            }
        }

        return ss;
    }

    //第五题
    public void show8(int... id) {

        List<ShangPin> shangPinList = new ArrayList<>();

        for (int i = 0; i < id.length; i++) {
            int deleteId = id[i];

            for (int j = 0; j < list.size(); j++) {
                ShangPin x = list.get(j);
                int shangPinId = x.getId();

                if (shangPinId == deleteId) {
                    list.remove(j);
                }
            }

        }

    }

    //第六题
    public List<ShangPin> show9() {

        Collections.sort(list, new Comparator<ShangPin>() {
            @Override
            public int compare(ShangPin o1, ShangPin o2) {

                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getName().compareTo(o2.getName());
                }

                return o1.getPrice() - o2.getPrice();
            }
        });

        return list;
    }

    //第七题
    public List<ShangPin> show10(Class... args) {

        //思路 : 使用map集合用来存放传进来的参数,给传进来的参数设置一个数字,而这个数字就代表的是优先级
        Map<Class, Integer> map = new HashMap<Class, Integer>();


        //把传进来的参数设置优先级,数字越高代表优先级越大,例如第一个参数优先级为2,第二个参数优先级为1
        for (int j = 0; j < args.length; j++) {

            map.put(args[j], args.length - j);
        }
        System.out.println(map.keySet());
        System.out.println(map.values());

        //System.out.println("compare:");
        //这里使用的是冒泡排序
        //return -1 表示第一个参数向上升
        //return 1  表示第一个参数向下沉
        Collections.sort(list, new Comparator<ShangPin>() {
            @Override
            public int compare(ShangPin o1, ShangPin o2) {

                //System.out.println("o1:" + o1.getClass() + " - " + "o2:" + o2.getClass());
                //o1的优先级
                Integer aa;

                //o2的优先级
                Integer bb;

                //判断是否有优先级
                boolean a = map.containsKey(o1.getClass());
                boolean b = map.containsKey(o2.getClass());

                //System.out.println(a);

                if (a) {
                    aa = map.get(o1.getClass());
                } else {
                    aa = 0;
                }

                if (b) {
                    bb = map.get(o2.getClass());
                } else {
                    bb = 0;
                }


                //System.out.println("o1 p:" + aa + " - " + "o2:" + bb);

                // 计算o1和o2的优先级
                if (aa > bb) {
                    return -1;
                }
                if (aa < bb) {
                    return 1;
                }


                return 0;
            }
        });


        return list;
    }


}


