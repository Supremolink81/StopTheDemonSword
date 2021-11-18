public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {
                             "\n"+
                             "\n"+
                             "\n"+
                             "\n"+
                             "\n"+
                             "\n",

                             "\n"+
                             "\n"+
                             "\n"+
                             "\n"+
                             "   |   \n",
                            
                             "\n"+
                             "\n"+
                             "\n"+
                             "\n"+
                             "   +   \n"+
                             "   |   \n",
                             
                             "\n"+
                             "\n"+
                             "\n"+
                             "\n"+
                             "  -+-  \n"+
                             "   |   \n",
                                
                             "\n"+   
                             "\n"+
                             "\n"+
                             "       \n"+
                             " --+-- \n"+
                             "   |   \n",
                                
                             "\n"+   
                             "\n"+
                             "\n"+
                             "\\     /\n"+
                             " --+-- \n"+
                             "   |   \n",
                                
                             "\n"+   
                             "\n"+
                             "\n"+
                             "\\  |  /\n"+
                             " --+-- \n"+
                             "   |   \n",
                             
                             "\n"+   
                             "\n"+
                             "   |   \n"+
                             "\\  |  /\n"+
                             " --+-- \n"+
                             "   |   \n",
                             
                             "\n"+   
                             "   |   \n"+
                             "   |   \n"+
                             "\\  |  /\n"+
                             " --+-- \n"+
                             "   |   \n",
                             
                             "   ^   \n"+   
                             "   |   \n"+
                             "   |   \n"+
                             "\\  |  /\n"+
                             " --+-- \n"+
                             "   |   \n",
                            };
      public HangingMan(){
          
      }
      
      public boolean isntDead(){
          if(numWrongGuesses<9)return true;
          return false;
      }
      
      public void show(){
          System.out.println(HangmanImage[numWrongGuesses]);
      }
      
      public void dieSomeMore(){
          numWrongGuesses++;
      }
        
}
