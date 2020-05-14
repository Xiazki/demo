package com.xiazki.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试线程状态
 */
public class ThreadTest {

    ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();

        new Thread(threadTest::testLock).start();

        new Thread(threadTest::testLock).start();

        new Thread(threadTest::testLock).start();

        new Thread(threadTest::testLock).start();

    }

    public void testLock(){
        lock.lock();
        for (;;){
        }

    }

}
