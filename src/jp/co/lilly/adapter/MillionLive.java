package jp.co.lilly.adapter;

public class MillionLive {

	// キャラ名
	private String name;
	// 中の人
	private String cv;

	/**
	 * ミリオンライブ
	 * @param name
	 * @param cv
	 */
	public MillionLive(String name, String cv) {
		this.name = name;
		this.cv = cv;
	}

	/**
	 * 挨拶
	 */
	public void mirihho() {
		System.out.println("ミリオンライブ" + this.name + "役の" + this.cv + "です。");
	}

}
