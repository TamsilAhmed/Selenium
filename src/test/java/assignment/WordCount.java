package assignment;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class WordCount {
	
	@Test
	
	public void Words() {
		
		String word = "This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 225,772 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons Attribution/Share-Alike License 3.0 and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk.";
		String[] words = word.split(" ");
		
		Map<String,Integer> wc = new HashMap<String,Integer>();
		
		for(String word1 : words) {
			if(wc.containsKey(word1)) {
				
			wc.put(word1, wc.get(word1)+1);
			
		}else {
			wc.put(word1, 1);
		}
		
		}
		System.out.println(wc);
		System.out.println(wc.size());
}
	
	
	@Test
	public void character() {
		
		String Sentence = "This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 225,772 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons Attribution/Share-Alike License 3.0 and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk.";
		char[] word = Sentence.toCharArray();
		
		Map<Character,Integer> Cc = new HashMap<Character,Integer>();
		
		for(Character ch : word) {
			if(Cc.containsKey(ch)) {
				
				Cc.put(ch, Cc.get(ch)+1);
			}else {
				Cc.put(ch, 1);
			}
			
		}
		System.out.println(Cc);
		System.out.println(Cc.size());
	}
}