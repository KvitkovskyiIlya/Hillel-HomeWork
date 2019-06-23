package com.hillel.hw8.interval;

import com.hillel.hw8.finder.PrimeFinderThread;
import com.hillel.hw8.storage.PrimesStorage;

public class DivideInterval {
    private int minNumber;
    private int maxNumber;
    private int threadsCount;
    private Thread[] finderThreads;
    private PrimesStorage storage;

    public DivideInterval(int minNumber, int maxNumber, int threadsCount, PrimesStorage storage) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.threadsCount = threadsCount;
        this.storage = storage;
        intervalForThreads();
    }

    public void startThreads() {
        for (Thread thread : finderThreads) {
            thread.start();
        }
    }

    public void joinThreads() throws InterruptedException {
        for (Thread thread : finderThreads) {
            thread.join();
        }
    }


    private void intervalForThreads() {
        int part = (maxNumber - minNumber) / threadsCount;
        finderThreads = new Thread[threadsCount];
        int minNum = minNumber;
        int maxNum = minNumber;

        for (int i = 0; i < threadsCount; i++) {
            if (firstThread(i)) {
                maxNum += part;
            } else if (lastThread(i)) {
                minNum += part;
                maxNum = maxNumber;
            } else {
                minNum += part;
                maxNum += part;
            }
            finderThreads[i] = new Thread(new PrimeFinderThread(minNum + 1, maxNum, storage));
        }
    }

    private boolean lastThread(int index) {
        return index == this.threadsCount - 1;
    }

    private boolean firstThread(int index) {
        return index == 0;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getThreadsCount() {
        return threadsCount;
    }

    public void setThreadsCount(int threadsCount) {
        this.threadsCount = threadsCount;
    }

    public Thread[] getFinderThreads() {
        return finderThreads;
    }

    public void setFinderThreads(Thread[] finderThreads) {
        this.finderThreads = finderThreads;
    }

    public PrimesStorage getStorage() {
        return storage;
    }

    public void setStorage(PrimesStorage storage) {
        this.storage = storage;
    }
}
