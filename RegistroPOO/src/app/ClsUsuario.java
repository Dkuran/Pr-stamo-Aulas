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
public class ClsUsuario {
    
    private int idusr;
    private String nombreusr;
    private String passusr;
    
    public ClsUsuario(int idusr, String nombreusr, String passusr){
        this.idusr = idusr;
        this.nombreusr = nombreusr;
        this.passusr = passusr;
        
    }
    
    public ClsUsuario(){
    
    }
    
    public ClsUsuario comprobarPass(String pass){
        
        //boolean verificar = false;
        
        if(this.passusr.equals(pass)){
            return this;
        }else{
            return null;
        } 
        
    }
    
    public ClsUsuario identificar(int id){
        
        if(this.idusr == id){
            return this;
        }else{
            return null;
        }
        
    }
    
    public void mostrarUsr(){
        System.out.println("Hola: "+this.nombreusr);
    }

    /**
     * @return the idusr
     */
    public int getIdusr() {
        return idusr;
    }

    /**
     * @param idusr the idusr to set
     */
    public void setIdusr(int idusr) {
        this.idusr = idusr;
    }

    /**
     * @return the nombreusr
     */
    public String getNombreusr() {
        return nombreusr;
    }

    /**
     * @param nombreusr the nombreusr to set
     */
    public void setNombreusr(String nombreusr) {
        this.nombreusr = nombreusr;
    }

    /**
     * @return the passusr
     */
    public String getPassusr() {
        return passusr;
    }

    /**
     * @param passusr the passusr to set
     */
    public void setPassusr(String passusr) {
        this.passusr = passusr;
    }
           
           
    
}
