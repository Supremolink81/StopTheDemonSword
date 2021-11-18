import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    
  private String word,spacedWord,hiddenWord,shownWord;
  private String guesses;

   public Puzzle(){
       word="HELLO";
       word.toUpperCase();
       shownWord="";
       hiddenWord="";
       spacedWord="H E L L O ";
       guesses="";
       for(int i=0;i<word.length();i++){
           hiddenWord+="_";
           shownWord+="_ ";
       }
   }
   
   public boolean isUnsolved(){
       if(shownWord.equals(spacedWord))return false;
       return true;
   }
   
   public boolean makeGuess(String g){
       g=g.toUpperCase();
       guesses+=g+", ";
       if(word.indexOf(g)==-1){
           return false;
       }
       else{
          for(int i=0;i<spacedWord.length();i++){
              if(spacedWord.substring(i,i+1).equals(g)){
                  shownWord=shownWord.substring(0,i)+spacedWord.substring(i,i+1)+shownWord.substring(i+1);
              }
          }
          return true;
       }
   }
   
   public void show(){
       System.out.println("Puzzle: "+shownWord+"\n\n");
       System.out.println("Guesses: "+guesses);
   }
   
   public String getWord(){
       return word;
   }
}
