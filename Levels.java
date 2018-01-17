import cs1.Keyboard;
public class Levels {
  static String Level1 = "Find the next number!";
  static int corr1 = 0;
  static String Level2 = "What year did Columbus arrive to America";
  static String Level3 = "Complete the lyrics! \n I gotta _______ that tonight's gonna be a good night. ";
  static String corr3= "feeling";
  static int userIn;
  static String userStr;

  public static String Level_1(){
    int i = (int)(Math.random() *10);
    String b = "";
    for(int a = 0; a<5; a++){
      b += i + ", ";
      i+= 2;
    }
    b+= "_";
    //return b;
    corr1 = i;
    //System.out.println(corr1);
    return b;
  }

public static void play(){
      System.out.println(Level1);
      System.out.println(Level_1());
      //Thread.sleep(500);
      userIn = Keyboard.readInt();
      if (userIn == corr1){
        System.out.println("Correct! Move on to Level 2");
        System.out.println(Level2);
        userIn = Keyboard.readInt();
        if (userIn == 1492){
          System.out.println("Correct! On to Level 3!");
          System.out.println(Level3);
          userStr = Keyboard.readString();
          if (userStr.equals(corr3)){
            System.out.println("You are a pro! You're  not failing miserably in high school");
          }
          else{
            System.out.println("Incorrect. Sorry");
          }
        }
        else{
          System.out.println("Incorrect. Sorry");
        }

      }
      else{
        System.out.println("Incorrect. Sorry");
      }}

          public static void main(String args[]){
            play();
          }
    }
