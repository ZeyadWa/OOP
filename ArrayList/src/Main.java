import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main
{
    public static void main( String[] args )
    {
//        ArrayList list = new ArrayList();
//        ArrayList<Integer> list = new ArrayList();
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<Integer>();

//        And you can declare from the Interface List with fewer methods to use!
//        List<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer>list = new ArrayList<>(100);

        // The adding method here is like vector adding method in C++ ( v.push_back(num) )
        list.add(10);
        list.add(20);
        list.add(43);
        System.out.println(list);

//        int sz = list.size();
//        for( int i = 0; i < sz; i++ )
//        {
//            System.out.println(list.get(i));
//        }
//
//        // The for each:
//        for( int i : list ) System.out.println(i);

//        // Add in the first position
//        list.add(0, 5);
//
//        // Add at the last position
//        list.add(list.size(), 50);
//        System.out.println(list);

//        // How can I add range of elements?
//        ArrayList<Integer>list2 = new ArrayList<>();
//        list2.add(100);
//        list2.add(150);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        list.addAll(Arrays.asList(200, 205, 250));
//        System.out.println(list);

//        list.addAll(1, Arrays.asList(11, 12, 13));
//        System.out.println(list);

//        // We can add elements using Copy Constructor to!
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(66, 77, 88));
//        System.out.println(list1);
//
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        System.out.println(list2);
//
//        ArrayList<Integer>list3;
//        list3 = (ArrayList)list1.clone();
//        System.out.println(list3);

//        // Overriding an element
//        list.set(0, 66);
//        System.out.println(list);

//        // Removing by index:
//        list.remove(1);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

//        // removing by value, we should cast to object first
//        list.remove((Integer) 10);
//        list.remove(Integer.valueOf(10));
//        System.out.println(list);

//        // Here we don't have to cast to object because String is already an object from class String
//        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("10","20","30"));
//        list1.remove("10");
//        System.out.println(list1);

//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(100, 100, 200, 200, 200, 300, 300, 500));
//        System.out.println(list1);

//        // You should know that remove method removes only one element!
//        list1.remove((Integer) 200);
//        System.out.println(list1);

//        // removeall method removes all elements with values you want to remove!
//        list1.removeAll(Arrays.asList(100, 200));
//        list1.removeAll(Collections.singleton(300));
//        System.out.println(list1);

//        // remove considering a condition!
//        list1.removeIf( num -> num <= 100 );
//        System.out.println( list1 );

//        // Array of Object? WTF JAVA
//        Object []a = new Object[5];
//        a[0] = 'A';
//        a[1] = "AA";
//        a[2] = 11;
//        a[3] = 11.0;
//        a[4] = true;
//
//        for( int i = 0; i < 5; i++ ) System.out.print(a[i] + " ");
//        System.out.println();
//        for( Object i : a ) System.out.print(i + " ");

        // ok if you want to know :), ArrayList is an array of object :)

//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//
//        // Contains method checks if the number is in the list or not, returns true or false
//        System.out.println(list.contains(10));

//        // retainall method keeps only the elements that matches the collection you've sent!
//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2));
//        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 4, 5, 10));
//
//        list2.retainAll(list1);
//        System.out.println(list2);
//
//        list2.retainAll(Arrays.asList(1, 4));
//        System.out.println(list2);
//
//        list2.retainAll(Collections.singleton(1));
//        System.out.println(list2);


//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        ArrayList<Integer>list2 = new ArrayList<>(list1.subList(0, 3));
//        System.out.println(list2);

//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        System.out.println(list1.isEmpty());
//        list1.clear();
//        System.out.println(list1.isEmpty());

//        // To add capacity without using the default right shift method you learnt before?
//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        list1.ensureCapacity(100);
//
//        // and to remove unused capacities
//        list1.trimToSize();

//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        list1.forEach(i -> System.out.print(i + " "));

//        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(8, 5, 6, 10, 2, 1, 5, 5, 6, 1));
//        Collections.reverse(list1);
//        System.out.println(list1);
//
//        Collections.sort(list1);
//        System.out.println(list1);
//
//        Collections.sort(list1, Collections.reverseOrder());
//        System.out.println(list1);
//
//        System.out.println(Collections.min(list1));
//        System.out.println(Collections.max(list1));

//        // Exercise1: print distinct numbers taken from user
//        ArrayList<Integer> list1 = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//
//        for( int i = 0; i < 5; i++ )
//        {
//            int temp = in.nextInt();
//            if( !list1.contains(temp) )
//                list1.add(temp);
//        }
//        System.out.println(list1);

        /*
        Exercise2:
        1. Add Element
        2. Remove Element
        3. Print Elements
        4. Exit
         */

//        ArrayList<Integer> list1 = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        while( true )
//        {
//            int i = in.nextInt();
//            int num;
//            if( i == 1 )
//            {
//                System.out.println("Enter an integer:");
//                num = in.nextInt();
//                list1.add(num);
//                System.out.println("Element added");
//            }
//            else if( i == 2 )
//            {
//                System.out.println("Enter a number to be deleted:");
//                num = in.nextInt();
//                if( !list1.contains(num))
//                {
//                    System.out.println("Element not found");
//                    continue;
//                }
//                list1.remove((Integer) num);
//                System.out.println("Element Removed");
//            }
//            else if( i == 3 )
//            {
//                System.out.println(list1);
//            }
//            else break;
//        }
    }
}