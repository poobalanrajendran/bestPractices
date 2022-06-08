package com.chainsys.bestPractices.abstractDemo;

public interface Ispelling {
	void spellCheck(String word);
	void checkGrammar(String sentence);
	int wordCount(String sentence);

}
abstract class Language implements Ispelling{
	@Override
	public int wordCount(String sentence) {
		String [] words=sentence.split(" ");
		return words.length;
	}
}

class EnglishLanguage implements Ispelling
{

	@Override
	public void spellCheck(String word) {
		// TODO Auto-generated method stub
		System.out.println("english spellgrammar");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("English checGrammar");
		
	}

	@Override
	public int wordCount(String sentence) {
		String [] words=sentence.split(" ");
		return words.length;
	}
	
}
class tamilLanguage extends Language implements Ispelling
{

	@Override
	public void spellCheck(String word) {
		// TODO Auto-generated method stub
		System.out.println("tamil spellgrammar");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("tamil checGrammar");
		
	}

	
}
class FrenchLanguage extends Language implements Ispelling
{

	@Override
	public void spellCheck(String word) {
		// TODO Auto-generated method stub
		System.out.println("french spellgrammar");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("french checkGrammar");
		
	}

	
	
}