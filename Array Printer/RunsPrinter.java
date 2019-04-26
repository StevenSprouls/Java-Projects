import java.util.Random;

public class RunsPrinter {
    public static void main(String[] args) {
        Random random = new Random();

        int dicetosses[] = new int[20];
        for (int i = 0; i < dicetosses.length; i = i + 1) {
            dicetosses[i] = random.nextInt(6) + 1;
        }
        runs(dicetosses);
    }

    public static void runs(int[] dicetosses) {
        boolean inRun = false;
        int PreVal = dicetosses[0];

        for (int i = 0; i < dicetosses.length - 1; i = i + 1) {
            if (inRun) {
                if (dicetosses[i] != PreVal) {
                    System.out.print(")");
                    inRun = false;
                }
            } else if (!inRun) {
                if (dicetosses[i] == dicetosses[i + 1]) {
                    System.out.print("(");
                    inRun = true;
                } 
            }

            PreVal = dicetosses[i];
            System.out.print(dicetosses[i]);
        }

        if (inRun && dicetosses[dicetosses.length - 1] == PreVal) {
            System.out.print(dicetosses[dicetosses.length - 1] + ")");
        } else if (inRun && dicetosses[dicetosses.length - 1] != PreVal) {
            System.out.print(dicetosses[dicetosses.length - 1]);
        } else {
            System.out.print(dicetosses[dicetosses.length - 1]);
        }
    }
}