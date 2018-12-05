public class Die{

   private int numSides;
   private int value;

   	    public Die(){
             numSides = 6;
             value = (int)(Math.random()*numSides+1);
        }

        public Die(int numSides){
             this.numSides = numSides;
        }

        public int getValues(){
             return value;
        }

        public void roll(){
             value = (int)(Math.random()*numSides+1);
        }

        public String toString(){
              return "Number of sides: "+numSides+", Value: "+value;
        }
     }

