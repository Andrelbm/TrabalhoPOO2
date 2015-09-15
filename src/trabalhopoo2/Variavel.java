/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhopoo2;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SERGIO
 */
public class Variavel {

    List<Jogadores> lista;
    
    public List<Jogadores> listaJoagadores(String nome_Time) throws SQLException, IOException{
        
        String databaseUrl = "jdbc:sqlite:Jogadores.db";
        // create a connection source to our database
        ConnectionSource connectionSource =
            new JdbcConnectionSource(databaseUrl);
        Dao<Jogadores, Integer> jogadoresDao =
            DaoManager.createDao(connectionSource, Jogadores.class);
         List<Jogadores> lista = jogadoresDao.queryForEq("time", nome_Time);
        //List<Jogadores> lista = jogadoresDao.queryForAll();
        
        connectionSource.close();
        return lista;
    }
    
    
}
