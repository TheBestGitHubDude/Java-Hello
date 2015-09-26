public class Main{

static String
 answer,
 name;


  public static void main (String args[]){
    System.out.println("Hello Aliens!!" );
    System.out.println("BE bad" );
    System.out.println("Stop it!!" );
    answer = System.console().readLine();
    System.out.println("You will not live!!" );
    name = answer;

    System.out.println("Who is that behind you? Al Capone or Charles Manson  " );
    if(answer.toLowerCase().equals("Al Capone")){
      answer = System.console().readLine();
    }


  }//..

}// End Main
