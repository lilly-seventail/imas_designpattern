package jp.co.lilly.iterator;

public interface Iterator {
  /**
   * @return 次の要素があればTrue
   */
  public boolean hasNext();

  /**
   * @return 次の要素を返す
   */
  public Object next();
}
