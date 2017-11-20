package jp.co.lilly.templateMethod;

import java.util.Random;

public class Normal extends Gacha{

	String[] card = { "SSR", "SR", "R", "N" };

	// カットインなし
	@Override
	public void cutIn() {
	}

	@Override
	public void envelope() {
		System.out.println("封筒の色は白色です");
	}

	@Override
	public void open() {
		int rnd = new Random().nextInt(4);
		System.out.println(card[rnd] + "がでました。");
	}

}
