package com.doit.mislenious;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakTheJVM {
    public static void main(String[] args) {
        int i = 0;
        List list = new ArrayList(1000);
        while (true){
            Map map = new HashMap();
            list.add(map);
//            System.out.println(" here I am "+i);
            i++;
        }

    }
}
