package SomeFunCheck;

public class main {
    public static void main(String[] args) {
/*
        Lion akella = new Lion();

        Map.Entry<Lion, Double> pair = Map.entry(akella, 10.8);

        Engine engine = new Engine();
        engine.fightCompare(pair, "Akella");



        Pair<String, Double> studentNameGPAPair1 = new Pair<>("Justin", 8.76);
        Pair<String, Double> studentNameGPAPair2 = new Pair<>("Jessica", 8.76);

        System.out.println("The Pair is: " + studentNameGPAPair1.toString());
        System.out.println("The Key is: " + studentNameGPAPair1.getKey());
        System.out.println("The Value is: " + studentNameGPAPair1.getValue());
*/


        //file:///F:/CODE/Java/%D0%A0%D0%B0%D0%B7%D0%BD%D0%BE%D0%B5/%D0%9A%D0%BD%D0%B8%D0%B3%D0%B8/E_G_Kanel_3_Frayman_-_Java_600_zadach_po_osnovam_programmirovania_2019.pdf
/*
        System.out.println("Задание 1.4");
        int a4 = 5;
        int b4 = 9;
        int c4 = a4 + b4;
        System.out.println(c4);

        System.out.println("Задание 1.5");
        float x5 = 7.5f;
        float a5 = x5 * 2;
        float b5 = x5 * 3;
        System.out.println(a5);
        System.out.println(b5);

        System.out.println("Задание 1.6");
        int a6 = 1 + (int)(Math.random() * 10);
        int b6 = 1 + (int)(Math.random() * 10);
        System.out.println(a6);
        System.out.println(b6);

        String s6 = String.valueOf(a6);
        String s62 = String.valueOf(b6);
        String c63 = s6+s62;

        int c6 = Integer.valueOf(c63);
        System.out.println(c6);


        System.out.println("Задание 1.7");
        int x7 = 40;
        double y7 = x7 / 3.0;   //если тут будет 3 вместо 3.0, то мы получим не верный ответ в виде значения 13.0, потому
        //что все операнды являются целочисленными, поэтому здесь происходит целочисленное деление. Результатом
        //целочисленного деления является целое число. Если в результате целочисленного деления получилось число с
        //плавающей точкой, то происходит усечение (truncation) частного – дробная часть отбрасывается.
        System.out.println(y7);
        String formattedDouble = String.format("%.2f", y7);
        System.out.println(formattedDouble);


        System.out.println("Задание 2.2");
        String hello = "Hello| friend!";
        char[] arrHello = hello.toCharArray();
        int a = arrHello.length;

        char[] arrHelloNew = new char[arrHello.length * 2];
        int b = arrHelloNew.length;
        int j=0;

        for (int i=0; i < arrHello.length * 2;) {
            if(j == arrHello.length) break;

            if(i % 2 == 0) {
                if(arrHello[j] == ' ') {
                    j++;
                    continue;
                }
                arrHelloNew[i] = arrHello[j];
                j++;
            } else if(arrHello[j] != '!') {
                arrHelloNew[i] = '-';
            }
            i++;
        }
        String finalString = String.valueOf(arrHelloNew);
        System.out.println(finalString);


        System.out.println("Задание 2.3");
        List<String> list = new ArrayList<>();
        list.add("+");
        list.add("!");
        list.add("?");

        List<Integer> listNum = new ArrayList();
        listNum.add(3);
        listNum.add(4);
        listNum.add(2);
        for(int i=0, j=0; i<list.size(); i++, j++) {
            System.out.println(list.get(i).repeat(listNum.get(j)));
        }

        System.out.println("Задание 2.4");
        System.out.println(list.get(0).repeat(3) + list.get(1).repeat(4) + list.get(2).repeat(2));

        System.out.println("Задание 2.5");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println("aa=" + (aa));
        System.out.println("alO=" + (alO));

        System.out.println("Задание 2.6");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println("" + (a));
        System.out.println("" + (a+1));
        System.out.println("" + (a-2));

        System.out.println("Задание 2.8");
        int x8 = 6;
        System.out.println(x8+ "\n" + x8*x8 + "\n" + x8*x8*x8);

        System.out.println("Задание 2.9");
        int x9 = 9;
        System.out.println("Значение х9 = " + x9 + "\n" + "Значение x9 в квадрате = " + x9*x9);

        System.out.println("Задание 2.15");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println(a+10);

        System.out.println("Задание 2.16");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println(a+6);
        System.out.println(a-12);
*/

        System.out.println("Задание 1.");
        System.out.println("Задание 1.");
        System.out.println("Задание 1.");



















        System.out.println("Лямбда выражения");
        //(арг1, арг2...) -> { тело }
        //(String s) -> { System.out.println(s); }
        //(String s) -> { return System.out.println(s); }
        Runnable r = () -> System.out.println("hello world");




        int operation;
        operation = (x,y) -> x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30















    }



}
