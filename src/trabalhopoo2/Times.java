
package trabalhopoo2;

import com.j256.ormlite.field.DatabaseField;

/**
 *
 * @author Andre
 */
public class Times {
    
    @DatabaseField(id=true)
    public int id;
    @DatabaseField
    public String nomeTime;
    @DatabaseField
    public int golsFeitos;
    @DatabaseField
    public int golsSofridos;
    @DatabaseField
    public int saldoGols;
    @DatabaseField
    public int pontos;
    
    
   @Override
    public String toString() {
        return  id + " " + nomeTime;
    }
    
    
}
