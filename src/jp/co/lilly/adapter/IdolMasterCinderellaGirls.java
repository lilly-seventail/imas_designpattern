package jp.co.lilly.adapter;

/**
 * Adapterになるクラス
 * @author lilly.seventail
 *
 */
public class IdolMasterCinderellaGirls extends CinderellaGirls implements IdolMaster{

	/**
	 * コンストラクタ
	 * @param name
	 * @param cv
	 */
	public IdolMasterCinderellaGirls(String name, String cv) {
		super(name, cv);
	}

	/**
	 * シンデレラ挨拶
	 */
	@Override
	public void aisatu() {
		deressu();
	}

}
