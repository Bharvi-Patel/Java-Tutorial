import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int age = 30;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 88;

        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] markss = {69,65,80};

        //2-d array
        int[][] finalMarks = {{89,91,70},{68,85,94}};
        System.out.println(finalMarks[1][1]);
    }
    
}
