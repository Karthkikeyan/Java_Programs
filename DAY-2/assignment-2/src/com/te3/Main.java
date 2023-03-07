package com.te3;
 
import java.util.*;

public class Main {
   static Scanner s=new Scanner (System.in);
    
   public static void main(String[] args) {
	   System.out.println("ENTER THE NUMBERS");
	Integer res=UserMainCode.getLuckySum(s.nextInt(),s.nextInt(),s.nextInt());
	System.out.println(res);
}

}
