package com.xiazki.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Be> list = new ArrayList<Be>() {{
            add(new Be());
            add(new Be());
            add(new Be());
        }};

        list.parallelStream().forEach(s -> {
            s.get().toCharArray();
            System.out.println(s.get());
        });

//        new Thread(() -> new Be().get().toCharArray()).start();

        System.out.println("this is main thread");
    }

    static class Be {

        private String str;

        public String get() {
            return str;
        }
    }

}
