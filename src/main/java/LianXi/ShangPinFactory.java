package LianXi;

import java.util.ArrayList;
import java.util.List;

public class ShangPinFactory {

    public static  Class<ShangPin> shangPinType(Class type ) throws Exception {
        List<ShangPin> list = new ArrayList<>();

        ShangPin aaa = null;

        //Class<LianXi.ShangPin> shangPin = type.getClass().newInstance();
        //aaa =  (LianXi.ShangPin) Class.forName(type.getName()).newInstance();


        //System.out.println(aaa.getName());
        //System.out.println(type.getName());


        return null;
    }




}
