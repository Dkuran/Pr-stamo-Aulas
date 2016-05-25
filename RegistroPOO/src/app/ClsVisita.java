/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dkuran
 */
public class ClsVisita {
    
    private int idvst;
    private int idaul;
    private int idusr;
    private Date fechavst;
    private String estadovst;
    SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd");
    
    public ClsVisita(int idvst, int idaul, int idusr,
            Date fechavst, String estadovst){
        this.idvst = idvst;
        this.idaul = idaul;
        this.idusr = idusr;
        this.fechavst = fechavst;
        this.estadovst = estadovst;
    }

    public void mostrarVst(){
        System.out.println("Visita: "+ this.idvst+" el: "+ft.format(this.fechavst));
        System.out.println("_____________________");
        //System.out.println("Aula: "+ this.idaul);
        //System.out.println("Usr: "+this.idusr);
        System.out.println("Accion: "+this.estadovst);
        
    }
    
    
    public String printVst(){
        return "Visita: "+ this.idvst+"\nel: "
                +ft.format(this.fechavst)+"\n"+"__________________"+
                "\nAccion: "+this.estadovst;
        
    }
    
    /**
     * @return the idvst
     */
    public int getIdvst() {
        return idvst;
    }

    /**
     * @param idvst the idvst to set
     */
    public void setIdvst(int idvst) {
        this.idvst = idvst;
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
     * @return the fechavst
     */
    public Date getFechavst() {
        return fechavst;
    }

    /**
     * @param fechavst the fechavst to set
     */
    public void setFechavst(Date fechavst) {
        this.fechavst = fechavst;
    }

    /**
     * @return the estadovst
     */
    public String getEstadovst() {
        return estadovst;
    }

    /**
     * @param estadovst the estadovst to set
     */
    public void setEstadovst(String estadovst) {
        this.estadovst = estadovst;
    }
    
    
}
