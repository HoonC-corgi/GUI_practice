import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("JFrame Test!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        //c.setLayout(new GridLayout(4, 3));
        c.setLayout(null);  // 배치관리자 사용 안 함
        for(int i=0; i<10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setSize(50, 30);
            btn.setLocation(i*40, i*22);
            c.add(btn);
            // 버튼은 정수를 문자로 못 받아옴 i + ""로 해도 됨
        }

        // c.setLayout(new BorderLayout());
        // c.add(new JButton("1"), BorderLayout.CENTER);
        // c.add(new JButton("2"), BorderLayout.WEST);
        // c.add(new JButton("3"), BorderLayout.EAST);
        // c.add(new JButton("4"), BorderLayout.NORTH);
        // c.add(new JButton("5"), BorderLayout.SOUTH);

        // c.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));  // 배치관리자

        // c.add(new JButton("Start"));
        // c.add(new JButton("End"));


        // c.add(new JButton("Start"));
        // c.add(new JButton("End"));
        // c.add(new JButton("Start"));
        // c.add(new JButton("End"));
        // c.add(new JButton("Start"));
        // c.add(new JButton("End"));
        // c.add(new JButton("Start"));
        // c.add(new JButton("End"));

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String []  args) {
        new Main();
    }
}