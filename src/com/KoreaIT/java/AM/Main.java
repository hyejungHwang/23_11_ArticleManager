package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("== 프로그램 시작==");
    Scanner sc = new Scanner(System.in);

    ArrayList<String> articles = new ArrayList<>();
    int articleCount = 0;

    while (true) {
      System.out.print("명령어 ) ");
      String cmd = sc.nextLine();

      if (cmd.equals("article list")) {
        if (articles.isEmpty()) {
          System.out.println("게시글이 없습니다.");
        } else {
          for (int i = 0; i < articles.size(); i++) {
            System.out.println((i + 1) + "번 글: " + articles.get(i));
          }
        }
      } else if (cmd.equals("article write")) {
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();
        articleCount++;
        articles.add(articleCount + "번 글 - 제목: " + title + ", 내용: " + content);
        System.out.println(articleCount + "번 글이 생성되었습니다.");
      } else if (cmd.equals("system exit")) {
        break;
      } else {
        System.out.println("존재하지 않는 명령어입니다.");
      }
    }

    sc.close();

    System.out.println("== 프로그램 종료==");
  }
}