package my;

public class Programmer extends Thread{
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("Coding...Fix Bug"+i);
    }
  }
}
