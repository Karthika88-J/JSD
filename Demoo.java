
class Demoo{
    public static void main(String[] args) {

        //String 18 methods 
        String name="KarTHika";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        //control+shift+~
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("H"));
        System.out.println(name.equals("karthika"));
        System.out.println(name.equalsIgnoreCase("karthika"));
        System.out.println(name.substring(5));
        System.out.println(name.substring(4, 7));
        System.out.println(name.concat("karur"));
        System.out.println(name.compareTo("arivu"));
        System.out.println(name.compareTo("serlin"));
        System.out.println("g".hashCode());
        System.out.println("a".hashCode());



        //replace method of string 
        String namet="ashika";
        //when ever "a" apperars replace the "o"
        System.out.println(namet.replace('a', 'o'));
        //checking the starting word as we declared on it both the cps also checking 
        System.out.println("start with:"+namet.startsWith("Ashi"));
        System.out.println("start with:"+namet.startsWith("ash"));
        //checking the last of the the declared string 
        System.out.println("ends with :"+namet.endsWith("ka"));
        System.out.println("ends with:"+namet.endsWith("er"));
        //Repeat method
        System.out.println(""+name.repeat(10));
        //when we declared a same variable as declared in above,it acceptoble from another time and replace after declared variable
        name="kal,vi,edu,cat,tion";

        String arr[]=name.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(name);

    //array length finding length not be using parathesis for array using in string
    System.out.println(arr.length); //op 5
    name="eat";
    //it check the maches as we check on it,it dont botherate the "."leters only check the variables 
    System.out.println(name.matches(".at"));


    // Math Function 
System.out.println(Math.PI);
System.out.println(Math.sin(0));
System.out.println(Math.cos(0));
System.out.println(Math.tan(0));
//ceil is declaring higher of the that value
System.out.println(Math.ceil(12.10));//13.0
System.out.println(Math.ceil(-12.10));//-12.0
//floor is using the before value 
System.out.println(Math.floor(12.90));//12.0
System.out.println(Math.floor(-12.90));//-13.0
    //the round is using round of value before .50 it declore 12 after it declate 13
System.out.println(Math.round(12.52));//13.0
System.out.println(Math.round(12.49));//12.0
//
System.out.println(Math.sqrt(49));
System.out.println(Math.abs(-100));
System.out.println(Math.max(11, 33));
System.out.println(Math.min(33, 69));
System.out.println(Math.exp(0));
System.out.println(Math.floorDivExact(13, 5));



}
}