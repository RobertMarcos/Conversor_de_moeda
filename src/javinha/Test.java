package javinha;

import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

public class Test extends Conversao{

	private JPanel contentPane;
	
	// crindo / estanciando objetos
	
	 JFrame frame = new JFrame();
	private JButton btn = new JButton("Converter");
	
	 JLabel lb = new JLabel("Valor");
	private Conversao conv = new Conversao();
	private JLabel lb1 = new JLabel("resultado");
	private JTextField txt1 = new JTextField();
	private JLabel lb2 = new JLabel("Escolha uma moeda!!");
	JLabel jl4 = new JLabel("resultado");
	private JCheckBoxMenuItem salvamentoAuto = new JCheckBoxMenuItem("Salvar Automaticamente ");
	ArrayList <Double>lista = new ArrayList<Double>();
	
	 
	 private int moe = 0;
	 
	// janela
	 
	public  void fazer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	
}

	/**
	 * Create the frame.
	 */
	public Test() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(154, 153, 150));
		frame.setJMenuBar(menuBar);
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			
			
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
		});
		menuBar.add(button);
		
		JMenu mnNewMenu_1 = new JMenu("Conversor");
		menuBar.add(mnNewMenu_1);
		JMenuItem realDoll_1 = new JMenuItem("Real para Dollar");
		mnNewMenu_1.add(realDoll_1);
		realDoll_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				
//				
				moe = 1;
				txt1.setVisible(true);
				lb.setVisible(true);
				lb1.setVisible(true);
				lb2.setVisible(true);				
				lb2.setText("Real Para Dollar");
				btn.setVisible(true);
                			
			}
		});
		
		JMenuItem realEuro = new JMenuItem("Real para Euro");
		mnNewMenu_1.add(realEuro);
		
           realEuro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				moe = 2;
				txt1.setVisible(true);
				lb.setVisible(true);
				lb1.setVisible(true);
				lb2.setVisible(true);				
				lb2.setText("Real Para Euro");
				btn.setVisible(true);
			}
		});
		
		
		JMenuItem realpesoarg = new JMenuItem("Real para Peso Argentino");
		realpesoarg.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				moe = 3;
				txt1.setVisible(true);
				lb.setVisible(true);
				lb1.setVisible(true);
				lb2.setVisible(true);				
				lb2.setText("Real Para Peso Argentino");
				btn.setVisible(true);
			}
		});
		mnNewMenu_1.add(realpesoarg);
		
		JMenuItem realpesochil_1 = new JMenuItem("Real para Peso Chileno");
		realpesochil_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				moe = 4;
				txt1.setVisible(true);
				lb.setVisible(true);
				lb1.setVisible(true);
				lb2.setVisible(true);				
				lb2.setText("Real Para Peso Chileno");
				btn.setVisible(true);
			}
		});
		mnNewMenu_1.add(realpesochil_1);
		
		JMenuItem realparale = new JMenuItem("Real para Libras Esterlinas");
		realparale.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				moe = 5;
				txt1.setVisible(true);
				lb.setVisible(true);
				lb1.setVisible(true);
				lb2.setVisible(true);				
				lb2.setText("Real Para Peso Libras Estrelinas");
				btn.setVisible(true);
			}
			
		});
		mnNewMenu_1.add(realparale);
		
		Component horizontalStrut = Box.createHorizontalStrut(219);
		menuBar.add(horizontalStrut);
		
		JMenu mnSalvarConvero = new JMenu("Opções..");
		menuBar.add(mnSalvarConvero);
		
		JMenuItem SalvarConvero = new JMenuItem("Salvar Converção Atual");
		SalvarConvero.addActionListener(new ActionListener() {
			
			// lista
			
			public void actionPerformed(ActionEvent arg0) {
				lista.add(conv.getMoEsc());
				System.out.println(lista);
			}
			
		});
		
		
		mnSalvarConvero.add(salvamentoAuto);
		
	
		
		
		mnSalvarConvero.add(SalvarConvero);
		
		JMenuItem mntmMostrarConversesSalvas = new JMenuItem("Mostrar Conversões salvas");
		mntmMostrarConversesSalvas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame j2 = new JFrame();
				JButton jb2 =new JButton("Limpar");
				JButton jb3 =new JButton("Exportar");
				
				j2.setSize(200,400);
				j2.setVisible(true);
				j2.getContentPane().setLayout(new FlowLayout());
				jb2.setBounds(50,400, 60,60);
				jb3.setBounds(40,400, 60,60);
				
				
				j2.getContentPane().add(jb2);
				j2.getContentPane().add(jb3);
				j2.getContentPane().add(jb3);
				j2.getContentPane().add(jl4);
				
			}
		});
		mnSalvarConvero.add(mntmMostrarConversesSalvas);
		
		
		//grid
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		lb2.setBounds(147, 39, 138, 18);
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Bitstream Charter", Font.BOLD, 14));
		contentPane.add(lb2);
		lb.setBounds(35, 92, 35, 18);
		lb.setFont(new Font("Bitstream Charter", Font.BOLD, 14));
		contentPane.add(lb);
		lb.setVisible(false);
		txt1.setBounds(159, 92, 114, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		txt1.setVisible(false);
		lb1.setBounds(186, 116, 60, 18);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("Bitstream Charter", Font.BOLD, 14));
		contentPane.add(lb1);
		lb1.setVisible(false);
		btn.setBounds(164, 174, 104, 25);
		
		//
		btn.setVisible(false);
		
	
		
		btn.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				try {
				int valo = Integer.parseInt(txt1.getText());
				conv.setMoedaE(moe);
				conv.setValor(valo);
				txt1.setText("");
				
				
					switch(moe) {
					
					case 1:
						
					lb1.setText(""+ conv.getMoEsc());
						
						break;
					
					case 2:
						lb1.setText(""+conv.getMoEsc());
						break;
					case 3:
						lb1.setText("" + conv.getMoEsc());
			
					case 4: 
						lb1.setText(""+ conv.getMoEsc());
				
					case 5:
						lb1.setText(""+conv.getMoEsc());
					
					}
					
					if(salvamentoAuto.isSelected() == true) {
						lista.add(conv.getMoEsc());
					
						if(lista.size() == 5) {
							lista.remove(0);
						}
					
					}	
					
					jl4.setText("" + lista);
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Digite um Valor valido");
				}
			}
		});
		contentPane.add(btn);
		
		
	}
}
