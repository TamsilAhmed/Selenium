package seleniumlearning;

import org.testng.annotations.Test;

public class WordCount {
	
	@Test
	
	public void Words() {
		
		int count;
		String word = "This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 225,772 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons Attribution/Share-Alike License 3.0 and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk."; 
        
        //Converts the string into lowercase    
       String words = word.toLowerCase();    
            
        //Split the string into words using built-in function    
        String words1[] = words.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words1.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words1.length; j++) {    
                if(words1[i].equals(words1[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words1[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words1[i] != "0")    
                System.out.println(words1[i]);    
        }    
    }    

}
