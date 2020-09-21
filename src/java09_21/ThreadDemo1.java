package java09_21;

/**
 * Created With IntelliJ IDEA.
 * Description:饿汉模式只能有一个实例对象，因此首先要创建一个private的构造方法
 * User:ZouSS
 * Date:2020-09-21
 * Time:19:44
 **/
public class ThreadDemo1 {

    static class SingleTon{
        private SingleTon(){

        }

      private   static SingleTon instance = new SingleTon();
        public static SingleTon getInstance(){
            return instance;
        }
    }

    public static void main(String[] args) {
        SingleTon s = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s == s2);
    }
}
