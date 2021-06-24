/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Erika
 */
public class Ventana extends JFrame

{
    private JPanel panelBotones;
    private Panel panel;
    private JButton btnLinea;
    private JButton btnCuadrado;
    private JButton btnCirculo;
    private JButton btnCirculoCuadrado;
    public Ventana()
    {
        setTitle("SELECCION DE FIGURA");
        setBounds(50,50,600,600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentes();
    }
    public void initComponentes()
    {
        panelBotones=new JPanel();
        panel=new Panel();
        btnLinea=new JButton("Linea");
        panelBotones.add(btnLinea);
        btnCuadrado=new JButton("Cuadrado");
        panelBotones.add(btnCuadrado);
        btnCirculo=new JButton("Círculo");
        panelBotones.add(btnCirculo);
        btnCirculoCuadrado=new JButton("Circulo Cuadrado");
        panelBotones.add(btnCirculoCuadrado);
        add(panelBotones,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);
        btnLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setTipoFigura(1);
                panel.getFigura().setX(100);
                panel.getFigura().setY(100);
                panel.getFigura().setAncho(200);
                panel.getFigura().setAlto(200);
                panel.repaint();
            }
        });
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setTipoFigura(2);
                panel.getFigura().setX(100);
                panel.getFigura().setY(100);
                panel.getFigura().setAncho(200);
                panel.getFigura().setAlto(200);
                panel.repaint();
            }
        });
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setTipoFigura(3);
                panel.getFigura().setX(100);
                panel.getFigura().setY(100);
                panel.getFigura().setAncho(200);
                panel.getFigura().setAlto(200);
                panel.repaint();
            }
        });
        btnCirculoCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setTipoFigura(4);
                panel.getFigura().setX(100);
                panel.getFigura().setY(100);
                panel.getFigura().setAncho(200);
                panel.getFigura().setAlto(200);
                panel.repaint();
            }
        });
    }
    
    
    
}
