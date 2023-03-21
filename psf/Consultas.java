
package psf;

/**
 *
 * @author 15385404608
 */
public class Consultas {
   private Paciente objPaciente; 
   private Medicos objMedico;
   private String dataEntrada;
   private static int qtdConsulta =0;

    public static int getQtdConsulta() {
        return qtdConsulta;
    }

    public static void setQtdConsulta(int qtdConsulta) {
        Consultas.qtdConsulta = qtdConsulta;
    }

    /**
     * @return the objPaciente
     */
    public Paciente getObjPaciente() {
        return objPaciente;
    }

    /**
     * @param objPaciente the objPaciente to set
     */
    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    /**
     * @return the objMedico
     */
    public Medicos getObjMedico() {
        return objMedico;
    }

    /**
     * @param objMedico the objMedico to set
     */
    public void setObjMedico(Medicos objMedico) {
        this.objMedico = objMedico;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    
   
    
}

