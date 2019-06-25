//Controler da tela Sobre
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Sobre;

public class ControllerSobre implements ActionListener {

    private final Sobre telaSobre;

    public ControllerSobre(Sobre tela) {
        this.telaSobre = tela;

        this.telaSobre.getSair().addActionListener(this);
        this.telaSobre.setLocationRelativeTo(tela);

        //adicionar conteudo no textArea 
        this.telaSobre.getAreaDeTexto().setText("\nEsta aplicação é um trabalho final da disciplina "
                + "de DOO-desenvolvimento orientado a objetos"
                + "\nDesenvolvido em sala de aula!\n\nfeito por: Marina Savitzki, "
                + "Ciencia da Computação, fase 3, 2019/1");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaSobre.getSair()) {
            this.telaSobre.dispose();

        }
    }

}
