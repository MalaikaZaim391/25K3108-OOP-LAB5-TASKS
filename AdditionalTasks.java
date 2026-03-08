//union and intersection of arrays - DONE
//sorting string arrays - DONE
//Can a non-static method access a static field - YES


package lab5tasks;
import java.util.*;

public class AdditionalTasks {
    public static void main(String[] args) {

        String array1[] = {"Ali", "Billy", "Ahmed", "Zaid", "Kinza", "Shakeel", "Humza"};
        String array2[] = {"Ahmed", "Hashim", "Kinza", "Mia", "Umar", "Lina", "Shakeel", "Behroz"};

        //union of array 1 and 2
        HashSet<String> union = new HashSet<>();
        for(String name: array1){
            union.add(name);
        }
        for(String name: array2){
            union.add(name);
        }

        //intersection of array 1 and 2
        HashSet<String> set = new HashSet<>();
        HashSet<String> intersection = new HashSet<>();
        for(String name: array1){
            set.add(name);
        }
        for(String name: array2){
            if(set.contains(name)){
                intersection.add(name);
            }
        }

        //sorting arrays 1 and 2 from A to Z
        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("\nUnion of Sets: " + union);
        System.out.println("Intersection of Sets: " + intersection);
        System.out.println("\nSorted Array 1, A-Z : " + Arrays.toString(array1));
        System.out.println("Sorted Array 2, A-Z : " + Arrays.toString(array2));


    }



}
