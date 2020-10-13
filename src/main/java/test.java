public class test {
    public static void main(String[] args) {
        String value = "11 11 11 11 11 11 11 11 11 11";
//        String value1 =
//                "10 8 1 " +
//                "8 1 " +
//                "10 10 7 " +
//                "10 7 3 " +
//                "7 3 5 " +
//                "5 3 " +
//                "0 6 " +
//                "10 7 3 "+
//                "7 3 10 " +
//                "19 ";
//        int myValue = 0;
//        for (String s : value1.split(" ")) {
//            myValue += Integer.parseInt(s);
//        }
//        System.out.println(myValue);
//        String score = "163";
        Task040Impl task040 = new Task040Impl();
        System.out.println(task040.countScore(value));



    }
}
