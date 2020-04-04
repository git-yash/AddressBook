import javax.swing.*;
import java.awt.*;

public class ManageContacts {
    private Contacts contacts = new Contacts();

    public void initialize() {
        JFrame window = createWindow();
        window.getContentPane().add(createHeaderPanel());
        window.getContentPane().add(createContactsPanel());
        window.pack();
        window.setVisible(true);
    }

    private JFrame createWindow() {
        JFrame window = new JFrame("Manage Contacts");

        window.setPreferredSize(new Dimension(600, 400));
        window.getContentPane().setLayout(new FlowLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        return window;
    }

    private JPanel createContactsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        GridLayout layout = new GridLayout(1, 3);
        layout.setHgap(40);
        panel.setLayout(layout);

        for (Contact contact : contacts.getContacts()) {
            panel.add(new JButton("Edit"));
            panel.add(new JButton("Delete"));
            panel.add(new JLabel(contact.getFullName()));
        }

        return panel;
    }

    private JPanel createHeaderPanel() {
        JButton addButton = new JButton("+");
        JTextField search = new JTextField();
        JButton searchButton = new JButton("Search");

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(1, 3);
        layout.setHgap(20);
        panel.setLayout(layout);
        panel.add(search);
        panel.add(searchButton);
        panel.add(addButton);
        return panel;
    }
}
