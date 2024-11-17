package frog;


import java.util.Objects;
import java.util.Scanner;
public class frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //char symbol = sc.next().charAt(0);
       // String symbol = sc.nextLine();
         int []arab = new int[10];
         arab[0]=10;
         arab[1]=1;
         arab[2]=2;
         arab[3]=3;
         arab[4]=4;
         arab[5]=5;
         arab[6]=6;
         arab[7]=7;
         arab[8]=8;
         arab[9]=9;

         //int[]arab = {10,1,2,3,4,5,6,7,8,9};

     String[]rome = new String[10];
       rome[0]="X";
       rome[1]="I";
       rome[2]="II";
       rome[3]="III";
       rome[4]="IV";
       rome[5]="V";
       rome[6]="VI";
       rome[7]="VII";
       rome[8]="VIII";
       rome[9]="XI";


        if (sc.hasNextInt()){
            int num = sc.nextInt();
           for (int i = 0; i < arab.length; i++)
           {if(Objects.equals(num,arab[i])){
               System.out.println(rome[i]);}}}
           else if(sc.hasNextLine()) {
                String s = sc.nextLine();
                for (int j = 0; j < rome.length; j++) {
                    if (Objects.equals(s, rome[j])) {
                        System.out.println(arab[j]);}

                }
           }


            }


    }







