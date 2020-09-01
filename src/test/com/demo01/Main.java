package test.com.demo01;

/**
 * @Auther: zhang_yx
 * @Date: 2020/9/1 16:54
 */
public class Main {


    public static void main(String[] args) {
        DetailMachion dm = new DetailMachion();
        Drink drink = new Drink("可乐",3,"这是一罐可口可乐");
        Chips chips = new Chips("百事薯片",10,"这是薯片","糖");
        dm.addGoods(drink);
        dm.addGoods(chips);
        dm.print();
        Goods goodsA= new Goods();
        Goods goodsB = new Drink("可乐",3,"这是一罐可口可乐");
    }


}
