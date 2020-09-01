package test.com.demo01;

/**
 * 薯片类
 * @Auther: zhang_yx
 * @Date: 2020/9/1 19:00
 */
public class Chips extends Goods{

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

    /**
     * 商品成分
     */
    private String content;

    public Chips(String name, int price, String introduction, String content) {
        super();
        this.name = name;
        this.price = price;
        this.introduction = introduction;
        this.content = content;
    }

    public void print(){
        System.out.println("商品名称："+name+",商品介绍："+introduction);
    }

}
