// Strings are immutable in java

import java.util.*;

public class stringss {
    public static void main(String[] args) {
        String a = "Thor";
        System.out.println(a);
        String surname = new String("Patel");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is "+name+" "+surname);


        //String Methods
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(0, 5));
        System.out.println(name.replace("r","a"));
        System.out.println(name.startsWith("R"));
        System.out.println(name.endsWith("k"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("k"));
        System.out.println(name.equals("Stars"));
        System.out.println(name.equalsIgnoreCase("BhArvi"));
        
        System.out.println(a.compareTo(name)<0); //checks if s1 comes before s2 lexicographically(<0) ; 

        sc.close();
    }
    
}
/*
 string is a class in java but can be used like a datatype.
 its a sequence of characters.
 Strings are immutable!!! i.e if variable surname's value is declared as Patel then we can't change it to anything else like we do with other datatypes

 STRING METHODS:- eg. String genre = "Rockk";

 (i)    genre.length():      Returns the length of String name. (5 in this case)
 (ii)   genre.toLowerCase(): Converts all the characters of the string to the lower case letters.
 (iii)  genre.toUpperCase(): Converts all the characters of the string to the upper case letters.
 (iv)   genre.trim():        Returns a new String after removing all the leading and trailing spaces from the original string.
 (v)    genre.substring(int start): Returns a substring from start to the end. Substring(2) returns “ckk”. [Note that indexing starts from 0]
 (vi)   genre.subtring(int start,int end): Returns a substring from the start index to the end index. The start index is included, and the end 
                                           is excluded.
 (vii)  genre.replace("c","o"): Returns a new string after replacing c with o. Rookk is returned in this case.(This method takes char as argument)
 (viii) genre.startsWith("Ro"): Returns true if the name starts with the string “Ro”. 
 (xi)   genre.endsWith("k"):    Returns true if the name ends with the string “k”.
 (x)    genre.charAt(2):        Returns the character at a given index position.
 (xi)   genre.indexOf("c"):     Returns the index of the first occurrence of the specified character in the given string.
 (xii)  genre.lastIndexOf("k"): Returns the last index of the specified character from the given string. 
 (xiii) genre.equals("Rock"): 	Returns true if the given string is equal to “Rockk” false otherwise
 (xiv)  genre.equalIgnoreCase("roCkK"): Returns true if two strings are equal, ignoring the case of characters.
 (xi)   System.out.println(a.compareTo(name)<0) : (<0) checks if s1 comes before s2 lexicographically 
                                                  (=0) checks if s1 and s2 are lexicographically equal
                                                  (>0) checks if s1 comes after s2 lexicographically.
   */