package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Proprietario;
import view.Tela_pesquisa_proprietario;

public class ControllerBuscaProprietario implements ActionListener {

    view.Tela_pesquisa_proprietario telaBuscaProprietario;

    public ControllerBuscaProprietario(Tela_pesquisa_proprietario telaBuscaProp) {
        this.telaBuscaProprietario = telaBuscaProp;

        this.telaBuscaProprietario.getjB_carregar().addActionListener(this);
        this.telaBuscaProprietario.getjB_sair().addActionListener(this);

        this.telaBuscaProprietario.setLocationRelativeTo(telaBuscaProp);
        this.telaBuscaProprietario.setIcon();

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProprietario.getjT_listaProprietario().getModel();
        for (Proprietario propAtualDaLista : service.ServiceProprietario.Buscar()) {
            tabela.addRow(new Object[]{propAtualDaLista.getID(), propAtualDaLista.getTipo(),
                propAtualDaLista.getNome(),
                propAtualDaLista.getCpf(),
                propAtualDaLista.getRg(),
                propAtualDaLista.getCnh(),
                propAtualDaLista.getEndereco(),
                propAtualDaLista.getBairro(),
                propAtualDaLista.getEndereco(),
                propAtualDaLista.getFone(),
                propAtualDaLista.getFone2(),
                propAtualDaLista.getEmail(),
                propAtualDaLista.getSexo(),});
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProprietario.getjB_carregar()) {

        } else if (e.getSource() == this.telaBuscaProprietario.getjB_sair()) {
            this.telaBuscaProprietario.dispose();
        }
    }
}
