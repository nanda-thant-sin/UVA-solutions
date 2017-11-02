import java.util.HashSet;
import java.util.Scanner;
public class Main {
	static HashSet<String> article=new HashSet<String>();
	static HashSet<String> noun=new HashSet<String>();
	static HashSet<String> verb=new HashSet<String>();
	static boolean[] visited=new boolean[100];
	static int visitedCount=0;
    public static void main(String[] args) {
        article.add("a");
        article.add("the");
        noun.add("tom");
        noun.add("jerry");
        noun.add("goofy");
        noun.add("mickey");
        noun.add("jimmy");
        noun.add("dog");
        noun.add("cat");
        noun.add("mouse");
        verb.add("hate");
        verb.add("hates");
        verb.add("love");
        verb.add("loves");
        verb.add("know");
        verb.add("knows");
        verb.add("like");
        verb.add("likes");
    	Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
        	String s=sc.nextLine();
        	if(isStatement(s)){
        		System.out.println("YES I WILL");
        	}
        	else{
        		System.out.println("NO I WON'T");
        	}
        }
        sc.close();
    }
    static boolean isStatement(String s){
    	if(s.contains(" , ")){
    		String[] ss=s.split(" , ");
    		return (isStatement(ss[0]) && isAction(ss[1]));
    	}
    	else{
    		return isAction(s);
    	}
    }
    static boolean isAction(String s){
    	String[] ss=s.split(" ");
    	for(int j=0;j<ss.length;j++){
    		if(isVerb(ss[j])){
    			String[] sss=s.split(" "+ss[j]+" ");
    			return (isActiveList(sss[0]) && isActiveList(sss[1]));
    		}
    	}
    	return false;
    }
    static boolean isActiveList(String s){
    	if(s.contains(" and ")){
    		String[] ss=s.split(" and ");
    		return (isActiveList(ss[0]) && isActor(ss[1]));
    	}
    	else{
    		return isActor(s);
    	}
    }
    static boolean isActor(String s){
    	String[] ss=s.split(" ");
    	if(ss.length==1)
    		return isNoun(s);
    	else
    		return (isArticle(ss[0]) && isNoun(ss[1]));
    }
    static boolean isVerb(String s){
    	if(verb.contains(s))
    		return true;
    	else
    		return false;
    }
    static boolean isNoun(String s){
    	if(noun.contains(s))
    		return true;
    	else
    		return false;
    }
    static boolean isArticle(String s){
    	if(article.contains(s))
    		return true;
    	else
    		return false;
    }
}
