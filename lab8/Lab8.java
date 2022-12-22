public class Lab8 {
    static void isPalindrome(String s){
        if(s.length() == 1){
            System.out.println("YES"); return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO"); return;
        }
        if(s.length()==2){
            System.out.println("YES"); return;
        }
        isPalindrome(s.substring(1, s.length()-1));
    }

    static int count(int a, int b){
        if(a==0) return 1;
        if(a==1) return b+1;
        if(a>1 && b==0) return 0;
        return count(a-1, b-1) + count(a, b-1);
    }

    static int revers(int num, int rev){
        if(num==0)return rev;
        return revers(num/10, 10*rev + num%10);
    }


    public static void main(String[] args) {
//ex8
        System.out.println("\n Палиндром:");
        isPalindrome("asddsa");
        isPalindrome("asdfgh");
        isPalindrome("aa");

        System.out.println("\n Без двух нулей: ");
        System.out.println(count(0,0));
        System.out.println(count(1,5));
        System.out.println(count(2,4));


        System.out.println("\n Разворот числа: ");
        System.out.println(revers(123,0));
        System.out.println(revers(123456, 0));
    }
}