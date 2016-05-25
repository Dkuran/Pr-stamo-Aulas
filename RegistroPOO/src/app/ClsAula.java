/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author Dkuran
 */
public class ClsAula {
    
    private int idaul;
    private String nombreaul;
    private String codigoaul;
    private String estadoaul;
    
    public void generarCodigo(){
        //generar codigo del aula de manera automatica
    }
    
    public ClsAula(){
    
    }
    
    public ClsAula(int idaul, String nombreaul,
            String codigoaul){
        this.idaul = idaul;
        this.nombreaul = nombreaul;
        this.codigoaul = codigoaul;
        this.estadoaul = "libre";
        
    }

    public void mostrarAul(){
        System.out.println("Aula: "+this.nombreaul);
        System.out.println("Código: "+this.codigoaul);
        System.out.println("Estado: "+this.estadoaul);
    }
    
    
    public ClsAula identificar(int id){
        
        if(this.idaul == id){
            return this;
        }else{
            return null;
        }
        
    }
    /**
     * @return the idaul
     */
    public int getIdaul() {
        return idaul;
    }

    /**
     * @param idaul the idaul to set
     */
    public void setIdaul(int idaul) {
        this.idaul = idaul;
    }

    /**
     * @return the nombreaul
     */
    public String getNombreaul() {
        return nombreaul;
    }

    /**
     * @param nombreaul the nombreaul to set
     */
    public void setNombreaul(String nombreaul) {
        this.nombreaul = nombreaul;
    }

    /**
     * @return the codigoaul
     */
    public String getCodigoaul() {
        return codigoaul;
    }

    /**
     * @param codigoaul the codigoaul to set
     */
    public void setCodigoaul(String codigoaul) {
        this.codigoaul = codigoaul;
    }

    /**
     * @return the estadoaul
     */
    public String getEstadoaul() {
        return estadoaul;
    }

    /**
     * @param estadoaul the estadoaul to set
     */
    public void setEstadoaul(String estadoaul) {
        this.estadoaul = estadoaul;
    }
}
