package com.hust.algorithm.sort;

public class SortAlgs {
    public SortAlgs() {
    }

    public int[] bubbleSortAsc(int[] arr) {
        int[] mutableArr = arr.clone();
        for (int i = 0; i < mutableArr.length; i++) {
            for (int j = 0; j < mutableArr.length - 1; j++) {
                if (mutableArr[j] > mutableArr[j + 1]) {
                    int temp = mutableArr[j];
                    mutableArr[j] = mutableArr[j + 1];
                    mutableArr[j + 1] = temp;
                }
            }
        }
        return mutableArr;
    }

    public int[] insertionSortAsc(int[] arr) {
        int[] mutableArr = arr.clone();
        for (int i = 1; i < mutableArr.length; i++) {
            // Tìm vị trí phù hợp cho i
            int j = i;
            while (j > 0 && mutableArr[i] < mutableArr[j - 1]) --j;

            // Đưa i về đúng vị trí
            int tmp = mutableArr[i];
            for (int k = i; k > j; k--) {
                mutableArr[k] = mutableArr[k - 1];
            }
            mutableArr[j] = tmp;
        }
        return mutableArr;
    }
}
