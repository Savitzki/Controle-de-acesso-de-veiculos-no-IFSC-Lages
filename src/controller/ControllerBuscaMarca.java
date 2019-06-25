package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Marca;
import view.Tela_pesquisa_marca;

public class ControllerBuscaMarca implements ActionListener {

    private final Tela_pesquisa_marca telaPesquisaMarca;

    public ControllerBuscaMarca(Tela_pesquisa_marca telaPesquisaMarca) {
        this.telaPesquisaMarca = telaPesquisaMarca;

        this.telaPesquisaMarca.getjB_sair().addActionListener(this);
        this.telaPesquisaMarca.getjB_carregar().addActionListener(this);
        
        this.telaPesquisaMarca.setLocationRelativeTo(telaPesquisaMarca);
        this.telaPesquisaMarca.setIcon();

        DefaultTableModel tabela = (DefaultTableModel) this.telaPesquisaMarca.getjT_listaMarca().getModel();
        for (Marca marcaAtualDaLista : service.ServiceMarcas.Buscar()) {
            tabela.addRow(new Object[]{marcaAtualDaLista.getID(), marcaAtualDaLista.getDescricao()});
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaPesquisaMarca.getjB_carregar()) {
        }

        if (e.getSource() == this.telaPesquisaMarca.getjB_sair()) {
            this.telaPesquisaMarca.dispose();
        }

    }
}
