class Money  {
   protected int amount;
   
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount;
   }   
}


class Dollar {
   int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   void times(int multiplier) {
      amount= amount * multiplier;
   }
}

class Franc {   
   private int amount;					
   Franc(int amount) {      
      this.amount= amount;
    }					
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
     }					
}

