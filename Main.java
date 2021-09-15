public class Main {

    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"2", "2", "1", "6"},
                {"3", "6", "8", "4"},
                {"4", "6", "5", "3"},
                {"5", "3", "4", "5"}
        };
        String[][] wrongChar  = {
                {"6", "4", "8", "2"},
                {"5", "4", "", "1"},
                {"3", "0", "9", "1"},
                {"2", "4", "7", "5"}
        };
        String[][] wrongSizeMatrix = {
                {"7", "3", "7", "6"},
                {"4", "2"},
                {"3", "4", "6", "2"},
                {"7", "6", "8", "4"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
