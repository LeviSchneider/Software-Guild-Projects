public class PBD8 {
    public static void main(String[] args){
        //This line has a string that prints out anything in
        System.out.println("I will now count my chickens:");
        //Here we have a string concatenated with the total of the numbers being divided ('/' which divides numbers) or factored by the modulus('%' ex. 20 % 3 ---> 20 -18 = 2)
        System.out.println("Hens " + (25 + 30 / 6));
        //Same as before just this time the 25 *(multiply) 3 equeals 75 and then is factored by modulus 4 making it 3.
        System.out.println("Roosters " + (100 - 25 * 3 % 4));
        //Just a string
        System.out.println("Now I will count the eggs:");
        //A math operation where 1/4 = 0 because the code doesn't us floating points
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);//1.0 / 4.0 corrects the fraction problem.
        //Just a string
        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        //Just a string
        System.out.println("3 + 2 < 5 - 7");
        //A string concatenated with the sum 3 and 2
        System.out.println("What is 3 + 2? " + (3 + 2));
        //A string concatenated with the difference of 5 and 7
        System.out.println("What is 5 - 7? " + (5 - 7));
        //Just a string
        System.out.println("Oh, that's why it's false.");
        //Just a string
        System.out.println("How about some more.");
        //A string concatenated with a boolean that asks if 5 is greater than -2
        System.out.println("Is it greater? " + (5 > -2));
        //A string concatenated with a boolean that asks if 5 is greater than or equal to.
        System.out.println("Is it greater or equal? " + (5 >= -2));
        //A string concatenated with a boolean that asks if 5 is less than or equal to -2.
        System.out.println("Is it less or equal? " + (5 <= -2));
    
    
    }
}