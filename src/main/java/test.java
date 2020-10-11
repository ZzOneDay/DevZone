public class test {
    public static void main(String[] args) {
        String value = "X 81 X X 7/ 53 06 X 7/ X81";
        String value1 = "10 9 10 10 15 8 6 10 20 10 8 1";
        int myValue = 0;
        for (String s : value1.split(" ")) {
            myValue += Integer.parseInt(s);
        }
        System.out.println(myValue);
        String score = "163";
        Task040Impl task040 = new Task040Impl();
        System.out.println(task040.countScore(value));


    }
}
