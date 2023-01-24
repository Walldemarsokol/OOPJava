//public class Main {
//    //main - точка входа в праограмму
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

//Имея две двоичные строки a и b, верните их сумму в виде двоичной строки.
//class Solution {
//    public String addBinary(String a, String b) {
//        if (a.length() < b.length()) {
//            String temp = a;
//            a=b;
//            b = temp;
//        }
//
//        int j = b.length() - 1;
//        int carry = 0;
//        String res = "";
//        for (int i = a.length()-1; i >=0;i--){
//            if(a.charAt(i) =='1') {
//                carry +=1;
//            }
//
//            if (j >=0 && b.charAt(j) == '1') {
//                carry +=1;
//            }
//
//            res = (carry%2) + res;
//            carry = carry /2;
//            j=j-1;
//        }
//
//        if(carry==1){
//            res =1 +res;
//        }
//
//        return res;
//
//    }
//}


//Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.
//class Solution {
//    public int subtractProductAndSum(int n) {
//        int prod = 1;
//        int sum = 0;
//        while(n>0){
//            int digit = n%10;
//            prod = prod * digit;
//            sum = sum + digit;
//
//            n = n/10;
//        }
//        return prod - sum;
//    }
//}

//Даны два неотрицательных целых числа, num1 и num2, представленные в виде строки,
// верните сумму num1 и num2 в виде строки.
//
//Вы должны решить проблему без использования какой-либо встроенной
// библиотеки для обработки больших целых чисел (например, BigInteger).
// Вы также не должны преобразовывать входные данные в целые числа напрямую.

//class Solution {
//    public String addStrings(String num1, String num2) {
//        if (num1.length() < num2.length()) {
//            String temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//
//        int j = num2.length() - 1;
//        int carry = 0;
//        String res = "";
//        for (int i = num1.length() - 1; i >= 0; i--) {
//            carry += (num1.charAt(i) - '0');
//
//            if (j >= 0) {
//                carry += (num2.charAt(j) - '0');
//            }
//
//            res = (carry % 10) + res;
//            carry = carry / 10;
//            j = j - 1;
//        }
//
//        if (carry == 1) {
//            res = 1 + res;
//        }
//
//        return res;
//
//    }
//}

//Вам даны две строки word1 и word2. Объедините строки,
//        добавляя буквы в чередующемся порядке, начиная со слова1.
//        Если строка длиннее другой, добавьте дополнительные
//        буквы в конец объединенной строки.
//        Вернуть объединенную строку.

//public class Main {
//    class Solution {
//        public void moveZeroes(int[] nums) {
//            int copyInd = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] != 0) {
//                    nums[copyInd] = nums[i];
//                    copyInd += 1;
//                }
//            }
//
//            while(copyInd<nums.length){
//                nums[copyInd]=0;
//                copyInd +=1;
//            }
//        }
//
//    }
//}

class Solution {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd += 1;
            }
        }
        while (copyInd < nums.length) {
            nums[copyInd] = 0;
            copyInd += 1;
        }
    }
}