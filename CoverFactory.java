package TA2;
import java.util.Scanner;
import TA2.Cover.*;

public class CoverFactory {
    Scanner sc = new Scanner(System.in);
    Cover c = null;

    public CoverFactory() {

    }

    public Cover getCoverModel(int model) {
        switch (model) {
            case 1:
                return new iPhone10Cover();
            case 2:
                return new iPhone12Cover();
            case 3:
                return new iPhoneSECover();
        }
        return null;
    }

}