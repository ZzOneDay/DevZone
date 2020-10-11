public class Task040Impl implements Task040 {
    @Override
    public int countScore(String str) {
        int result = 0;
        String []frames = str.split(" ");
        for(String frameResult : frames) {
            if (frameResult.length() == 3) {
                String []finalFrames = frameResult.split("");
                for (String finalFrame : finalFrames) {
                    result += getScoreOfFrame(finalFrame);
                    System.out.println("final result : " + getScoreOfFrame(finalFrame));
                }
                continue;
            }

            System.out.println("simple frame : " + getScoreOfFrame(frameResult));
            result += getScoreOfFrame(frameResult);
        }

        return result;
    }

    private int getScoreOfFrame (String frame) {
        if (frame.contains("X")) {
            return 10;
        }
        if (frame.contains("/")) {
            return 10;
        }
        int a = Integer.parseInt(frame.charAt(0) + "");
        int b = 0;
        if (frame.length() > 1) {
            b = Integer.parseInt(frame.charAt(1) + "");
        }
        return  (a+b);
    }
}
