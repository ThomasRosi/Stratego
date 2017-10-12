package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OptionFenetre extends JFrame{

    /**
	*@author Raeymaekers Charles
	*/
    
	private static final long serialVersionUID = 1L;
	public JButton blevel1 = new JButton("RandomIA");
    public JButton blevel2 = new JButton("AverageIA");
    public int a = 0;
    public int ialevel = a;

    public OptionFenetre(){

        OptionPanel opan = new OptionPanel();
        //give the title 
        this.setTitle("Option");
        //define the size: 1024 pixels of weight et 768 pixels high
        this.setSize(300, 300);
        //define the location to the center with null
        this.setLocationRelativeTo(null);
        //we hide the fenetre when we click on the red cross
        this.setDefaultCloseOperation(OptionFenetre.HIDE_ON_CLOSE);
        //define if we could extend the fenetre, in this case we can't
        this.setResizable(false);

        blevel1.setPreferredSize(new Dimension(120, 30));
        blevel2.setPreferredSize(new Dimension(120, 30));
        

        //cree un tableau ou on rajouterai le pointeur et les boutons.
        GridBagLayout ngl2 = new GridBagLayout();
        opan.setLayout(ngl2);
        //creation du pointeur de gridbaglayout
        GridBagConstraints gbc2 = new GridBagConstraints();
        //on ajout les bouton et le pointeur a notre panel
        opan.add(blevel1, gbc2);
        gbc2.gridy = 1;  //sers a positonner les boutons sur l'axe y 
        opan.add(blevel2, gbc2);
     

        this.setContentPane(opan);

        blevel1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ialevel = 0;
                System.out.println("easy");
            }
        });
        blevel2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ialevel = 1;
                System.out.println("Medium");
                
            }
        });
        
   
        //we make this visible to us
        this.setVisible(true);
        
    }
    public int getIalevel(){
    	return ialevel;
    	
    }
    
    
}