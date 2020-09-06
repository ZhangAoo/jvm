package 工厂模式;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static Map<Integer,Car> carMap;

    static {
        carMap=new HashMap<>();
        carMap.put(1,new Car(1,"宝马"));
        carMap.put(2,new Car(2,"奥迪"));
    }
    public static Car getCar(Integer id){
        return carMap.get(id);
    }

}
