package guru.qa;

public class FirstJavaApp {

    public static void main(String[] args) {
        char s = 's';
        byte aByte = 64;
        short aShort = 111;
        int aInt = 17;
        long aLong = 1000L;
        float aFloat = 17.11111F;
        double aDouble = 171.111D;
        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println("Складываем " + aByte + " c " + aInt + "получаем ответ" + (aByte - aInt));
        System.out.println("Вычитаем " + aByte + " из " + aInt + "получаем ответ" + (aByte - aInt));
        System.out.println("Умножаем " + aShort + " на " + aByte + "получаем ответ" + (aShort * aByte));
        System.out.println("Делим " + aLong + " на " + aByte + "получаем ответ" + (aLong / aByte));
        System.out.println("Остаток от деления " + aLong + " и " + aByte + "получаем ответ" + (aLong % aByte));
        System.out.println("Прибавляем единицу к " + aLong + " и получаем ответ" + (aLong++));
        System.out.println("Вычитаем единицу от " + aLong + " и получаем ответ" + (aLong--));

        System.out.println(s + " == " + s + " = " + (s == s));
        System.out.println(s + " != " + s + " = " + (s != s));
        System.out.println(aLong + " > " + aInt + " = " + (aLong > aInt));
        System.out.println(aLong + " < " + aInt + " = " + (aLong < aInt));
        System.out.println(aByte + " >= " + 2*aByte + " = " + (aByte >= 2*aByte));
        System.out.println(aByte + " <= " + 2*aByte + " = " + (aByte <= 2*aByte));

        System.out.println(boolTrue + " && " + boolFalse + " = " + (boolTrue && boolFalse));
        System.out.println(boolTrue + " || " + boolFalse + " = " + (boolTrue || boolFalse));
        System.out.println("!(" + boolTrue + " && " + boolFalse + ") = " + !(boolTrue && boolFalse));

        aFloat += aDouble;
        System.out.println("aFloat += aDouble " + aFloat);

        aDouble -= aFloat;
        System.out.println("aDouble -= aDouble = " + aDouble);

        aDouble *= aByte ;
        System.out.println("aDouble *= aByte = " + aDouble);

        System.out.println("byte min = " + Byte.MIN_VALUE);
        System.out.println("byte min = " + Byte.MAX_VALUE);

    }
}
