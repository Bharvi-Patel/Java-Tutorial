public class exceptions {
    public static void main(String[] args) {
        //try-catch in Exception Handling
        int[] marks = {45,65,54};
        try{
        System.out.println(marks[5]);//this would guve "Index out of bound" exception
        }catch(Exception exception){
        //do something after catching
        }
        System.out.println("We all die alone.");
    }
}
