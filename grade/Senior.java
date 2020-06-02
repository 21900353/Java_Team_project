package grade;

import java.util.Scanner;

import character.Me;
import character.Monster;
import inventory.Inventory;

public class Senior extends Junior {

	public final static Monster[] MR4 = new Monster[5];
	{
		// Name, Attack point, Defense point, gold, critical, Hp
		MR4[0] = new Monster("졸업논문1", 5, 1, 5, 1, 50);
		MR4[1] = new Monster("캡스톤", 4, 1, 5, 1, 65);
		MR4[2] = new Monster("팀프로젝트", 3, 1, 5, 1, 50);
		MR4[3] = new Monster("취업준비", 7, 1, 5, 1, 65);
		MR4[4] = new Monster("졸업논문2", 5, 1, 5, 1, 50);
	}

	public final static Monster[] ER4 = new Monster[5];
	{
		// Name, Attack point, Defense point, gold, critical, Hp
		ER4[0] = new Monster("인자기", 1, 1, 5, 1, 10);
		ER4[1] = new Monster("졸업영어", 3, 1, 5, 1, 40);
		ER4[2] = new Monster("서평1", 5, 1, 5, 1, 40);
		ER4[3] = new Monster("레포트", 5, 1, 5, 1, 45);
		ER4[4] = new Monster("서평2", 5, 1, 5, 1, 40);
	}

	public final static Monster[] MS4 = new Monster[5];
	{
		// Name, Attack point, Defense point, gold, critical, Hp
		MS4[0] = new Monster("졸업논문1", 5, 1, 5, 1, 50);
		MS4[1] = new Monster("캡스톤", 7, 1, 5, 1, 60);
		MS4[2] = new Monster("팀프로젝트", 4, 1, 5, 1, 50);
		MS4[3] = new Monster("취업준비", 7, 1, 5, 1, 65);
		MS4[4] = new Monster("졸업논문2", 6, 1, 5, 1, 60);
	}

	public final static Monster[] ES4 = new Monster[5];
	{
		// Name, Attack point, Defense point, gold, critical, Hp
		ES4[0] = new Monster("인자기", 3, 1, 5, 1, 10);
		ES4[1] = new Monster("졸업영어", 5, 1, 5, 1, 40);
		ES4[2] = new Monster("서평1", 5, 1, 5, 1, 40);
		ES4[3] = new Monster("레포트", 5, 1, 5, 1, 50);
		ES4[4] = new Monster("서평2", 5, 1, 5, 1, 40);

	}

	public Senior(String major1, String major2, String education1, String eucation2) {
		super(major1, major2, education1, eucation2);
	}

	public static void GoToDungeon(Me me, Inventory invent) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Select the Dungeon\n\n1." + Major_require.getName());
			System.out.println("2." + Education_require.getName());
			System.out.println("3." + Major_select.getName());
			System.out.println("4." + Education_select.getName());

			int select = sc.nextInt();

			if (select == 1) {
				Major_require.fight(me, skill, MR4, invent);
			} else if (select == 2) {
				Education_require.fight(me, skill, ER4, invent);
			} else if (select == 3) {
				Major_select.fight(me, skill, MS4, invent);
			} else if (select == 4) {
				Education_select.fight(me, skill, ES4, invent);
			} else if (select == 5) {
				break;
			}
		}
	}
}