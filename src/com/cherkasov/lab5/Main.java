package com.cherkasov.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TV_Guide guide=new TV_Guide();
        System.out.println("What do you want \n" +
                "1)add Channel \n" +
                "2)add Programm \n" +
                "3)Show \n" +
                "4)Exit");
        int choice=in.nextInt();
        while (choice<4 && choice >=1) {
            switch (choice) {
                case 1:
                    String channel = in.next();
                    guide.addChannel(channel);
                break;
                case 2:
                    int chnum=in.nextInt();
                    double time=in.nextDouble();
                    in.nextLine();
                    String prog=in.nextLine();
                    try{
                        guide.addProgramm(chnum,time,prog);
                    }
                    catch (Exception e){
                      System.out.println("Wrong parameter");
                    }
                    break;
                case 3:
                    int number=in.nextInt();
                    try{
                        guide.show(number);
                    }
                    catch(Exception e){
                        System.out.println("Wrong parameter");
                    }
                    break;
                default:
                    break;

            }
            System.out.println("What do you want \n" +
                    "1)add Channel \n" +
                    "2)add Programm \n" +
                    "3)Show \n" +
                    "4)Exit");
             choice=in.nextInt();
        }
    }
}
