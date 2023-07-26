package classes;

import java.awt.*;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class ScreenProtector extends javax.swing.JFrame implements Runnable{

	// tamanho da tela
	private int height = 800;
	private int whidth = 1500;
	
	// teclas
	/*
	 * Funcionamento: quando a tecla � pressionada sua respectiva vari�vel fica 
	 * com valor True. Quando solta a vari�vel fica com valor False.
	 */
	private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
	
    // Construtor
	public ScreenProtector() {
        // Chama o metodo que realiza todas as configura��es iniciais necess�rias
		initComponents();
		
		// Mecanismo de execu��o paralela
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Realiza todas as configura��es iniciais necess�rias
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Chama os m�todos de Scaneamento de teclas (tecla pressionada / solta)
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        
        // Configura o layout da tela
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Largura
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, whidth, Short.MAX_VALUE)
        );
        // Altura
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, height, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // M�todo que verifica se as teclas foram pressionadas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // Verifica se a tecla seta para a esquerda foi pressiona
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            // coloca o valor da variavel left em true enquanto a tecla estiver pressionada
    		left = true;
        }
    	// Verifica se a tecla seta para a direita foi pressiona
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        	// coloca o valor da variavel right em true enquanto a tecla estiver pressionada
        	right = true;
        }
    	// Verifica se a tecla seta para cima foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_UP) 
        {
        	// coloca o valor da variavel up em true enquanto a tecla estiver pressionada
            up = true;
        }
    	// Verifica se a tecla seta para baixo foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) 
        {
        	// coloca o valor da variavel down em true enquanto a tecla estiver pressionada
            down = true;
        }
    }//GEN-LAST:event_formKeyPressed

    // M�todo que verifica se as teclas foram soltas
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
    	// Verifica se a tecla seta para a esquerda foi solta
    	if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
    		// volta o valor da variavel left em false depois que a tecla for solta
    		left = false;
        } 
    	// Verifica se a tecla seta para a direita foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
    		// volta o valor da variavel right em false depois que a tecla for solta
    		right = false;
        }
    	// Verifica se a tecla seta para cima foi solta
    	else if (evt.getKeyCode() == KeyEvent.VK_UP) {
    		// volta o valor da variavel up em false depois que a tecla for solta
    		up = false;
        }
    	// Verifica se a tecla seta para baixo foi solta
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
        	// volta o valor da variavel down em false depois que a tecla for solta
        	down = false;
        }
    }//GEN-LAST:event_formKeyReleased
	
	// Inicializa a janela
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenProtector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenProtector().setVisible(true);
            }
        });
	}
	
	
	// Implemente seu c�digo aqui.
	public void run() {
		// A vari�vel g recebe o objeto do tipo Graphics que permite gerar imagens na tela
		Graphics g = getBufferStrategy().getDrawGraphics();
		
		// Instancie suas formas geom�tricas aqui
		
		
		// Como num desenho animado, as anima��es s�o criadas a partir da sobreposi��o de frames
		while(true) {
			
			//limpa tela
			g.clearRect(0, 0, getWidth(), getHeight());
			
			// Implemente sua anima��o aqui.
			
			
			
			
		  // Exibe a tela
	      getBufferStrategy().show();
	            
	      // Unidade de tempo da anima��o
	      try {
	        Thread.sleep(5);
	      }catch  (InterruptedException ex) {}
		}
	}
}

