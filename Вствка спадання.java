public class main {

    public static void main(String[] args) {
        int[] mas = new int[12]; //массив который называется mas и состоит из 12 ти элементов
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);   // массив заполняется рандомными числами до 100
            System.out.print(mas[i] + " ");   //выводим массив на экран
        }
        //сортировка методом вставки
        {
            System.out.println();
            int j, temp;
            for (int i = 0; i < mas.length; i++) {
                temp = mas[i];
                for (j = i - 1; j >= 0 && mas[j] < temp; j--) {
                    mas[j + 1] = mas[j];
                }
                mas[j + 1] = temp;
            }
            System.out.println(" ");

            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}