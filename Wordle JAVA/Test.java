import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test 
{	
   public static void main(String arg[])
    {
	String Correctword = "admin";
	String inputlistArray[] = new String[2500];
	String sReadLine; 
	int count = 0;
	MyArrayList<String> list = new MyArrayList<>();
	MyArrayList<String> list2 = new MyArrayList<>();
	String FinalwordAnswer = "";
	String FinalWin = "";
	//File f1=new File("input.txt");
	//FileReader fr = new FileReader(f1);
    //BufferedReader br = new BufferedReader(fr);
	//sReadLine=br.readLine();
	//while (sReadLine != null) {
    //        inputlistArray[count] = listOfStrings.toArray(new String[0]);;
    //        sReadLine = bf.readLine();
    //     }
	
     Scanner in = new Scanner(System.in);   
     //Creat a new array list with default word
	 list.add(0,new String(""));
	 
	 //Create a new array list to store returned list.
	 //list.add(1,new String(""));
     String wordE, wordFF; //Verables to store the word entered and the word from the list.
     File f1=new File("input.txt");   
     Boolean valid = false;
	 System.out.println("\nA means that the letter is in the correct place"); 
	 System.out.println("\nB means that the letter is in the word but in the incorrect spot");
	 System.out.println("\nC means that the letter is wrong");
     for(int x=0;x<5;x++)//run 5 time user get 5 guesses.
       {
           System.out.println("Guess the five-letter word." + "\nLetters you guess are : ");
           wordE = in.nextLine();
          if(wordE.length()==5) //Check if word entered is a 5 letter word.
          {
           try{ //Open the file to read the words in the list.
               FileReader fr = new FileReader(f1);
               BufferedReader br = new BufferedReader(fr);
               while((wordFF=br.readLine())!=null)
                {
                 if(wordFF.equals(wordE))//check if the word entered is in the list
                  {
                   valid = true;
                  }
                }

              if(valid)
               {
                	FinalwordAnswer = list.checkChar(wordE);
					//System.out.println(FinalwordAnswer);
               }
			fr.close();
          }catch (IOException e) {
           System.out.println("File Read Error");} 
         }else valid = false; 
         
         System.out.println("\nThe entered word is a valid 5 letter word: " + valid + "\n"); 
		 
		 System.out.println(FinalwordAnswer);
		 list2.add(0,new String(""));
         if(valid)
          {
			//display the feedback of the entered word
			if(FinalwordAnswer.equals("AAAAA"))
			{
				System.out.println("\nYou have won");
				x = 5;
			}else{
				System.out.println("Error");
			}
			
			//FinalWin = list2.checkWin(FinalwordAnswer);
			//System.out.println(FinalWin);
			//display the result of the feedback (Winner, Try again, Looser)
            
          }
         valid = false;
         //System.output.clear();
       }
    }  
    
}