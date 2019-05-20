class Money {
   ...
   static Money dollar(int amount)  {
      return new Dollar(amount);
   }
   
   static Money franc(int amount) {
      return new Franc(amount);
    }
} 

class Dollar {
   ...
   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }								
}    

class Franc {
   ...
   Money times(int multiplier)  {
      return new Franc(amount * multiplier);
   }								
}    