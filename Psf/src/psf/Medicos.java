/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psf;

/**
 *
 * @author 15385404608
 */
public class Medicos extends Funcionario implements Pessoa{ 
   
    private String crm; 
    /**
     

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }
}

