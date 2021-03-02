package chapterFour;

import java.util.Scanner;

public class TwelveDaysToChristmas2 {
        public static void main(String... args) {
            Scanner collector = new Scanner(System.in);
            int reader = 1;
            for ( ;reader < 12; ) {
                switch (reader) {
                    case 1 -> {
                        System.out.println("Enter Day one");
                        reader = collector.nextInt();
                        System.out.println("The First Day of christmas:\nMy true Love sent to me A partridge in a pear tree");
                        reader++;
                    }
                    case 2 -> {
                        System.out.println("Enter Day two: ");
                        reader = collector.nextInt();
                        System.out.println("The Second Day of christmas:\nMy true Love sent to me Two Turtle doves, " +
                                "and A partridge in a pear tree.");
                        reader++;
                    }
                    case 3 -> {
                        System.out.println("Enter Day three: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Third Day of christmas:
                                    My true Love sent to me Three French hens,\s
                                    Two Turtle doves,and A partridge in a pear tree""");
                        reader++;
                    }
                    case 4 -> {
                        System.out.println("Enter Day four: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Fourth Day of christmas:
                                    My true Love sent to me Four colly birds, Three French hens,\s
                                    Two Turtle doves , and A partridge in a pear tree.""");
                        reader++;
                    }
                    case 5 -> {
                        System.out.println("Enter Day five: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                     The Sixth Day of Christmas:
                                    Six geefe a laying, Five gold rings,\s
                                    Four colly birds, Three French hens,
                                    Two Turtle doves, A partridge in a pear tree.""");
                        reader++;
                    }
                    case 6 -> {
                        System.out.println("Enter Day six: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                     The Sixth Day of Christmas:
                                    Six geefe a laying, Five gold rings,\s
                                    Four colly birds, Three French hens,
                                    Two Turtle doves, A partridge in a pear tree.""");
                        reader++;
                    }
                    case 7 -> {
                        System.out.println("Enter Day Seven: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Seventh Day of christmas:
                                    My true Love sent to me Seven swans a Swimming,
                                    Six geefe a laying, Five gold rings,\s
                                    Four colly birds, Three French hens,\s
                                    Two Turtle doves, A partridge in a pear tree.""");
                    }
                    case 8 -> {
                        System.out.println("Enter Day Eight: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Eighth Day of christmas:
                                    My true Love sent to me Eight maids a milking,
                                    Seven swans a Swimming, Six geefe a laying,\s
                                    Five gold rings, Four colly birds, Three French hens,\s
                                    Two Turtle doves, and A partridge in a pear tree""");
                        reader++;
                    }
                    case 9 -> {
                        System.out.println("Enter Day Ninth: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Ninth Day of christmas:
                                    My true Love sent to me Nine drummers,
                                    Eight maids a milking, Seven swans a Swimming,
                                    Six geefe a laying, Five gold rings,Four colly birds Three French hens\s
                                    Two Turtle doves, A partridge in a pear tree.""");
                        reader++;
                    }
                    case 10 -> {
                        System.out.println("Enter Day Tenth: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Tenth Day of christmas:
                                    My true Love sent to me Ten pipers Nine drummers,\s
                                    Eight maids a milking, Seven swans a Swimming,\s
                                    Six geefe a laying, Five gold rings, Four colly birds,\s
                                    Three French hens Two Turtle doves, and A partridge in a pear tree.""");
                    }
                    case 11 -> {
                        System.out.println("Enter Day Eleventh: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Eleventh Day of christmas:
                                    My true Love sent to me Eleven ladies dancing,\s
                                    Ten pipers, Nine drummers, Nine drummers,\s
                                    Eight maids a milking, Seven swans a Swimming,
                                    Six geefe a laying,  Five gold rings,\s
                                    Four colly birds Three French hens Two Turtle doves, A partridge in a pear tree.""");
                        reader++;
                    }
                    case 12 -> {
                        System.out.println("Enter Day Twelfth: ");
                        reader = collector.nextInt();
                        System.out.println("""
                                    The Twelfth Day of christmas:
                                    My true Love sent to me Twelve lords a leaping,\s
                                    Eleven ladies dancing, Ten pipers Nine drummers,\s
                                    Eight maids a milking,Seven swans a Swimming,\s
                                    Six geefe a laying, Five gold rings, Four colly birds,\s
                                    Three French hens Two Turtle doves, and A partridge in a pear tree""");
                        System.out.println("Thank you we wish you A lovely Christmas");
                        reader++;
                    }
                    default -> System.out.println("Oga no dey stress me enter correct day");
                }

            }
        }
    }

