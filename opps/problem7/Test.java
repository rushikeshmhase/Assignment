package com.assingments2.opps.problem7;

import java.time.LocalDate;

public class Test {
public static void main(String[] args) {
	CricketPlayer cr = new CricketPlayer(01, "MS Dhoni", "New Delhi", LocalDate.of(1996, 10, 06), "RCB", 07, 20000, 139, 73, 400);
    FootBallPlayer fb = new FootBallPlayer(02, "Messi", "Argentina", LocalDate.of(1990, 01, 01),"Indian national football team", 07, 1000, 1000, 0);
    Hockey hp = new Hockey(3, "Dhanchand", "Hyd", LocalDate.of(1960, 05, 07), "Indian Hockey", 2, 700, 11, 1000);

    System.out.println(cr);
    System.out.println(fb);
    System.out.println(hp);


}
}
