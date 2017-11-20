package jp.co.lilly.adapter;

public class StartAdapter {

	public static void startAdapter() {
		IdolMaster million = new IdolMasterMillionLive("箱崎星梨花", "麻倉もも");
		million.aisatu();

		IdolMaster cinderella = new IdolMasterCinderellaGirls("島村卯月", "大橋彩香");
		cinderella.aisatu();
	}
}
