
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Versao;
import view.Tela_pesquisa_versao;

/**
 *
 * @author mahsa
 */
public class ControllerBuscaVersao implements ActionListener{
    
    private view.Tela_pesquisa_versao telaPesquisaVersao;
    
    public ControllerBuscaVersao(Tela_pesquisa_versao telaPVersao){
        
        this.telaPesquisaVersao = telaPVersao;
        
        this.telaPesquisaVersao.getjB_carregar().addActionListener(this);
        this.telaPesquisaVersao.getjB_sair().addActionListener(this);
        
        this.telaPesquisaVersao.setLocationRelativeTo(telaPVersao);
        this.telaPesquisaVersao.setIcon();
        
         DefaultTableModel tabela = (DefaultTableModel) this.telaPesquisaVersao.getjT_listaMarca().getModel();
        for (Versao versaoAtualDaLista : service.ServiceVersao.Buscar()) {
            tabela.addRow(new Object[]{versaoAtualDaLista.getID(), 
                versaoAtualDaLista.getModelo(),
                versaoAtualDaLista.getNome_versao(),
                versaoAtualDaLista.getNumero_de_assentos(),              
                versaoAtualDaLista.getNumero_de_portas(), 
                versaoAtualDaLista.getPotencia(), 
                versaoAtualDaLista.getCambio(),
                versaoAtualDaLista.getConsumo()});
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.telaPesquisaVersao.getjB_carregar()){
            
        }else if(e.getSource()==this.telaPesquisaVersao.getjB_sair()){
            this.telaPesquisaVersao.dispose();
        }
    }
    
}
