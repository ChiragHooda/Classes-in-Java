class parent{
    parent(){
        System.out.println("I am parent class.\n");
    }
    parent(int x){
        System.out.println("I am parent class with x= "+x+". This is the overloaded output.\n");
    }
}
class derived extends parent{
    derived(){
        System.out.println("I am derived class.\n");
    }
    derived(int x, int y){
        super(x);
        System.out.println("I am derived class with y= "+y+". This is the overloaded output.\n");
    }
}
class childofderived extends derived{
    childofderived(){
        System.out.println("I am child of derived class.\n");
    }
    childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("I am child of derived class with z= "+z+". This is the overloaded output.\n");
    }
}


public class CWH_46{
    public static void main(String[] args){
        System.out.println("This is the output of parent class calling.");
        parent p= new parent(14);
        System.out.println("This is the output of derived class calling.");
        derived d= new derived(14,9);
        System.out.println("This is the output of child of derived class calling.");
        childofderived cod= new childofderived(14,9,0);
    }
}