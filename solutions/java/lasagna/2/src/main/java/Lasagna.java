public class Lasagna {
   
    public int expectedMinutesInOven(){
        return 40;
    }

  
    public int remainingMinutesInOven(int minutes){
       int totalMinutes=expectedMinutesInOven();
        return totalMinutes-minutes;
    }

   
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    
       public int totalTimeInMinutes(int layers, int minutes){
         return  minutes + preparationTimeInMinutes(layers);
           
       }
    
}
