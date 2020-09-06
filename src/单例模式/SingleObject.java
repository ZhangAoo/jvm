package 单例模式;

public class SingleObject {
    private volatile static SingleObject singleObject;

    private SingleObject() {
        System.out.println("创建了对象");
    }

    public static SingleObject getInstance() {
        if (singleObject == null) {
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }
}
