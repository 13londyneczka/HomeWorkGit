package Lesson9.Exercise5;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

  public void sort(List<T> list) {
    int n = list.size();

    for (int i = 0; i < n - 1; i++) {
      if (list.get(i).compareTo(list.get(i + 1)) > 0) {
        T temp = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, temp);
      }
    }
  }
}
