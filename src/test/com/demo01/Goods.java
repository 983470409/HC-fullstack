package test.com.demo01;

/**
 * @Auther: zhang_yx
 * @Date: 2020/9/1 19:04
 */
public class Goods {

    private String name;

    private int price;

    private String introduction;

    public void print(){
        System.out.println("商品名称："+name+",商品介绍："+introduction);
    }

    public void say(){
        System.out.println("hello, i am goods");
    }

}
