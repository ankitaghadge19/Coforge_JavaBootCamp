class Person extends Address{

    private String name;

    public Person(String name, String city, String country){
        super(city, country);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}