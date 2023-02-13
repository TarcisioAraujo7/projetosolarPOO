
import java.awt.EventQueue;

public class App {
    public static void main(String[] args) {  
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLogin window = new viewLogin("terra","2022");
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
