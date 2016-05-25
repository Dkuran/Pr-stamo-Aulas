/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Dkuran
 */
public class registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola");
        Date now = new Date();
        Scanner sc = new Scanner(System.in);
        String pass = null;
        ClsUsuario [] users = new ClsUsuario[2];
        ClsAula [] aulas = new ClsAula[2];
        ClsVisita [] visitas = new ClsVisita[100];
        int contUsuarios = 1;
        ClsUsuario us1 = new ClsUsuario(contUsuarios,"Andres Duran","1234");
        contUsuarios++;
        ClsUsuario us2 = new ClsUsuario(contUsuarios,"Jefferson Tana","4321");
        contUsuarios++;
        
        users[0] = us1;
        users[1] = us2;
        ClsAula au1 = new ClsAula(1,"22-A","TSI114");
        ClsAula au2 = new ClsAula(1,"22-B","TSI214");
        aulas[0] = au1;
        aulas[1] = au2;
        int contVisitas = 0;
        visitas[0] = null;
        
        /*for(int i = 0 ; i < 2 ; i++){
            users[i].mostrarUsr();
        }*/
        
        
        
        //boolean verificar = false;
        ClsUsuario sesion = new ClsUsuario();
        sesion = null;
        boolean continuar = true;
        String next = " "; 
        
        while(continuar == true){
            System.out.println("Ingrese su contrasenia");
            pass = sc.next();
            for(int i = 0 ; i < users.length ; i++){ 
                if( users[i].comprobarPass(pass) != null){
                    
                    sesion = users[i].comprobarPass(pass);
                   
                    if(au1.getEstadoaul().equals("libre")){
                        System.out.println("bienvenido: "+sesion.getNombreusr());
                        ClsVisita vs1 = new ClsVisita(contVisitas+1,au1.getIdaul(),sesion.getIdusr(),now,"entrada");
                        visitas[contVisitas] = vs1;
                        contVisitas++;
                        au1.setEstadoaul("ocupado");
                        System.out.println("Usted ha ingresado al aula"+au1.getNombreaul());
                    }else{
                    
                        //System.out.println("entra cuando no esta libre");
                    //System.out.println("algo"+visitas[0].getIdvst());
                        //if(au1.getEstadoaul().equals("ocupado")){
                            System.out.println("entra");
                            if(sesion.getIdusr() == visitas[contVisitas-1].getIdusr()){
                                System.out.println("adios: "+sesion.getNombreusr());
                                ClsVisita vs1 = new ClsVisita(contVisitas+1,au1.getIdaul(),sesion.getIdusr(),now,"salida");
                                visitas[contVisitas] = vs1;
                                contVisitas++;
                                au1.setEstadoaul("libre");
                                System.out.println("Usted ha salido del aula"+au1.getNombreaul());
                            }else{
                                System.out.println("El aula esta ocupada por favor revise su horario");
                            }
                        //}
                    } 
                    

                }
            }

            if(sesion == null ){
                System.out.println("Usuario no registrado");
            }else if(sesion.comprobarPass(pass) == null){  
                System.out.println("Usuario no registrado");
            }
            
            System.out.println("\nContinuar S/N");
            next = sc.next();
            ClsUsuario usuarioVisita = new ClsUsuario();
            ClsAula aulaVisita = new ClsAula();
            for(int j = 0 ; j < 8 ; j ++){
                System.out.println("");
            }
            if(next.equals("S") || next.equals("s")){
                continuar = true;
            }else{
                continuar = false;
                for(int i = 0 ; i < contVisitas; i ++){
                    visitas[i].mostrarVst();
                    //System.out.println("idusr: "+visitas[i].getIdusr());
                    for(int j = 0 ; j < users.length ; j ++){
                        if(users[j].identificar(visitas[i].getIdusr()) != null){
                            usuarioVisita = users[j].identificar(visitas[i].getIdusr());
                            //System.out.println("usuario identificado"+usuarioVisita);
                        }
                    }
                    System.out.println("Usuario: "+usuarioVisita.getNombreusr());
                    //System.out.println("");
                    for(int j = 0 ; j < aulas.length ; j ++){
                        if(aulas[j].identificar(visitas[i].getIdaul()) != null){
                            aulaVisita = aulas[j].identificar(visitas[i].getIdaul());
                            //System.out.println("usuario identificado"+usuarioVisita);
                        }
                    }
                    System.out.println("Aula: "+aulaVisita.getNombreaul()+"Código: "+aulaVisita.getCodigoaul());
                    System.out.println("");
                }
            }
        };
        
        
        
        //us1.mostrarUsr();
        //au1.mostrarAul();
        
        //vs1.mostrarVst();
        
        
        
    }   
    
    
}
