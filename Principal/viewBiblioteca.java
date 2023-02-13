
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

abstract class viewBiblioteca {

	private JFrame frame;
	private float saldo;
	private int conquistas;
	private int jogosPossuidos;
	private JTextField horasField;
	private String nome;
	
	public viewBiblioteca(String nome) {
		this.nome = nome;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize(List<Produto> produtoDisponiveis, Jogador player) {
		setFrame(new JFrame());
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().getContentPane().setBackground(Color.WHITE);
		getFrame().setBounds(100, 100, 1000, 500);  //1220
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 26, 203, 362);
		panel.setBackground(Color.CYAN);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(nome);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(71, 123, 111, 20);
		panel.add(lblNewLabel);
		
		JLabel img = new JLabel("img");
		img.setForeground(Color.PINK);
		img.setBackground(Color.BLACK);
		img.setIcon(new ImageIcon("C:\\GitHub\\Java-OO\\teste\\Bomberman-icon.png"));
		img.setBounds(10, 11, 179, 101);
		panel.add(img);
		
		JLabel txtSaldo = new JLabel("SALDO:");
		txtSaldo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSaldo.setBounds(10, 186, 102, 14);
		panel.add(txtSaldo);

		player.setConquistas(produtoDisponiveis);
		conquistas = player.getConquistas();
		JLabel txtConquistas = new JLabel(String.format("CONQUISTAS: %d", conquistas));
		txtConquistas.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtConquistas.setBounds(10, 268, 102, 14);
		panel.add(txtConquistas);
		
		
		
		JButton btnvoltarLogin = new JButton("Voltar");
		btnvoltarLogin.setBounds(73, 402, 89, 23);
		btnvoltarLogin.setBackground(Color.WHITE);
		btnvoltarLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnvoltarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewLogin window = new viewLogin("","");
				window.getFrame().setVisible(true);
				getFrame().setVisible(false);
				
			}
		});
		getFrame().getContentPane().add(btnvoltarLogin);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(282, 209, 175, 147);
		getFrame().getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("JOGO ATUAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(50, 11, 130, 14);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(536, 209, 175, 147);
		getFrame().getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel txtTituloJogarHoras = new JLabel("JOGAR(HORAS)");
		txtTituloJogarHoras.setBounds(45, 11, 89, 14);
		panel_4.add(txtTituloJogarHoras);
		txtTituloJogarHoras.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		horasField = new JTextField();
		horasField.setBounds(24, 32, 124, 20);
		panel_4.add(horasField);
		horasField.setColumns(10);
		
		
		saldo = player.getSaldoTotal();

		JButton btnComprar = new JButton("+ COMPRAR SALDO");
		btnComprar.setBounds(784, 399, 160, 29);
		btnComprar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComprar.setBackground(Color.GREEN);
		txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.setSaldoTotal( saldo += 10);
				txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
			}
		});

		getFrame().getContentPane().add(btnComprar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(536, 26, 175, 147);
		getFrame().getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox<String> comboBoxComprar = addJogos(produtoDisponiveis, false);
		panel_2.add(comboBoxComprar);
		 
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(282, 26, 175, 147);
		getFrame().getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox<String> comboBoxMeusJogos = addJogos(produtoDisponiveis, true);
		panel_1.add(comboBoxMeusJogos);
		comboBoxMeusJogos.setToolTipText("MEUSJOGOS");

		jogosPossuidos = jogosComprados(produtoDisponiveis);
		JLabel txtJogos = new JLabel("JOGOS: " + jogosPossuidos);
		txtJogos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtJogos.setBounds(10, 228, 102, 14);
		panel.add(txtJogos);

		JLabel txtTituloComprar = new JLabel("LOJA");
		txtTituloComprar.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloComprar.setBounds(75, 11, 107, 14);
		panel_2.add(txtTituloComprar);
		
		JButton btnComprarJogo = new JButton("COMPRAR");
		btnComprarJogo.setBounds(36, 76, 99, 23);
		btnComprarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				comboBoxComprar.getSelectedItem();

				for (Produto produto : produtoDisponiveis) {
					if (produto instanceof Jogo) {
						if (produto.toString().equals(comboBoxComprar.getSelectedItem()) && player.comprarJogo((Jogo) produto)) {
							
							comboBoxMeusJogos.addItem(produto.toString());
							comboBoxComprar.removeItem(comboBoxComprar.getSelectedItem());
							saldo = player.getSaldoTotal();
							txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
							jogosPossuidos = jogosComprados(produtoDisponiveis);
							txtJogos.setText("JOGOS: " + jogosPossuidos);
							break;
					}
					}
					
				}
				
			}
		});
		
		panel_2.add(btnComprarJogo);

		JButton btnOverView = new JButton("EXIBIR OVERVIEW");
		btnOverView.setBackground(Color.YELLOW);
		btnOverView.setBounds(24, 300, 150, 23);
		btnOverView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Suas informações:\n- Conquistas: " + conquistas +
				                                                                      "\n- Jogos comprados: " + jogosPossuidos +
																					   String.format("\n- Media de conquistas por jogo: %.2f", mediaPorJogos(conquistas, jogosPossuidos)) +
																					   String.format("\n- Media de horas por jogo: %.2f", mediaPorJogos(totalHorasJogadas(produtoDisponiveis), jogosPossuidos)), 
																						"Solar",
																							JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		panel.add(btnOverView);
		
		JLabel txtTituloMeuJogos = new JLabel("SELECIONAR JOGO");
		txtTituloMeuJogos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloMeuJogos.setBounds(36, 11, 111, 14);
		panel_1.add(txtTituloMeuJogos);
		
		

		JLabel txtInfoJogo = new JLabel("SELECIONAR JOGO");
		txtInfoJogo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtInfoJogo.setBounds(36, 11, 111, 14);
		panel_1.add(txtInfoJogo);

		JButton btnInfo = new JButton("EXIBIR INFO");
		btnInfo.setBounds(34, 68, 100, 23);
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Produto produto : produtoDisponiveis) {
					if (produto instanceof Jogo) {
						if (produto.toString().equals(comboBoxMeusJogos.getSelectedItem())) {
							
							Jogo jogoSelecionado = (Jogo) produto;

							jogoSelecionado.exibirJogo();
							break;
					}
					}
					
				}
			}
		});
		panel_3.add(btnInfo);


		JButton btnJogar = new JButton("JOGAR");
		btnJogar.setBounds(34, 68, 100, 23);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Produto produto : produtoDisponiveis) {
					if (produto instanceof Jogo) {
						if (produto.toString().equals(comboBoxMeusJogos.getSelectedItem())) {
							
							Jogo jogoSelecionado = (Jogo) produto;

							jogoSelecionado.Jogar(horasField.getText());

							player.setConquistas(produtoDisponiveis);
							conquistas = player.getConquistas();
							txtConquistas.setText(String.format("CONQUISTAS: %d", conquistas));
							break;
					}
					}
					
				}
			}
		});
		panel_4.add(btnJogar);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(782, 26, 175, 147);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);

		JLabel txtTituloCompraAlbum = new JLabel("COMPRAR ÁLBUM");
		txtTituloCompraAlbum.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloCompraAlbum.setBounds(41, 11, 98, 14);
		panel_5.add(txtTituloCompraAlbum);

		JComboBox<String> comboBoxComprarAlbum = addAlbuns(produtoDisponiveis, false);
		comboBoxComprarAlbum.setBounds(10, 36, 155, 22);
		panel_5.add(comboBoxComprarAlbum);


		
		JButton btnComprarAlbum = new JButton("COMPRAR");
		btnComprarAlbum.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComprarAlbum.setBounds(41, 75, 98, 23);
		
		panel_5.add(btnComprarAlbum);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(782, 209, 175, 147);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel txtTituloOuvirAlbum = new JLabel("OUVIR ÁLBUM");
		txtTituloOuvirAlbum.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTituloOuvirAlbum.setBounds(48, 11, 86, 14);
		panel_6.add(txtTituloOuvirAlbum);
		
		JComboBox<String> comboBoxOuvirAlbum = addAlbuns(produtoDisponiveis, true);
		comboBoxOuvirAlbum.setBounds(10, 35, 155, 22);
		panel_6.add(comboBoxOuvirAlbum);

		btnComprarAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Produto produto : produtoDisponiveis) {

					if (produto instanceof AlbumMusical) {
						if (produto.toString().equals(comboBoxComprarAlbum.getSelectedItem()) && player.comprarJogo((AlbumMusical) produto)) {
							
							comboBoxOuvirAlbum.addItem(produto.toString());
							comboBoxComprarAlbum.removeItem(comboBoxComprarAlbum.getSelectedItem());
							saldo = player.getSaldoTotal();
							txtSaldo.setText(String.format("SALDO:  %.2f", saldo));
							break;
					}
					}
					
				}
				
			}
		});

		JButton btnExibirMusicas = new JButton("EXIBIR MÚSICAS");
		btnExibirMusicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Produto produto : produtoDisponiveis) {

					if (produto instanceof AlbumMusical) {
						if (produto.toString().equals(comboBoxOuvirAlbum.getSelectedItem())) {
							
							AlbumMusical album = (AlbumMusical) produto;

							album.exibirAlbum();

							break;
					}
					}
					
				}
				
			}
		});
		btnExibirMusicas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExibirMusicas.setBounds(20, 68, 133, 23);
		panel_6.add(btnExibirMusicas);
		
		JButton btnOuvir = new JButton("OUVIR");
		btnOuvir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOuvir.setBounds(45, 102, 89, 23);

		btnOuvir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Produto produto : produtoDisponiveis) {

					if (produto instanceof AlbumMusical) {
						if (produto.toString().equals(comboBoxOuvirAlbum.getSelectedItem())) {
							
							AlbumMusical album = (AlbumMusical) produto;
							album.ouvirAlbum();
							break;
					}
					}
					
				}
				
			}
		});
		panel_6.add(btnOuvir);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JComboBox<String> addJogos(List<Produto> produtoDisponiveis, boolean possui){
		JComboBox<String> comboBoxComprar = new JComboBox<String>();
		comboBoxComprar.setBounds(10, 33, 155, 22);

		for (Produto produto : produtoDisponiveis) {
			if (produto instanceof Jogo && produto.getPossui() == possui) {
				comboBoxComprar.addItem(produto.toString());
			}
		}
		
		return comboBoxComprar;
	}

	public JComboBox<String> addAlbuns(List<Produto> produtoDisponiveis, boolean possui){
		JComboBox<String> comboBoxComprar = new JComboBox<String>();
		comboBoxComprar.setBounds(10, 33, 155, 22);

		for (Produto produto : produtoDisponiveis) {
			if (produto instanceof AlbumMusical && produto.getPossui() == possui) {
				comboBoxComprar.addItem(produto.toString());
			}
		}
		
		return comboBoxComprar;
	}

	public int jogosComprados(List<Produto> produtoDisponiveis){
		List<Produto> jogos = new ArrayList<Produto>();
		for (Produto produto : produtoDisponiveis) {
			if (produto instanceof Jogo && produto.getPossui()) {
				jogos.add(produto);
			}
		}

		return jogos.size();
	}

	public float mediaPorJogos(int numero, int jogos){
		float resultado;
		try {
			resultado = (float) numero / (float) jogos;
			
			return resultado;

		} catch (Exception e) {
			return 0;
		}
	}

	public int totalHorasJogadas(List<Produto> produtos){
		int total = 0;
		for (Produto produto : produtos) {
			if (produto instanceof Jogo) {
				Jogo jogo = (Jogo) produto;
				total += jogo.getHorasJogadas();
			}
		}

		return total;
	}
	
}