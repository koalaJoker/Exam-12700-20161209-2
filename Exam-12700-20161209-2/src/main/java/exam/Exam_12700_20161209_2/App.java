package exam.Exam_12700_20161209_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input=new Scanner(System.in);
       System.out.print("请输入工资：");
       double num=input.nextDouble();
       double money=num-3500;
       double payMoney;
       if(money<=1500){
    	   payMoney=money*0.03;
       }else if(money>1500&&money<=4500){
    	   payMoney=money*0.1;
       }else if(money>4500&&money<=9000){
    	   payMoney=money*0.2;
       }else if(money>9000&&money<=35000){
    	   payMoney=money*0.25;
       }else if(money>35000&&money<=55000){
    	   payMoney=money*0.3;
       }else if(money>55000&&money<=80000){
    	   payMoney=money*0.35;
       }else{
    	   payMoney=money*0.45;
       }
       System.out.println("所需要缴纳的税费为："+payMoney);
    }
}
