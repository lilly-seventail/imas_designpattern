package jp.co.lilly.iterator;

public class Idol {

  private String name;
  private int age;

  public Idol(String name, int age){
    this.name = name;
    this.age = age;
  }

  /**
   * 自己紹介
   * @return 名前と年齢
   */
  public String selfIntroduction(){
    return name + "," + age + "歳です。";
  }
}
