public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        return "Hello, "+String.join(" ", name)+"! Welcome to "+city+", "+state+"!";
    }
}
