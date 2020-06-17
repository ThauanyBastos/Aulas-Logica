/**
 * @author Thauany Azevedo Bastos
 * @version 1.0
 * @since 01/06/2020 - 08:10
 * @category Model
 */
public class Trimestre {
    
    private int mes;
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * @param Recebe o mês que o usuario nasceu 
     * @return Retorna o trimestre que o usuario nasceu
     */
     public String validarTrimestre() {
        switch(this.mes) {
            case 1: return "1 Trimestre";
            case 2: return "1 Trimestre";
            case 3: return "1 Trimestre";
            case 4: return "2 Trimestre";
            case 5: return "2 Trimestre";
            case 6: return "2 Trimestre";
            case 7: return "3 Trimestre";
            case 8: return "3 Trimestre";
            case 9: return "3 Trimestre";            
            case 10: return "4 Trimestre";
            case 11: return "4 Trimestre";
            case 12: return "4 Trimestre";            
            default: return "Mês inválido!";
        }
    }
    
    @Override
    public String toString() {
        return "Trimestre em que você nasceu: " + this.validarTrimestre();
    }
}