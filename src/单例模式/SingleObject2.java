package 单例模式;

public class SingleObject2 {
        private static SingleObject2 singleObject2;
        private SingleObject2(){
            System.out.println("创建了对象");
        }
        public static SingleObject2 getInstance(){
            return singleObject2;
        }
}
