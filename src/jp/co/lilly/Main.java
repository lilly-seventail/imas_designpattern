package jp.co.lilly;

import jp.co.lilly.iterator.Idol;
import jp.co.lilly.iterator.Iterator;
import jp.co.lilly.iterator.Office;

public class Main {

  public static void main(String[] args){

    // Iterator
    Office office = new Office(5);

    // 事務所に入社したアイドル
    office.enteringCompany(new Idol("七尾百合子", 15));
    office.enteringCompany(new Idol("高坂海美", 16));
    office.enteringCompany(new Idol("佐竹美奈子", 18));
    office.enteringCompany(new Idol("周防桃子", 11));
    office.enteringCompany(new Idol("田中琴葉", 18));

    Iterator iterator = office.iterator();
    // アイドルが存在している限り処理を行う
    while(iterator.hasNext()){
      // Objectを返すためIdolにキャストしてあげる
      Idol idol = (Idol)iterator.next();
      System.out.println(idol.selfIntroduction());
    }
  }
}
