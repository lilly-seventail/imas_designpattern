package jp.co.lilly.adapter;

/**
 * Adapterになるクラス
 * @author lilly.seventail
 *
 */
public class IdolMasterMillionLive extends MillionLive implements IdolMaster{

	/**
	 * コンストラクタ
	 * @param name
	 * @param cv
	 */
	public IdolMasterMillionLive(String name, String cv) {
		super(name, cv);
	}

	/**
	 * ミリオン挨拶
	 */
	@Override
	public void aisatu() {
		mirihho();
	}



}
