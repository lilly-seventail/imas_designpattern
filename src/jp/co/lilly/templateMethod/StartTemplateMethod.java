package jp.co.lilly.templateMethod;

public class StartTemplateMethod {

	public static void startTemplateMethod() {
		Gacha normal = new Normal();
		normal.result();

		Gacha rainbow = new Rainbow();
		rainbow.result();
	}

}
