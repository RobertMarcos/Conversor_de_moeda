package javinha;

import javax.swing.*;

public  class testes {



 public void fazer1  (int x, int y ) {
	 JFrame jf = new JFrame();
	
	jf.setSize(x, y);
	jf.setLocale(null);
	jf.setVisible(true);
	
	JButton jb = new JButton("aperte aqui");
	jb.setBounds(200,200 , 90, 90);
	
	jf.add(jb);
	
	}
	

}
