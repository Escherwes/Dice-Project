public class Die{

   private int numSides;
   private int value;

   	    public Die(){
             numSides = 6;
        }

        public Die(int numSides){
             this.numSides = numSides;
        }

        public int getValues(){
             return value;
        }

        public void roll(int value){
             value = (int)(Math.random()*numSides);
        }

        public String toString(){
              return "Number of sides: "+numSides+", Value: "+value;
        }
     }

