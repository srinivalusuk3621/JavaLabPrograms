
class InvalidCountryException extends Exception
{
    InvalidCountryException()
    {
        super();
    }

    InvalidCountryException(String msg)
    {
        super(msg);
    }
}
class  task7a
{
    void registerUser(String userName, String userCountry) throws InvalidCountryException
    {
        if(!userCountry.equals("India"))
        {
            throw new InvalidCountryException("User outside India cannot be registered");
        }
        else
        {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String args[])
    {
        task7a ur = new task7a();

        try
        {
            ur.registerUser("Ravi", "USA");
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            ur.registerUser("Anita", "India");
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
