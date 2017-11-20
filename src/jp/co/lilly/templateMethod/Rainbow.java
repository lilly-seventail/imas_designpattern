package jp.co.lilly.templateMethod;

import java.util.Random;

public class Rainbow extends Gacha{

	String[] card = { "SSR", "SR", "R" };

	// カットインなし
	@Override
	public void cutIn() {
		System.out.println("楽しそうなところが撮れましたよ");
	}

	@Override
	public void envelope() {
		System.out.println("封筒の色は虹色です");
	}

	@Override
	public void open() {
		int rnd = new Random().nextInt(3);
		System.out.println(card[rnd] + "がでました。");
	}

}
