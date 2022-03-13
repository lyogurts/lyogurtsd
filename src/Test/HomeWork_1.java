package Test;

/**
 * @version: 1.0
 * @author: Lyogurts
 */

public class HomeWork_1 {
    public static void main(String[] args) {
        person person = new person();
        person.speak();
        person.getSum(14,22);
        person.cal01();
        person.calo2(50);
        
    }

}
class person{
    String name;
    int age;
    public  void speak (){
        System.out.println( "我是一个好人！");
    }
    public  void  cal01(){
        int sum=0;
        for (int i = 1; i <=1000 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public void calo2(int n){
        int sum2=0;
        for (int j = 0; j <n ; j++) {
            sum2+=j;
        }
        System.out.println(sum2);
    }
    public void getSum(int x,int y){
        System.out.println(x+y);
    }
}
