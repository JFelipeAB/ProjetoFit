/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.basis;

/**
 *
 * @author joao-
 */
public enum EnumTreino {
    Iniciante1("Caminhada 20 minutos"),
    Iniciante2("Flexão de joelehos 3x15"),
    Iniciante3("Agachamento 3 x 15"),
    Iniciante4("abdominal 3 x 15"),
    Intermediario1("Caminhada 40 minutos"),
    Intermediario2("Flexão 4x10"),
    Intermediario3("Agachamento 5 x 15"),
    Intermediario4("abdominal 5 x 15"),
    Avançado1("Corrida 15 minutos"),
    Avançado2("Flexão 5x20"),
    Avançado3("Agachamento 5 x 30"),
    Avançado4("abdominal 5 x 20");
    private String descricao;

    EnumTreino(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
