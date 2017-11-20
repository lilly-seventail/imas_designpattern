package jp.co.lilly.adapter;

public class CinderellaGirls {
	// キャラ名
	private String name;
	// 中の人
	private String cv;

	/**
	 * ミリオンライブ
	 * @param name
	 * @param cv
	 */
	public CinderellaGirls(String name, String cv) {
		this.name = name;
		this.cv = cv;
	}

	/**
	 * 挨拶
	 */
	public void deressu() {
		System.out.println("シンデレラガールズ" + this.name + "役の" + this.cv + "です。");
	}
}
