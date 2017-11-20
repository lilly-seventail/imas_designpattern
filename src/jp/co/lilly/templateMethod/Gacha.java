package jp.co.lilly.templateMethod;

public abstract class Gacha {

	// カットイン
	public abstract void cutIn();
	// 封筒
	public abstract void envelope();
	// 開封
	public abstract void open();

	// 結果
	public final void result() {
		cutIn();
		envelope();
		for (int count = 0; count < 10; count++ ) {
			open();
		}
		System.out.println();
	}
}
