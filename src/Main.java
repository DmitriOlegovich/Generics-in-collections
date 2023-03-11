public class Main {

            public static void main(String[] args) {

                MagicBox<Integer> integerMagicBox = new MagicBox<>(Integer[].class, 7);
                MagicBox<String> stringMagicBox = new MagicBox<>(String[].class, 7);

                int j = 0;
                while (integerMagicBox.add(++j)) {
                }
                j = 0;
                while (stringMagicBox.add(String.format("Пустых строк %3d", ++j))) {
                }

                for (int i = 0; i < 7; i++) {
                    System.out.println("Число " + integerMagicBox.pick() + " " +  "Строка " + stringMagicBox.pick());
                }
            }
        }

