package Programs;

public class SingleTonClass {

    private static SingleTonClass instance;
    public  synchronized static SingleTonClass getInstance()
    {

        if(instance==null)
        {
            instance= new SingleTonClass();
            System.out.println("New object is created!");
        }
        else {
            System.out.println("Object already exists!");
        }
        return  instance;
    }
    public  void  message(String str)
    {

        System.out.println(str);
    }
}
