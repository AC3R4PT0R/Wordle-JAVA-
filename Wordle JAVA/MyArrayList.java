import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyArrayList<E> 
{
  private int size; // Number of elements in the list
  private E[] data;
  /** Create an empty list */
  public MyArrayList() {
	   data = (E[])new Object[100];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
	if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }

  public String toString() {
    String result=" ";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int size() {
    return size;
  }
  
 public boolean sortList() {
    E hold;
	for (int i = 0; i < size-1; i++)
	 {
	   for (int j = 0; j<size-1; j++)
	    {  	 
	     if(((Comparable)data[j]).compareTo(data[j+1])>0)
	      {
	       hold= data[j+1];
	       data[j+1]=data[j];
	       data[j]=hold;
	      }       
	   }
     } 
	 return true;	  	
  }

public String checkChar(){
	
	char CorrectAnswerArray[] = new char[5];
	char UserAnswerArray[] = new char[5];
	char TestAnswerArrayAlpha[] = new char[5];
	char TestAnswerArrayBeta[] = new char[5];
	char TestAnswerArrayCharley[] = new char[5];
	char FinalTestAnswerArray[] = new char[5];
	String Correctword = "admin";
	String sTestAnswer = "";

	FinalTestAnswerArray.size = 0;
	String wordE = "";
	wordE = data;
		for(int i=0;i<5;i++){
				UserAnswerArray[i] = data.charAt(i);							//Assign User entered word into UserAnswerArray
			}
			for(int j=0;j<5;j++){
				CorrectAnswerArray[j] = Correctword.charAt(j);					//Assign correct word to CorrectAnswerArray
			}
		
			for(int k=0;k<5;k++){//Test A
				if(CorrectAnswerArray[k] == UserAnswerArray[k])
					{
						TestAnswerArrayAlpha[k] = 'A';
					}
			} 
		
			for(int l=0;l<5;l++){
				for(int m=0;m<5;m++){//Test B
				if(CorrectAnswerArray[l] == UserAnswerArray[m])
					{
						TestAnswerArrayBeta[m] = 'B';
					}
				}
			}
			
			for(int n=0;n<5;n++){//Test C
				if(CorrectAnswerArray[n] != UserAnswerArray[n])
					{
						TestAnswerArrayCharley[n] = 'C';
					}
			}
			
			for(int n=0;n<5;n++){
				if(TestAnswerArrayAlpha[n] == 'A')
				{
					FinalTestAnswerArray[n] = TestAnswerArrayAlpha[n];
				}else if(TestAnswerArrayBeta[n] == 'B'){
					FinalTestAnswerArray[n] = TestAnswerArrayBeta[n];
				}else{
					FinalTestAnswerArray[n] = TestAnswerArrayCharley[n];
				}
			}
			for(int n=0;n<5;n++){
				sTestAnswer = sTestAnswer + FinalTestAnswerArray[n];
			}
			return sTestAnswer;
				
           
	}   
	public boolean checkWin(){
		String FinalwordAnswer = "";
		FinalwordAnswer = FinalwordAnswer + data;
		if(FinalwordAnswer.equals("AAAAA"))
			{
				return true;
			}else{
				return false;
			}
			
	}
 
}