import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = "";
        int T = scr.nextInt();
        while(T-- >= 1){
            try{
                str = scr.next();
                long l = Long.valueOf(str);
                System.out.println(l + " can be fitted in:");
                if(l == 0 || l == 1){
                    System.out.println("* boolean");
                }
                if(Byte.MAX_VALUE >= l && Byte.MIN_VALUE <= l){
                    System.out.println("* byte");
                }
                if(Short.MAX_VALUE >= l && Short.MIN_VALUE <= l){
                    System.out.println("* short");
                }
                if(Integer.MAX_VALUE >= l && Integer.MIN_VALUE <= l){
                    System.out.println("* int");
                }
                if(Long.MAX_VALUE >= l && Long.MIN_VALUE <= l){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(str + " can't be fitted anywhere.");
            }
            
        }
    }
}