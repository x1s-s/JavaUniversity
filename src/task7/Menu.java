package task7;

import java.util.Date;
import javax.swing.*;

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
    private JButton deleteAllButton;
    private JComboBox comboBox1;

    public Menu() {
        FileCollection fileCollection = new FileCollection(new Collection<>(new Book[1]), new CollectionView<>());
        deleteAllButton.addActionListener(e -> {
            fileCollection.deleteAll();
            output.setText("Коллекция очищена");
        });
        addElementButton.addActionListener(e -> {
            try {
                fileCollection.addElement(new Book(
                        new Author(textField1.getText(), new Date(Long.parseLong(textField2.getText())), textField3.getText()),
                        Genre.valueOf(comboBox1.getSelectedItem().toString()),
                        new PublishingHouse(textField5.getText(), textField6.getText()),
                        textField7.getText(), new Date(Long.parseLong(textField8.getText()))
                ));
            } catch (Exception ex) {
                output.setText(ex.getMessage());
            }
        });
        editElementButton.addActionListener(e ->

        {
            try {
                fileCollection.editElement(new Book(
                        new Author(textField1.getText(), new Date(Long.parseLong(textField2.getText())), textField3.getText()),
                        Genre.valueOf(comboBox1.getSelectedItem().toString()),
                        new PublishingHouse(textField5.getText(), textField6.getText()),
                        textField7.getText(), new Date(Long.parseLong(textField8.getText()))
                ), elementIndexTextField.getText(), output);
            } catch (Exception ex) {
                output.setText(ex.getMessage());
            }
        });
        outputButton.addActionListener(e -> fileCollection.updateViews(output));
        deleteButton.addActionListener(e -> fileCollection.deleteElement(elementIndexTextField.getText(), output));
        outputFromFileButton.addActionListener(e -> fileCollection.outputFromFile(filePathTextField.getText(), output));
        inputFromFileButton.addActionListener(e -> fileCollection.inputFormFile(filePathTextField.getText(), output));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
