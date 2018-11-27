package com.hiya.sa.oom;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.List;
public class OomClient
{
    public static void main(String[] args)
    {
        List<User> persons = new ArrayList<User> (100000000);
        MemoryMXBean mem = ManagementFactory.getMemoryMXBean();
        
        //3799515136
        System.out.println("heapMax:"+mem.getHeapMemoryUsage().getMax()/1024/1024/8);
        
        System.out.println("heapMin:"+mem.getHeapMemoryUsage().getInit()/1024/1024/8);
       while(true)
        {
            //persons.add( new User("liuhai","male",25));
            //System.out.println("heapCurr=="+mem.getHeapMemoryUsage().getUsed()/1024/1024/8 );
        }
       
    }
}
