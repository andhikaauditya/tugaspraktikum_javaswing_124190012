package tugas_javaswing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tugas_javaswing {

    public static void main(String[] args) {
        
        form f =  new form();
    }
    
}

class form extends JFrame implements ActionListener{
    JFrame f;
    JLabel lnama = new JLabel("Nama Pemesan :");
    final JTextField fnama =  new JTextField(20);
    
    JLabel lkelamin =  new JLabel("Jenis Kelamin :");
    JRadioButton rbcowo = new JRadioButton ("Pria");
    JRadioButton rbcewe = new JRadioButton ("Wanita");
    
    JLabel lmenu = new JLabel ("Pilih Menu :");
    String[] menu = {"Nasi Goreng Kambing","Nasi Goreng Bebek","Nasi Goreng Special","Nasi Goreng Katsu","Nasi Goreng Sapi","Nasi Goreng Komplit"};
    JComboBox cbmenu = new JComboBox(menu);
    
    JLabel lmakanan =  new JLabel("Pilih Cemilan :" );
    JCheckBox cbkerupuk = new JCheckBox("Kerupuk");
    JCheckBox cbondeonde = new JCheckBox("Onde Onde");
    JCheckBox cbbolu = new JCheckBox("Bolu");
    JCheckBox cbpiscok = new JCheckBox("Piscok");
    
    JLabel lbayar = new JLabel ("Pilih Metode Pembayaran :");
    String[] bayar = {"Cash","OVO","GOPAY","DANA"};
    JComboBox cbbayar = new JComboBox(bayar);
    
    JLabel luang = new JLabel("Masukan Nominal Bayar :");
    final JTextField fuang =  new JTextField(20);
    
    JButton  bsimpan = new JButton("Simpan");
    JButton  breset = new JButton("Reset");
    JButton  bkeluar = new JButton("Keluar");
    
    public form(){
    setTitle("MENU MAKANAN");    
    setSize(800,400);
    
    ButtonGroup grup = new ButtonGroup();
    grup.add(rbcowo);
    grup.add(rbcewe);
    
    setLayout(null);
    add(lnama);
    add(fnama);
    add(lkelamin);
    add(rbcowo);
    add(rbcewe);
    add(lmenu);
    add(cbmenu);
    add(lmakanan);
    add(cbkerupuk);
    add(cbondeonde);
    add(cbbolu);
    add(cbpiscok);
    add(lbayar);
    add(cbbayar);
    add(luang);
    add(fuang);
    add(bsimpan);
    add(breset);
    add(bkeluar);
    
    lnama.setBounds(10,10,120,20);
    fnama.setBounds(170,10,150,20);
    lkelamin.setBounds(10,40,120,20);
    rbcowo.setBounds(170,40,100,20);
    rbcewe.setBounds(270,40,110,20);
    lmenu.setBounds(10,70,150,20);
    cbmenu.setBounds(170,70,150,20);
    lmakanan.setBounds(10,100,200,20);
    cbkerupuk.setBounds(170,100,250,20);
    cbondeonde.setBounds(170,120,250,20);
    cbbolu.setBounds(170,140,250,20);
    cbpiscok.setBounds(170,160,250,20);
    lbayar.setBounds(10,190,250,20);
    cbbayar.setBounds(170,190,250,20);
    luang.setBounds(10,225,250,20);
    fuang.setBounds(170,225,250,20);
    bsimpan.setBounds(130,280,120,20);
    breset.setBounds(280,280,120,20);
    bkeluar.setBounds(430,280,120,20);
    
    bsimpan.addActionListener(this);
    breset.addActionListener(this);
    bkeluar.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
   
    }
    
    public void cekData(){
        
        System.out.println("\nRekaman Pesanan Anda : ");
        System.out.print("Nama Lengkap\t: "+fnama.getText()+"\n");
        System.out.print("Kelamin\t\t: ");
        if(rbcowo.isSelected()){
            System.out.println("Laki-Laki");
        }
        if (rbcewe.isSelected()) {
            System.out.println("Perempuan");
        }
        
        System.out.print("Menu Pilihan\t\t: "+cbmenu.getItemAt(cbmenu.getSelectedIndex())+"\n");
        System.out.print("Pilihan Cemilan\t\t: ");
        if(cbkerupuk.isSelected()){
            System.out.print("Kerupuk ");
        }
        if(cbondeonde.isSelected()) {
            System.out.print("Onde Onde ");
        }
        if(cbbolu.isSelected()){
            System.out.print("Bolu ");
        }
        if(cbpiscok.isSelected()) {
            System.out.print("Piscok");
        }        
        
        System.out.print("Menu Pembayaran\t\t: "+cbbayar.getItemAt(cbbayar.getSelectedIndex())+"\n");

    }   

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == bsimpan){
            cekData();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Halo, "+fnama.getText()+"\n" 
                    + "Pesanan Anda Berhasil Disimpan\n\n");
        }
        if (event.getSource() == breset){
            fnama.setText("");
            fuang.setText("");
        }
        if (event.getSource() == bkeluar) {
            int a=JOptionPane.showConfirmDialog(f,"Ingin Keluar?");  
            if(a==JOptionPane.YES_OPTION){  
                dispose();  
            }
            if(a==JOptionPane.NO_OPTION){  
                fnama.setText("");
                fuang.setText("");
            }
        }
    }
}