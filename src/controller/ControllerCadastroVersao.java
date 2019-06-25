package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Modelo;
import model.bo.Versao;
import view.Tela_cadastro_versao;
import view.Tela_pesquisa_versao;

public class ControllerCadastroVersao implements ActionListener {

    private final Tela_cadastro_versao telaCadVersao;

    public ControllerCadastroVersao(Tela_cadastro_versao tela) {
        this.telaCadVersao = tela;

        this.telaCadVersao.getjB_novo().addActionListener(this);
        this.telaCadVersao.getjB_gravar().addActionListener(this);
        this.telaCadVersao.getjB_cancelar().addActionListener(this);
        this.telaCadVersao.getjB_pesquisar().addActionListener(this);
        this.telaCadVersao.getjB_sair().addActionListener(this);

        this.telaCadVersao.setLocationRelativeTo(tela);
        ativa(true);
        travaCamposDetexto(true);
        service.ServiceModelo.Buscar().forEach((modeloAtualDaLista) -> {
            this.telaCadVersao.getjCb_modelo().addItem(modeloAtualDaLista.getNome_modelo());
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadVersao.getjB_novo()) {
            ativa(false);
            travaCamposDetexto(false);

        } else if (e.getSource() == this.telaCadVersao.getjB_gravar()) {
            
            Versao versao = new Versao();
            int tamanhoLista = 0;
                tamanhoLista = service.ServiceVersao.Buscar().size();
                if (tamanhoLista != 0) {
                    versao.setID(service.ServiceVersao.Buscar().get(tamanhoLista - 1).getID() + 1);
                } else {
                    versao.setID(1);
                }
                
                versao.setNome_versao(this.telaCadVersao.getjTf_versao().getText());
                versao.setPotencia(this.telaCadVersao.getjTf_potencia().getText());
                versao.setNumero_de_portas(Integer.valueOf(this.telaCadVersao.getjCb_portas().getSelectedItem()+""));
                versao.setNumero_de_assentos(Integer.valueOf(this.telaCadVersao.getjTf_nLugares().getText()+""));
                versao.setCambio(this.telaCadVersao.getjTf_cambio().getText());
                versao.setConsumo(this.telaCadVersao.getjTf_consumo().getText());
                
                service.ServiceVersao.Incluir(versao);
                ativa(false);

        } else if (e.getSource() == this.telaCadVersao.getjB_cancelar()) {
            ativa(true);
            travaCamposDetexto(true);

        } else if (e.getSource() == this.telaCadVersao.getjB_pesquisar()) {
            Tela_pesquisa_versao telaPesquisa = new Tela_pesquisa_versao(null, true);
            ControllerBuscaVersao controler = new ControllerBuscaVersao(telaPesquisa);
            telaPesquisa.setVisible(true);

        } else if (e.getSource() == this.telaCadVersao.getjB_sair()) {
            this.telaCadVersao.dispose();
        }

    }

    public final void ativa(boolean estadoBotao) {
        this.telaCadVersao.getjB_novo().setEnabled(estadoBotao);
        this.telaCadVersao.getjB_gravar().setEnabled(!estadoBotao);
        this.telaCadVersao.getjB_cancelar().setEnabled(!estadoBotao);
        this.telaCadVersao.getjB_pesquisar().setEnabled(estadoBotao);
        this.telaCadVersao.getjB_sair().setEnabled(estadoBotao);
    }

    public final void travaCamposDetexto(boolean travaCampos) {
        this.telaCadVersao.getjTf_versao().setEnabled(!travaCampos);
        this.telaCadVersao.getjTf_cambio().setEnabled(!travaCampos);
        this.telaCadVersao.getjTf_consumo().setEnabled(!travaCampos);
        this.telaCadVersao.getjTf_nLugares().setEnabled(!travaCampos);
        this.telaCadVersao.getjCb_portas().setEnabled(!travaCampos);
        this.telaCadVersao.getjTf_potencia().setEnabled(!travaCampos);
        this.telaCadVersao.getjCb_modelo().setEnabled(!travaCampos);
        this.telaCadVersao.getjTf_id().setEnabled(!travaCampos);

    }

    public void limpaCampos(boolean limpo) {
        this.telaCadVersao.getjTf_versao().setText("");
        this.telaCadVersao.getjTf_cambio().setText("");
        this.telaCadVersao.getjTf_consumo().setText("");
        this.telaCadVersao.getjTf_nLugares().setText("");
        this.telaCadVersao.getjCb_portas().setSelectedItem(null);
        this.telaCadVersao.getjTf_potencia().setText("");
    }

}
