
public class main {
      public static void main(String args[]) {
    	  System.out.println("hello world!");
    	 boolean result =  hasEqualSum(1,1,2);
    	 System.out.println(result); 
    	 boolean result2 = hasTeen(19,13,4);
    	 System.out.println(result2); 
    	 boolean result3 = isTeen(19);
    	 System.out.println(result3); 
    	 boolean result4 = isLeapYear(2000);
    	 System.out.println(result4); 
    	 boolean result5 = shouldWakeUp(false,23);
    	 System.out.println(result5); 
    	 printMegaBytesAndKiloBytes(5000);
    	 long result6 = toMilesPerHour(75.114);
    	 System.out.println(result6); 
    	 boolean result7 = areEqualByThreeDecimalPlaces(3.1756, 3.175);
    	 System.out.println(result7); 
      }
      //coding-exercise-6
      public static boolean hasEqualSum(int no1, int no2, int no3) {
    	  boolean is_equal = true;
    	  int result = no1 + no2;
    	  if(result == no3) {
    		  return is_equal;
    	  } else {
    		  is_equal = false;
    		  return is_equal;
    	  }
      }
      
      //7.1
      public static boolean hasTeen(int no1, int no2, int no3) {
    	  boolean is_teen = true;
    	  if((no1>=13 && no1<=19) || (no2>=13 && no2<=19) || (no3>=13 && no3<=19)) {
    		  return is_teen;
    	  } else {
    		  is_teen = false;
    		  return is_teen;
    	  }
      }
      //7.2
      public static boolean isTeen(int no1) {
    	  boolean teen = true;
    	  if(no1>=13 && no1<=19) {
    		  return teen;
    	  } else {
    		  teen = false;
    		  return teen;
    	  }
      }
      //4
      public static boolean isLeapYear(int year) {
    	  boolean is_leap = true;
    	  if(year>=1 && year<=9999) {
    		  if(year%4 == 0) {
    			  if(year%100 == 0) {
    				  if(year%400 == 0) {
    					  return is_leap;
    				  } else {
    					  is_leap = false;
    					  return is_leap;
    				  }
    			  } else {
    				  return is_leap;
    			  }
    		  } else {
    			  is_leap = false;
				  return is_leap;
    		  }
    	  } else {
    		  return false;
    	  }
      }
      
      //3
      public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    	  if(barking) {
    		  if(hourOfDay>=0 && hourOfDay<=23) {
    			  if(hourOfDay<8 || hourOfDay>22) {
    				  return true;
    			  } else {
    				  return false;
    			  }
    		  } else {
    			  return false;
    		  }
    	  } else {
    		  return false;
    	  }
      }
      //2 
      public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    	 if(kiloBytes<0) {
    		 System.out.println("invalid value");
    	 } else {
    	       int yy = kiloBytes%1024;
    	       int xx = kiloBytes/1024;
    	       System.out.println(kiloBytes + "KB = " + xx + "MB " + "AND " + yy +"KB");
         }
      }
      //1
      
      public static long toMilesPerHour(double kilometersPerHour) {
  		if(kilometersPerHour < 0) {
  			return -1;
  		} else {
  			long milesPerHour = Math.round(kilometersPerHour * 0.621371);
  			return milesPerHour;
  		}
  	}
      //5
      public static boolean areEqualByThreeDecimalPlaces(double no1, double no2) {
    	  int xx = (int)(no1*1000);
    	 // xx = xx/1000;
    	  int yy = (int)(no2*1000);
    	  //yy = yy/1000;
    	  if(xx == yy) {
    		  return true;
    	  }
    	  else {
    		  return false;
    	  }
      }
      
}
