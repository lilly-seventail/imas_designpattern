package jp.co.lilly.iterator;

public class Office implements Aggregate {

  private Idol[] idols;
  private int index = 0;

  /**
   * 事務所に所属しているアイドルオブジェクトを生成
   * @param number 人数
   */
  public Office(int number){
    this.idols = new Idol[number];
  }

  /**
   * Indexからアイドルを取得
   * @param index
   * @return
   */
  public Idol getIdol(int index){
    return idols[index];
  }

  public void enteringCompany(Idol idol){
    this.idols[index] = idol;
    index++;
  }

  public int getLength(){
    return index;
  }

  /**
   * Iteratorを実装したOfficeIteratorを生成する
   */
  @Override
  public Iterator iterator() {
    return new OfficeIterator(this);
  }

}
