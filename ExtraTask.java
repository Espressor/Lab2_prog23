import java.util.Scanner;

public class ExtraTask {

    // Метод, преобразующий число из 10чной в (-10)чную сс
    public static int toNegative(int value) {
        int result = 0;
        int i = 0;

        // Проход по цифрам с конца. Если стоит на чётном месте,
        // оставляем, иначе вычитаем цифру из 10 и
        // к следующей прибавляем 1.
        while (value > 0) {
            if (i % 2 == 1) {
                result += (int) (((10 - value % 10) % 10)
                        * Math.pow(10, i));
                if (value % 10 != 0)
                    value += 10;
            } else
                result += (int) (value % 10
                        * Math.pow(10, i));
            value /= 10;
            i += 1;
        }

        return result;
    }

    public static String HexToBin(String value) {
        StringBuilder result = new StringBuilder();
        String HexNumbers = "0123456789ABCDEF";
        String[] BinNumbers = new String[16];
        for (int i = 0; i < 16; i++) {
            String st = Integer.toBinaryString(i);
            BinNumbers[i] = "";
            for (int j = 0; j < 4 - st.length(); j++)
                BinNumbers[i] += "0";
            BinNumbers[i] += st;
        }

        for (int i = 0; i < value.length(); i++)
            result.append(BinNumbers[HexNumbers.indexOf(value.charAt(i))]);

        while (result.charAt(0)=='0')
            result.deleteCharAt(0);
        return result.toString();
    }

    public static String BinToHex(String value) {
        StringBuilder result = new StringBuilder();
        String HexNumbers = "0123456789ABCDEF";

        for (int i = value.length(); i >= 0; i -= 4) {
            String st = value.substring(Math.max(i - 4, 0), i);
            result.insert(0, HexNumbers.charAt(BinToDec(st)));
        }

        return result.toString();
    }

    public static int BinToDec(String value) {
        int result = 0;
        int k = 0;
        int v1 = Integer.parseInt(value);
        while (v1 > 0) {
            result += (int) ((v1 % 10) * Math.pow(2, k));
            v1 /= 10;
            k++;
        }
        return result;
    }

    // Вызов метода
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String x = s.nextLine();
            System.out.println(HexToBin(x));
        }
    }
}
