package com.challengemm.models.Usuario;

import java.util.Objects;

public class Usuario {
    private String idUsuario;
    private String nome;
    private TURNO_USUARIO turnoUsuario;

    //Métodos Gerais

    public Usuario() {
    }

    public Usuario(String idUsuario, String nome, TURNO_USUARIO turnoUsuario) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.turnoUsuario = turnoUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TURNO_USUARIO getTurnoUsuario() {
        return turnoUsuario;
    }

    public void setTurnoUsuario(TURNO_USUARIO turnoUsuario) {
        this.turnoUsuario = turnoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario) && Objects.equals(nome, usuario.nome) && turnoUsuario == usuario.turnoUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nome, turnoUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", nome='" + nome + '\'' +
                ", turnoUsuario=" + turnoUsuario +
                '}';
    }
}
