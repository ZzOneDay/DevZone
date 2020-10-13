import java.util.ArrayList;

public interface FrameInterface {
    int getScore(ArrayList<FrameInterface> frames);

    int getFirstStrike();

    int getSecondStrike();

    FrameType getFrameType();
}
