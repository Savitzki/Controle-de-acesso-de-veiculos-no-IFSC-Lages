
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Automovel;
import view.Tela_pesquisa_automovel;

/**
 *
 * @author mahsa
 */
public class ControllerBuscaAutomovel implements ActionListener{
    
    private final view.Tela_pesquisa_automovel telaBuscaAutomovel;
    
    public ControllerBuscaAutomovel(Tela_pesquisa_automovel telaPesquisaAuto){
        this.telaBuscaAutomovel = telaPesquisaAuto;
        
        this.telaBuscaAutomovel.getjB_carregar().addActionListener(this);
        this.telaBuscaAutomovel.getjB_sair().addActionListener(this);
        
        this.telaBuscaAutomovel.setLocationRelativeTo(telaPesquisaAuto);
        //this.telaBuscaAutomovel.setIcon();
        
        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaAutomovel.getjT_listaAutomovel().getModel();
        for (Automovel automovelAtualDaLista : service.ServiceAutomovel.Buscar()) {
            tabela.addRow(new Object[]{automovelAtualDaLista.getID(),
                                       automovelAtualDaLista.getPlaca(),
                                       automovelAtualDaLista.getAno()});
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.telaBuscaAutomovel.getjB_carregar()){
            //Aqui carrega a lista ou o arquivo?
        }
        
        if(e.getSource()==this.telaBuscaAutomovel.getjB_sair()){
            this.telaBuscaAutomovel.dispose();
        }
    }
    
}
