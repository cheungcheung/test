package Factory;

public class BusFactory implements ShangPingFactory {

    @Override
    public ShangPing getShangPing() {



        //System.out.println("bus生产出来了");
        return new Bus();
    }
}
