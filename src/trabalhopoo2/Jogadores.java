
package trabalhopoo2;

import com.j256.ormlite.field.DatabaseField;

/**
 *
 * @author Andre
 */
public class Jogadores {
    
    @DatabaseField(id=true)
    public int id;
    @DatabaseField
    public String nomeJogador;
    @DatabaseField
    public String time;
    @DatabaseField
    public int força;
    @DatabaseField
    public int condicionamentoFisico;
    @DatabaseField
    public int formaFisica;
    
    
    @Override
    public String toString() {
        return  id + " " + nomeJogador + " "+ time+ " "+ força+ " "+ 
                condicionamentoFisico+ " "+ formaFisica;
    }
    
}
