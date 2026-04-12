//usage of replace and replaceAll method
class useOfREplacAll{
    public static void main(String[] args) {

        //relace of character
        String str="mava";
        System.out.println(str.replace('m','j'));

        //removal of extra spaces in a sentence
        String str2="hi      hello     how     r    u";
        System.out.println(str2.replaceAll(" +", " "));

        //removal of numbers
        String str3="h55454451i he4455l5lo ho545w are u";
        System.out.println(str3.replaceAll("[1-9]", ""));

        //uppercase letters
        String str4="Hdgyusyu6545I HELs4442dghgsjgLO HO54542154W ARE U";
        System.out.println(str4.replaceAll("[a-z1-9]",""));

        //lower case letters
        String str5="Hhi6545I HELhel4442loLO HO54542how154W AaRrEe Uu";
        System.out.println(str5.replaceAll("[A-Z1-9]",""));

        //numbers only
        String str6="Hdgyusyu6545I HELs4442dghgsjgLO HO54542154W ARE U";
        System.out.println(str6.replaceAll("[a-zA-Z]",""));

        //removal of special characters
        String str7="h$%^^&%&##i hel&%&^%%%lo ho$@$$&^&%%w a&%&$%$#re ^&%^$u";
        System.out.println(str7.replaceAll("[^a-z ]",""));

        //remove vowels
        String str8="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str8.replaceAll("[aeiou]",""));

        //remove consonents
        String str9="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str9.replaceAll("[^aeiou]",""));

        //count the charactes in a string 
        String str10="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str10.length());

        //count of consonents
        String str11="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str11.replaceAll("[aeiou]","").length());

        //count of vowels
        String str12="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str12.replaceAll("[^aeiou]","").length());


    }
}