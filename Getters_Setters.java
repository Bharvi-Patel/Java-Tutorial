class Emp{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }
}

public class Getters_Setters {
    public static void main(String[] args) {
        Emp Naruto = new Emp();
        // Naruto.id = 56;
        // Naruto.name = "Naruto Uzumaki";---> throws an error due to private access modidfier
        Naruto.setName("Sasuke");
        System.out.println(Naruto.getName());
        Naruto.setId(65);
        System.out.println(Naruto.getId());
        
    }
}


/*
Getters - returns value
Setters - sets/update value
 */