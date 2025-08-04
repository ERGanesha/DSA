package DSA;

import java.util.HashSet;

public class DuplicateCheck_HASHSET {
    public static void main(String [] agr)
    { int no;
        int [] arr={10,20,30,40,0};
        HashSet<Integer> set=new HashSet<>();
        boolean hasduplicate=false;

        for(int num :arr)
        {
            if(set.contains(num))
            {
               hasduplicate=true;
               no=num;
               break;
            }
            set.add(num);
        }
        if(hasduplicate)
        {
            System.out.println("Duplicate fount ");
        }
        else
        {
            System.out.println("Duplicate Not Found");
        }

    }
}
