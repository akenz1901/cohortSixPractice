package chapterFour;
import java.util.Scanner;
public class TwelveDaysToChristmas {
    public static void main(String... args){
        Scanner collector = new Scanner(System.in);
        int reader  = 1;
        String activator = """
                Press View to preview All Twelve Days of Christmas:
                
                OR
                
                Select TF for Third Day - Twelfth of Twelve Days Of Christmas
                Select FIS for Fifth Day - Twelfth Day of Twelve Days Of Christmas
                Select SE for Seventh Day - Twelfth Day of Twelve Days Of Christmas
                Select NT for Ninth Day - Twelfth Day of Twelve Days Of Christmas
                Select ET for Eleventh Day - Twelfth Day of Twelve Days Of Christmas;
                """;

        System.out.println(activator);
        while(reader > 0){
            System.out.print("Enter Your Choice Of View: ");
            String taker = collector.nextLine();
            switch (taker){
                case "View":
                    System.out.println("The First Day of christmas:\nMy true Love sent to me A partridge in a pear tree.\n" +
                            "The Second Day of christmas:\nMy true Love sent to me Two Turtle doves, and A partridge in a pear tree.");

                case "TF":
                    System.out.println("The Third Day of christmas:\nMy true Love sent to me Three French hens \nTwo Turtle doves, " +
                            "and A partridge in a pear tree. \n\n" +
                            "The Fourth Day of christmas:\nMy true Love sent to me Four colly birds, Three French hens, \nTwo Turtle doves , " +
                            "and A partridge in a pear tree.");

                case "FIS":
                    System.out.println("The Fifth Day of christmas:\nMy true Love sent to me Five gold rings," +
                            "\nFour colly birds, Three French hens " +
                            "\nTwo Turtle doves, " + "A partridge in a pear tree. \n\n" +
                            "The Sixth Day of christmas:\nMy true Love sent to me Six geefe a laying, \nFive gold rings, " +
                            "Four colly birds, Three French hens, \nTwo Turtle doves, " +
                            "and A partridge in a pear tree.");

                case "SE":
                    System.out.println("The Seventh Day of christmas:\nMy true Love sent to me Seven swans a Swimming,\n" +
                            "Six geefe a laying, Five gold rings, \nFour colly birds, Three French hens, " +
                            "\nTwo Turtle doves , " + "A partridge in a pear tree. \n\n" +
                            "The Eighth Day of christmas:\nMy true Love sent to me Eight maids a milking," +
                            "\nSeven swans a Swimming, Six geefe a laying, \nFive gold rings, " +
                            "Four colly birds, Three French hens, \nTwo Turtle doves, " +
                            "and A partridge in a pear tree.\n");

                case "NT":
                    System.out.println("The Ninth Day of christmas:\nMy true Love sent to me Nine drummers,\nEight maids a milking, " +
                            "Seven swans a Swimming," +
                            "\n Six geefe a laying, Five gold rings, \nFour colly birds Three French hens " +
                            "Two Turtle doves, " + "A partridge in a pear tree. \n\n" +
                            "The Tenth Day of christmas:\nMy true Love sent to me Ten pipers Nine drummers, \nEight maids a milking," +
                            " Seven swans a Swimming, \nSix geefe a laying, Five gold rings, " +
                            "Four colly birds, Three French \nhens Two Turtle doves, " +
                            "and A partridge in a pear tree.\n");

                case "ET":
                    System.out.println("The Eleventh Day of christmas:\nMy true Love sent to me Eleven ladies dancing, \nTen pipers, " +
                            "Nine drummers, Nine drummers, \nEight maids a milking, Seven swans a Swimming," +
                            "\nSix geefe a laying,  Five gold rings, \nFour colly birds Three French hens " +
                            "Two Turtle doves, " + "A partridge in a pear tree. \n\n" +
                            "The Twelfth Day of christmas:\nMy true Love sent to me Twelve lords a leaping, \nEleven ladies dancing, " +
                            "Ten pipers Nine drummers, \nEight maids a milking," +
                            "Seven swans a Swimming, \nSix geefe a laying, Five gold rings, " +
                            "Four colly birds, \nThree French hens Two Turtle doves, " +
                            "and A partridge in a pear tree.\n\n");
                    System.out.println("Thank you we wish you A lovely Christmas");
                    reader--;
                    break;
                default:
                    System.out.println("Oga you no dey do christmas go back and follow instruction");
                    break;

            }
        }

    }
}
