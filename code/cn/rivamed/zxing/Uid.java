package cn.rivamed.zxing;

import java.util.UUID;

public class Uid {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);
        }
    }
}
