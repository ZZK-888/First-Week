package homework;

import java.util.ArrayList;

public class Solution {

    public void sortLost(Lost[] lostArray) {
        for (int i = 0; i < lostArray.length - 1; ++i) {
            for (int j = i + 1; j < lostArray.length; ++j) {
                if (lostArray[j - 1].getLostTime().compareTo(lostArray[j].getLostTime()) > 0) {
                    Lost temp = lostArray[j - 1];
                    lostArray[j - 1] = lostArray[j];
                    lostArray[j] = temp;
                }
            }
        }
    }

    public Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        ArrayList<Lost> foundedArray = new ArrayList<>();
        for (Lost a : lostArray) {
            if (a.getLostPlace().contains(keyword)) {
                foundedArray.add(a);
            }
        }
        Lost[] result = new Lost[foundedArray.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = foundedArray.get(i);
        }
        return result;
    }
}