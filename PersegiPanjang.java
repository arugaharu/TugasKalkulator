// Gaharu Winanggya B / 123210155

package mainkuy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PersegiPanjang implements ActionListener {
    private JLabel labelPanjang, labelLebar, labelLuas, labelKeliling, 
        labelVolume, labelTinggi, labelLP;
    private JTextField textFieldPanjang, textFiledLebar, textFieldLuas, 
        textFieldKeliling , textFieldVolume, textFieldTinggi, textFieldLP;
    private JButton hitung, reset;
    
    public JPanel setPersegiPanjang() {
    labelPanjang = new JLabel("Panjang");
    labelLebar = new JLabel("Lebar");
    labelTinggi = new JLabel("Tinggi");
    labelLuas = new JLabel("Luas Persegi Panjang");
    labelKeliling = new JLabel("Keliling Persegi Panjang");
    labelVolume = new JLabel("Volume Balok");
    labelLP = new JLabel("Luas Permukaan Balok");
    
    textFieldPanjang = new JTextField();
    textFiledLebar = new JTextField();
    textFieldTinggi = new JTextField();
    textFieldLuas = new JTextField();
    textFieldKeliling = new JTextField();
    textFieldVolume = new JTextField();
    textFieldLP = new JTextField();
    
    hitung = new JButton("Hitung");
    reset = new JButton("Reset");

    JPanel panelPersegiPanjang = new JPanel();
    panelPersegiPanjang.setLayout(new GridLayout(8,8));
    panelPersegiPanjang.add(labelPanjang); panelPersegiPanjang.add(textFieldPanjang);
    panelPersegiPanjang.add(labelLebar); panelPersegiPanjang.add(textFiledLebar);
    panelPersegiPanjang.add(labelTinggi); panelPersegiPanjang.add(textFieldTinggi);
    panelPersegiPanjang.add(labelLuas); panelPersegiPanjang.add(textFieldLuas);
    panelPersegiPanjang.add(labelKeliling); panelPersegiPanjang.add(textFieldKeliling);
    panelPersegiPanjang.add(labelVolume); panelPersegiPanjang.add(textFieldVolume);
    panelPersegiPanjang.add(labelLP); panelPersegiPanjang.add(textFieldLP);
    panelPersegiPanjang.add(hitung); panelPersegiPanjang.add(reset);

    textFieldLuas.setEditable(false);
    textFieldKeliling.setEditable(false);
    textFieldVolume.setEditable(false);
    textFieldLP.setEditable(false);
    
    hitung.addActionListener(this);
    reset.addActionListener(this);

    return panelPersegiPanjang;
}
    
    
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == hitung) {      //untuk hitung
            try {
                BangunBangun persegiPanjang = new BangunBangun(Double.parseDouble(textFieldPanjang.getText()),Double.parseDouble(textFiledLebar.getText()),Double.parseDouble(textFieldTinggi.getText()));
		textFieldLuas.setText(String.valueOf(persegiPanjang.luasPersegiPanjang()));
		textFieldKeliling.setText(String.valueOf(persegiPanjang.kelilingPersegiPanjang()));
                textFieldVolume.setText(String.valueOf(persegiPanjang.VolumeBalok()));
                textFieldLP.setText(String.valueOf(persegiPanjang.LPBalok()));
            }catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null,"Minimal Masukin Angka !");
            }
        }else{         //untuk me-reset
        textFieldPanjang.setText("");
        textFiledLebar.setText("");
        textFieldTinggi.setText("");
        textFieldLuas.setText("");
        textFieldKeliling.setText("");
        textFieldVolume.setText("");
        textFieldLP.setText("");
        }
    }
}
