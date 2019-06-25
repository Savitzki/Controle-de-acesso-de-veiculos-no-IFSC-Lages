package controller;

//Controlador da tela de ajuda

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Help;

public class ControllerHelp implements ActionListener{
    
    private final Help telaHelp;

    public ControllerHelp(Help tela){
        this.telaHelp = tela;
        this.telaHelp.getjB_sair().addActionListener(this);
        
        this.telaHelp.setLocationRelativeTo(tela);
        this.telaHelp.getPainelEditor().setText("Objetivo:\n"
                + "   Esta aplicação tem por objetivo realiza o monitoramento de acesso ao IFSC.\n\n"
                + "Como utilizar?\n"
                + "   No item de menu 'Cadastros', contém os itens que devem ser cadastrados antes de rea-\nlizar o controle de acesso\n");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.telaHelp.getjB_sair()){
            this.telaHelp.dispose();
        }
    }
    
    
}
