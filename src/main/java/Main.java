import java.util.Random;

public class Main {
    private static final Notebook[] notebook = new Notebook[5000];
    private static final Random random = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < notebook.length; i++) {
            notebook[i] = new Notebook(random.nextInt(85000), ((random.nextInt(3)+1) * 4), "Asos");
        }

       bubbleSort();

        for (Notebook value : notebook) {
            System.out.println(value.price);
        }
    }
    private static void bubbleSort(){
        int n = 0;
        for (int j = 0; j < notebook.length; j++) {
            for (int i = 0; i < notebook.length - n - 1; i++) {
                if (notebook[i].price > notebook[i + 1].price) {
                    int temp = notebook[i + 1].price;
                    notebook[i + 1].price = notebook[i].price;
                    notebook[i].price = temp;
                }
            }
            n++;
        }
    }
}
