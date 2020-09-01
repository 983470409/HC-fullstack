package test.com.demo01;

/**
 * @Auther: zhang_yx
 * @Date: 2020/9/1 18:53
 */
public class Drink extends Goods{

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private int price;

    /**
     * 商品介绍
     */
    private String introduction;

    public Drink(String name, int price, String introduction) {
        this.price = price;
        this.introduction = introduction;
    }

    public void print(){
        System.out.println("商品名称："+name+",商品介绍："+introduction);
    }

}
