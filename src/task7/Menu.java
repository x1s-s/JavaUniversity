package task7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import task3.progressed.Author;
import task3.progressed.Book;
import task3.progressed.Genre;
import task3.progressed.PublishingHouse;

        public class Menu {

          private JButton addElementButton;
          private JPanel panel1;
          private JTextField textField1;
          private JButton editElementButton;
          private JButton outputButton;
          private JButton outputFromFileButton;
          private JButton inputFromFileButton;
          private JButton deleteButton;
          private JTextField elementIndexTextField;
          private JTextField filePathTextField;
          private JTextField textField2;
          private JTextField textField3;
          private JTextField textField4;
          private JTextField textField5;
          private JTextField textField6;
          private JTextField textField7;
          private JTextField textField8;
          private JLabel output;

          public Menu() {
            FileCollection fileCollection = new FileCollection(new Collection<Book>(), new CollectionView<Book>());
            addElementButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                fileCollection.addElement(new Book(
                        new Author(textField1.getText(), new Date(Long.parseLong(textField2.getText())), textField3.getText()),
                        Genre.valueOf(textField4.getText()),
            new PublishingHouse(textField5.getText(), textField6.getText()),
            textField7.getText(), new Date(Long.parseLong(textField8.getText()))
            )
        );
      }
    });
    editElementButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Book temp = new Book(
            new Author(textField1.getText(), new Date(Long.parseLong(textField2.getText())), textField3.getText()),
            Genre.valueOf(textField4.getText()),
            new PublishingHouse(textField5.getText(), textField6.getText()),
            textField7.getText(), new Date(Long.parseLong(textField8.getText()))
        );
        fileCollection.editElement(temp, elementIndexTextField.getText(), output);
      }
    });
    outputButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fileCollection.updateViews(output);
      }
    });
    deleteButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fileCollection.deleteElement(elementIndexTextField.getText(), output);
      }
    });
    outputFromFileButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fileCollection.outputFromFile(filePathTextField.getText(), output);
      }
    });
    inputFromFileButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fileCollection.inputFormFile(filePathTextField.getText(), output);
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Menu");
    frame.setContentPane(new Menu().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
