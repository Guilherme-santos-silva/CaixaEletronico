/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author manuel
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacoes op = new Operacoes("guilherme", 100);
        op.getestrato();
        System.out.println(op.getSaldo());
    }
    
}
