package com.ironhack.demo_lab;

import com.ironhack.demo_lab.Challenge2.Association;
import com.ironhack.demo_lab.Challenge2.Division;
import com.ironhack.demo_lab.Challenge2.Member;
import com.ironhack.demo_lab.Challenge2.MemberStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLabApplication.class, args);

		Association association1 = new Association("Association 1");

		Member president = new Member("PresidentGuy", MemberStatus.ACTIVE, new Division());

		Division division1 = new Division(president, "Baku", "Division1", association1);
		Division division2 = new Division(president, "Baku", "Division2", association1);
		Division division3 = new Division(president, "Baku", "Division3", association1);
		Division division4 = new Division(president, "Baku", "Division4", association1);
		Division division5 = new Division(president, "Baku", "Division5", association1);
		Division division6 = new Division(president, "Baku", "Division6", association1);
		Division division7 = new Division(president, "Baku", "Division7", association1);

		association1.getDivisions().add(division1);
		association1.getDivisions().add(division2);
		association1.getDivisions().add(division3);
		association1.getDivisions().add(division4);
		association1.getDivisions().add(division5);
		association1.getDivisions().add(division6);
		association1.getDivisions().add(division7);

		Member member1 = new Member("Nihad", MemberStatus.ACTIVE, division1);
		Member member2 = new Member("Ruzi", MemberStatus.ACTIVE, division2);
		Member member3 = new Member("Ulvi", MemberStatus.ACTIVE, division3);
		Member member4 = new Member("Shaiq", MemberStatus.ACTIVE, division4);
		Member member5 = new Member("Omar", MemberStatus.ACTIVE, division5);
		Member member6 = new Member("Qurbanali", MemberStatus.ACTIVE, division6);
		Member member7 = new Member("Islam", MemberStatus.ACTIVE, division7);
	}

}
