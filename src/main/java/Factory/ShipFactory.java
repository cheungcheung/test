package Factory;

public class ShipFactory implements ShangPingFactory {
    @Override
    public ShangPing getShangPing() {





        return new Ship();
    }
}
