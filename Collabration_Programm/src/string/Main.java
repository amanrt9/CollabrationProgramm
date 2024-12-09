package string;

class Main {
    public static void main(String[] args)
    {
        
        Parent obj1 = new Parent();
        obj1.add(10,20);
 //runtime polymorphism //method overriding//dynamic polymorphism
        
      Child obj2 = new Child();
        obj2.add(10,30);
        
        
    }
}
//in overriding method name no.of parameter  and return type should be same as parent class method
//it is use for reusability