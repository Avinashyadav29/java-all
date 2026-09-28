public class string_lec_4{
    public static void main(String[]args){
 //PROBLEM 1 :- cONVERTING STRING TO LOWER CASE
          String name = "JACK PACKER";
          name = name.toLowerCase();
          System.out.println(name);
//PROBLEM 2 :- CONVERTING STRING TO UPPER CASE
          String name1 = "jack packer";
          name1 = name1.toUpperCase();
          System.out.println(name1);
//PROBLEM 3 :- TRIMMING THE STRING
          String name2 = "   jack packer   ";
          name2 = name2.trim();
          System.out.println(name2);
//PROBLEM 4 :- REPLACING THE STRING
          String name3 = "jack packer";
          name3 = name3.replace("jack","jill");
          System.out.println(name3);
//PROBLEM 5 :- CHECKING THE STRING IS EMPTY OR NOT
          String name4 = "";
          System.out.println(name4.isEmpty());
//PROBLEM 6 :- CHECKING THE STRING IS EQUAL OR NOT
          String name5 = "jack packer";
          String name6 = "jack packer";
          System.out.println(name5.equals(name6));
//PROBLEM 7 :- CHECKING THE STRING IS EQUAL OR NOT IGNORING CASE
          String name7 = "jack packer";
          String name8 = "JACK PACKER";
          System.out.println(name7.equalsIgnoreCase(name8));                                                  
//PROBLEM 8 :- GETTING THE CHARACTER AT A PARTICULAR INDEX
          String name9 = "jack packer";
          System.out.println(name9.charAt(5));
//PROBLEM 9 :- GETTING THE INDEX OF A PARTICULAR CHARACTER
          String name10 = "jack packer";
          System.out.println(name10.indexOf('p'));      
//PROBLEM 10 :- GETTING THE LENGTH OF THE STRING
          String name11 = "jack packer";
          System.out.println(name11.length());
//PROBLEM 11 :- GETTING THE SUBSTRING OF THE STRING
          String name12 = "jack packer";
          System.out.println(name12.substring(5));
          System.out.println(name12.substring(0,4));
//PROBLEM 12 :- SPLITTING THE STRING
          String name13 = "jack packer";
          String[] arr = name13.split(" ");
          for(String a:arr){
              System.out.println(a);
          }
//PROBLEM 13 :- CONVERTING STRING TO CHARACTER ARRAY
          String name14 = "jack packer";
          char[] arr1 = name14.toCharArray();
          for(char a:arr1){
              System.out.println(a);
          }                                            
//PROBLEM 14 :- CONVERTING CHARACTER ARRAY TO STRING
          char[] arr2 = {'j','a','c','k',' ','p','a','c','k','e','r'};
          String name15 = new String(arr2);
          System.out.println(name15);
//PROBLEM 15 :- CHECKING THE STRING STARTS WITH A PARTICULAR CHARACTER
          String name16 = "jack packer";
          System.out.println(name16.startsWith("j"));
//PROBLEM 16 :- CHECKING THE STRING ENDS WITH A PARTICULAR CHARACTER
          String name17 = "jack packer";
          System.out.println(name17.endsWith("r"));
//PROBLEM 17 :- CHECKING THE STRING CONTAINS A PARTICULAR CHARACTER
          String name18 = "jack packer";
          System.out.println(name18.contains("p"));
//PROBLEM 18 :- CHECKING THE STRING IS BLANK OR NOT
          String name19 = " ";
          System.out.println(name19.isBlank());
//PROBLEM 19 :- CHECKING THE STRING IS EQUAL OR NOT IGNORING CASE
          String name20 = "jack packer";
          String name21 = "JACK PACKER";
          System.out.println(name20.equalsIgnoreCase(name21));





    }

}