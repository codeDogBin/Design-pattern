package factory.simple;

/**
 * 汽车工厂
 */
public class CarFactory {
    public static  Car getCar(String car){
        if(car.equals("宝马")){
            return new BWM();
        }else if( car.equals("特斯拉")){
            return new Tesla();
        }else return null;
    }
}
