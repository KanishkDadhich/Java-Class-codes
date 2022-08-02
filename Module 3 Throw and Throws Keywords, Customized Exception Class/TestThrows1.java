import java.io.*;

class TestThrows1 {
  public static void findFile() throws IOException {
    File newFile=new File("test.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }

  public static void main(String[] args) {
   // findFile();
    try{
      findFile();
    } 
    catch(IOException e){
      System.out.println("You are in Catch Block "+e);
    }
  }
}
