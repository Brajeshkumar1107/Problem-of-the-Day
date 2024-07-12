public class IntegerToRoman {
    public String intToRoman(int num) {
        String roman = new String();

        roman = toRoman(roman, '*', 'M', '*', num/1000);
        num %= 1000;

        roman = toRoman(roman, 'M', 'C', 'D', num/100);
        num %= 100;

        roman = toRoman(roman, 'C', 'X', 'L', num/10);
        num %= 10;

        roman = toRoman(roman, 'X', 'I', 'V', num);

        return roman;
    }

    String toRoman(String roman, char max, char low, char mid, int num){

        if(num <= 3) for(int i = 1; i <= num; i++) roman += low;
        else if(num == 4){
            roman += low;
            roman += mid;
        }
        else  if (num == 5) roman += mid;
        else if (num <= 8) {
            roman += mid;
            for(int i = 6; i <= num; i++) roman += low;
        }
        else {
            roman += low;
            roman += max;
        }

        return roman;
    }
}