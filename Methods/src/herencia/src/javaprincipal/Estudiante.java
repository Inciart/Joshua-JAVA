/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprincipal;

/**
 *
 * @author User
 */
public class Estudiante {
    private String nombres;
    private String apellidos;
    private String documento;
    private String codigo;

    public Estudiante(String nombres, String apellidos, String documento, String codigo) {
        this.setNombres(nombres);
        this.setApellidos(apellidos);
        this.setCodigo(codigo);
        this.setCodigo(codigo);
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}