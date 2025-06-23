// Inheritance = Reusability


class Shapes{
    String color;

    public void area(){
        System.out.println("Displays Area");
    }
}

class Triangle extends Shapes{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }

class Circle extends Shapes{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();
    }
    
}

// TYPES OF INHERITANCE :  Single Inheritance    [PARENT --> CHILD]
//                         Multilevel Inheritance [GRANDPARENT --> PARENT --> CHILD]
//                         Hierarchial Inheritance [PARENT --> CHILD_1
//                                                         --> CHILD_2]
//                         Hybrid Inheritance [Diff. types of Inheritance]