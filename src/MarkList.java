import java.util.*;
import java.lang.SuppressWarnings;


public class MarkList {
    public static void main (String args[]){
        ArrayList<Double> marks = new ArrayList<Double>();
        Scanner s = new Scanner(System.in);
        System.out.println("How many Students?");
        int num = s.nextInt();
        int count = 1;
        for(int j=0; j<num; j++){
            System.out.println("Enter the student mark "+count);
            double mark = s.nextDouble();
            marks.add(mark);
            count ++;

        }
        System.out.println("Student mark");
        System.out.println(marks);

        double sum =0 , highest =0;
        for ( int i=0; i<num; i++){
            double storedmark = marks.get(i);
            sum = sum + storedmark;
            if(storedmark>highest){
                highest = storedmark;
            }
        }
        double average = sum/num;
        System.out.println("Average mark is"+average);
        System.out.println("highest mark is"+highest);

        //search a element in array
        System.out.println("If 60.0 is present in the array");
        System.out.println(marks.contains(60.0));

        //delete a element
        double delete = marks.remove(1);

        //change a item
        double element = marks.set(1,60.0);

        System.out.println("updated array list");
        System.out.println(marks);

        //remove with condition
        marks.removeIf(e -> (e<=30.0));
        System.out.println("After removing lowest mark");
        System.out.println(marks);

        //sublist
        System.out.println(marks.subList(1,3));

        //sorting the list
        System.out.println("ascending");
        System.out.println(Comparator.naturalOrder());
        System.out.println(marks);


        System.out.println("decending");
        System.out.println(Comparator.reverseOrder());
        System.out.println(marks);


    }
}
