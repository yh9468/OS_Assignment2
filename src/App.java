import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App {
	int count = 0;
	int MAXSIZE = 500;
	JFrame mainframe;
	JLayeredPane inputlayerpane;
	JLayeredPane mainlayerframe;
	JLabel Label1;
	JLabel Label2;
    JButton StartButton;
    JButton EndButton;
    JTextArea txtLog;
    JScrollPane scrollPane;
	
    public App()
    {
    	mainframe = new JFrame("OS_Assignment2");
    	mainframe.setSize(700, 800);
    	
    	inputlayerpane = new JLayeredPane();
    	inputlayerpane.setBounds(0,0,700,200);
    	
    	mainlayerframe = new JLayeredPane();
    	mainlayerframe.setBounds(200,0,700,600);
    	StartButton = new JButton("Start");
    	StartButton.setBounds(350,30,80,20);
    	
    	Label1 = new JLabel();
    	Label1.setText("OS_Memmory_Allocation_Assignment");


    	Label1.setBounds(80, 18, 220, 50);
    	inputlayerpane.add(Label1);
    	
    	EndButton = new JButton("End");
    	EndButton.setBounds(440,30,80,20);
    	inputlayerpane.add(StartButton);
    	inputlayerpane.add(EndButton);
    	
    	mainframe.add(inputlayerpane);
    	mainframe.add(mainlayerframe);
    	
    	mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	mainframe.setVisible(true);
    	

    }
}
