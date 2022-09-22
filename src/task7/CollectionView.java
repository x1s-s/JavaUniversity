package task7;


import javax.swing.JLabel;

public class CollectionView<T> {
  public void OutputCollection(Collection<T> firstElement, JLabel label) {
    label.setText("<html>");
    while (firstElement != null && firstElement.getElement() != null){
      label.setText(label.getText() + firstElement.getElement().toString() + "<br>");
      firstElement = firstElement.getNextElement();
    }
    label.setText(label.getText() + "</html>");
  }
}
