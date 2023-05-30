package org.example;

import java.io.IOException;

// GET /calculate 라는 파라미터를 받았을때 화면을 띄어준다.
public class Main {
    public static void main(String[] args) throws IOException {
        new CostomWebApplicationServer(8080).start();
    }
}