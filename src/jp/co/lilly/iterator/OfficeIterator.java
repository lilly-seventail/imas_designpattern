package jp.co.lilly.iterator;

public class OfficeIterator implements Iterator {

  private Office office;
  private int index;

  public OfficeIterator(Office office){
    this.office = office;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    if (index < office.getLength()) return true;

    return false;
  }

  @Override
  public Object next() {
    Idol idol = office.getIdol(index);
    index++;

    return idol;
  }

}
