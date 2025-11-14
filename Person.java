public class Person
{

    //attributes

    private String first;
    private String last;
    private int age;
    private int SSN;

    //constructors

    public Person(String ifirst, String ilast, int iage, int iSSN)
    {
        first = ifirst;
        last = ilast;
        age = iage;
        SSN = iSSN;
    }

    public String toString()
    {
        return "SSN: " + SSN +  "\n\tName: " + first + " " + last + "\n\tAge: " + age;
    }

  public String getFirst()
    {
    return first;
    }

    public void updateName(String ifirst)
    {
        first = ifirst;
    }



}
