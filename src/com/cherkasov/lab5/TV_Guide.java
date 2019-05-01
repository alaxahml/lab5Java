package com.cherkasov.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TV_Guide {
    private ArrayList<Channel> channels=new ArrayList<Channel>();

    class Channel{
        private Map<Double,String> timemap=new HashMap<Double, String>();
        private ArrayList<Double> time=new ArrayList<Double>();
        private String name;
    }

    public void addChannel(String name){
        channels.add(new Channel());
        channels.get(channels.size()-1).name=name;
    }

    public void addProgramm(int i,double time,String prog) throws Exception{

        if(time<0 || time>=24 || i>channels.size() || i<0){
            throw new Exception();
        }

        channels.get(i).time.add(time);
        channels.get(i).timemap.put(time,prog);
    }

    public void show(int a) throws Exception{
        if(a>channels.size() || a<0){
            throw new Exception();
        }
        Collections.sort(channels.get(a).time);
        System.out.println(channels.get(a).name);

        if(channels.get(a).time.size()==0){
            System.out.println("No programms at all!");
        }

        for(int i=0;i<channels.get(a).time.size();i++){
            System.out.print(channels.get(a).time.get(i));
           System.out.println(channels.get(a).timemap.get(channels.get(a).time.get(i)));
        }
    }


}
