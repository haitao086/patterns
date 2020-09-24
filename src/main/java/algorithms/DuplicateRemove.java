package algorithms;

import java.util.*;

public class DuplicateRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("John") ;
        list.add("Tom") ;
        list.add("Tom") ;
        list.add("John") ;
        list.add("Tom") ;
        list.add("Mary") ;
        list.add("Tom") ;

        List<String> newList = new ArrayList<>() ;
        Set<String> ts = new HashSet<>();
        for (String s : list) {
            if (ts.add(s)) newList.add(s) ;

        }

        for(String s: newList) {
            System.out.println(s);
        }
    }
}
