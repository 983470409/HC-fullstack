package test.com.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zhang_yx
 * @Date: 2020/8/26 18:50
 */
public class DetailMachion {

    private List<Goods> goodsList = new ArrayList<>();


    /**
     * 今日收入
     */
    private int income;


    /**
     * 库存
     */
    private int store;

     private String sign;

     DetailMachion(int store){
        this.store = store;
    }

    DetailMachion(){

    }

    /**
     * 添加饮料
     * @param goods
     */
    public void addGoods(Goods goods){
         this.goodsList.add(goods);
    }



    public void print(){
        for (int i = 0; i < goodsList.size(); i++) {
            goodsList.get(i).print();
        }
    }

    void printIncome(){
        System.out.println(income);
    }

    /**
     * 补货
     * @param count
     */
    void fillStore(int count){
        store  = store + count;
    }

    /**
     * 展示库存
     */
    void showStore(){
        System.out.println(store);
    }

    public int getIncome(){
        return this.income;
    }

}
