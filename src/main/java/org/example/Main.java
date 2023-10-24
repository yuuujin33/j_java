package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 프로그램 시작 ==");
        long last id = 0;
        while (true) {
            System.out.printf("명령어 :");
            String command = sc.nextLine();
            if (command.equals("등록")) {
                System.out.printf("제목");
                String title = sc.nextLine();
                System.out.printf("내용");
                String content = sc.nextLine();

                System.out.printf(lastid + "번 게시글이 등록되었습니다.");
                lastid++;
            }
        }
    }
}
public class Article {

}