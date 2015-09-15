
package trabalhopoo2;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Andre
 */
public class programa {
    
    public static void main(String[] args) throws Exception {
        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:sqlite:Times.db";
        // create a connection source to our database
        ConnectionSource connectionSource =
            new JdbcConnectionSource(databaseUrl);

        // instantiate the dao
        Dao<Times, Integer> timesDao =
            DaoManager.createDao(connectionSource, Times.class);

        // if you need to create the 'accounts' table make this call
        TableUtils.createTableIfNotExists(connectionSource, Times.class);
        
        Times times = new Times();
        times.id = 1;
        times.nomeTime = "Vasco";
        
        
        timesDao.createOrUpdate(times);

        
        //Times timesBanco = timesDao.queryForId(10);
        //List<Pessoa> lista = pessoaDao.queryForEq("nome", "teste 10");
        List<Times> lista = timesDao.queryForAll();
        
        System.out.println(lista);
        
        connectionSource.close();
        
    }
    
}
