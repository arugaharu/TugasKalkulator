//Gaharu Winanggya  B / 123210155

package mainkuy;
import java.awt.*;
import javax.swing.*;

class FrameMain extends JFrame {
	public FrameMain() {
	setTitle("Kalkulator PP & Balok");
	setTabMain();
	setSize(400,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setTabMain() {
	PersegiPanjang panelPersegiPanjang = new PersegiPanjang();


	JTabbedPane tabMain = new JTabbedPane();
	tabMain.addTab("Gaharu WInanggya B / 123210155",panelPersegiPanjang.setPersegiPanjang());
	add(tabMain);
	}
}

public class Mainkuy {
    public static void main(String[] args) {
       new FrameMain();
    }
}
