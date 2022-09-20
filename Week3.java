
public class Week3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //create an array with the following values 1, 5, 2, 8, 13, 6
   int[] numbers = new int[7];
    numbers[0] = 1;
    numbers[1] = 5;
    numbers[2] = 2;
    numbers[3] = 8;
    numbers[4] = 13;
    numbers[5] = 6;
    numbers[6] = -1;
    //print out the first element in the array
    System.out.println(numbers[0]);
    //print out the last element in the array with using the number 5
    System.out.println(numbers[numbers.length -1]);
    //print out the element in array at position 6. what happens?
    //System.out.println(numbers[6]);
    //print out the element at position -1. what happens?
    //System.out.println(numbers[-1]);
    
    //write a traditional for loop that prints out each element in the array
    for(int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    //write an enhanced for loop that prints out each element in the array
    for(int i : numbers) {
      System.out.println(i);  
    }
    
    //create a new variable called sum, write a loop that adds each element in the array to the sum
    int sum = 0; 
    for(int i : numbers) {
      sum += i;
    }
    System.out.println(sum);
    
    //create a new variable called average and assign the average value to it 
    int average = sum / numbers.length;
    System.out.println(average);
    
    //write an enhanced for loop that prints out each number in the array only if the number is odd
    for(int i : numbers) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
   //create an array that contains the values "Sam", "Sally", "Thomas", and "Robert".
    String[] names =  {"Sally", "Thomas", "Sam", "Robert"};
    
    //calculate the sum of all the letters in the new array
    int sumOfLetters = 0;
    for(String name : names) {
     sumOfLetters += name.length();
    }
    //write and test a method that takes a String name and prints out a greeting, this method returns nothing 
    greet("Tom");
    greet("Sally"); 
    
    //write and test a method that takes a String name and returns a greeting, do not print in the method.
    System.out.println(greet2("KG")); 
    
    //analyze the difference between the two methods - what do you find? How are they different?
    //write and test a method that takes a String and an int and returns true if the number of letters in the String is greater than the int.
    System.out.println(isStringLongerThanNumber("James", 1));
    
    //write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array.
    System.out.println(doesArrayContainString(names, "KG"));
    
    //write and test a method that takes an array of int and returns the smallest number in the array
    System.out.println(findSmallestNumber(numbers)); 
    
    //write and test a method that takes an array of double and returns the average 
    double[] doubles = {45.7, 30.2, 67.3};
      System.out.println(findAverage(doubles));
      
    //write and test a method that takes an array of Strings and returns an array of int where each element matches the length of string in that position
    int[] nameLengths = extractStringLengths(names);
    for(int number : nameLengths) {
      System.out.println(number);
    }
      
    
    //write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an even amount of letters is greater than the sum of those
    //with an odd amount of letters
    System.out.println(hasMoreEvenWordCharachters(names));
    
    //write and test a method that takes a string and returns true if the string is a palindrome
    System.out.println(isPalindorm("mom"));
    
  }
  
  public static boolean isPalindorm(String string) {
    //racecar, mom, wow
    for(int i = 0; i < string.length(); i++) {
      if(string.charAt(i) != string.charAt(string.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
  
  public static void greet(String name) {
    System.out.println("Hello, " + name + "!");    
  }
  
  public static String greet2(String name) {
    return "Hi, " + name + "!";
  }
  
  public static boolean isStringLongerThanNumber(String string, int number) {
    return string.length() > number;
  }
  
  public static boolean doesArrayContainString(String[] array, String string) {
    for(String str : array) {
      if (str.equals(string)) {
        return true; 
      }
    }
       return false; 
  } 
  
  public static int findSmallestNumber(int[] array) {
    int smallest = array[0];
    for(int number : array) {
      if(number < smallest) {
        smallest = number;        
      }
    }
    return smallest;
  }
  
  public static double findAverage(double[] array) {
    double sum = 0;
    for (double number : array) {
      sum += number;
    }
    return sum / array.length; 
  }
  
  public static int[] extractStringLengths(String[] strings) {
    int[] results = new int[strings.length];
     for(int i = 0; i < strings.length; i++) {
       results[i] = strings[i].length();
     }
    return results;
  }
  
  public static boolean hasMoreEvenWordCharachters(String[] array) {
    int evenLetters = 0;
    int oddLetters = 0;
    
    for(String string : array) {
      if(string.length() % 2 == 0) {
        evenLetters += string.length();
      } else {
        oddLetters = string.length();
      }
    }
    return evenLetters > oddLetters;
    
  }
    
}    
