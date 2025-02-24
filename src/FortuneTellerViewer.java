import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class FortuneTellerViewer {

    public static void main(String[] args) {
        Random random = new Random();
        AtomicInteger previdex = new AtomicInteger();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        Icon icon = new ImageIcon("src/download.jpg");
        JLabel label = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        frame.add(label, BorderLayout.NORTH);
        label.setFont(new Font("Serif", Font.BOLD, 48));
        frame.setVisible(true);
        ArrayList<String> fortunes = new ArrayList<>();
        fortunes.add("Your future is as bright as your smartphone screen.");
        fortunes.add("Beware of unexpected typos in your fortune.");
        fortunes.add("A mysterious event is on the horizon.");
        fortunes.add("Today is your lucky day, unless it rains.");
        fortunes.add("Your efforts will soon pay off... eventually.");
        fortunes.add("Adventure awaits if you just open your door.");
        fortunes.add("Keep calm and avoid awkward small talk.");
        fortunes.add("Fortune favors the bold, but coffee helps too.");
        fortunes.add("You will soon find something you lost.");
        fortunes.add("Your smile is your fortune's secret weapon.");
        fortunes.add("Good things come to those who wait... sometimes.");
        fortunes.add("Expect the unexpected, and then expect more.");
        JTextArea textArea = new JTextArea(10,25);
        textArea.setFont(new Font("Serif", Font.ITALIC, 24));
        textArea.setEditable(false);
        fortunecreator create = new fortunecreator(fortunes);
        StringBuilder sb = new StringBuilder();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton fortuneButton = new JButton("Read My Fortune");
        fortuneButton.addActionListener(e -> {
            textArea.append(create.fortune()+"\n");
            scrollPane.add(textArea);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setVisible(true);
        });
        JButton quitButton = new JButton("QUIT");
        quitButton.addActionListener(e -> {
            System.exit(0);
        });
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(fortuneButton);
        bottomPanel.add(quitButton);
        frame.add(bottomPanel,BorderLayout.SOUTH);
        frame.setVisible(true);



    }
}