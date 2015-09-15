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
public class CadastroJoga {

    public static void main(String[] args) throws Exception {
        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:sqlite:Jogadores.db";
        // create a connection source to our database
        ConnectionSource connectionSource
                = new JdbcConnectionSource(databaseUrl);

        // instantiate the dao
        Dao<Jogadores, Integer> jogadoresDao
                = DaoManager.createDao(connectionSource, Jogadores.class);

        // if you need to create the 'accounts' table make this call
        TableUtils.createTableIfNotExists(connectionSource, Jogadores.class);

        Jogadores jogadores1 = new Jogadores();
        jogadores1.id = 1;
        jogadores1.nomeJogador = "Roberto";
        jogadores1.time = "Atletico Goianiense";
        jogadores1.condicionamentoFisico = 100;
        jogadores1.força = 16;
        jogadores1.formaFisica = jogadores1.condicionamentoFisico * jogadores1.força;

        jogadoresDao.createOrUpdate(jogadores1);

        Jogadores jogadores2 = new Jogadores();
        jogadores2.id = 2;
        jogadores2.nomeJogador = "Marcio";
        jogadores2.time = "Atletico Goianiense";
        jogadores2.condicionamentoFisico = 100;
        jogadores2.força = 23;
        jogadores2.formaFisica = jogadores2.condicionamentoFisico * jogadores2.força;

        jogadoresDao.createOrUpdate(jogadores2);

        Jogadores jogadores3 = new Jogadores();
        jogadores3.id = 3;
        jogadores3.nomeJogador = "Murilo";
        jogadores3.time = "Atletico Goianiense";
        jogadores3.condicionamentoFisico = 100;
        jogadores3.força = 22;
        jogadores3.formaFisica = jogadores3.condicionamentoFisico * jogadores3.força;

        jogadoresDao.createOrUpdate(jogadores3);

        Jogadores jogadores4 = new Jogadores();
        jogadores4.id = 4;
        jogadores4.nomeJogador = "Elbis";
        jogadores4.time = "Atletico Goianiense";
        jogadores4.condicionamentoFisico = 100;
        jogadores4.força = 22;
        jogadores4.formaFisica = jogadores4.condicionamentoFisico * jogadores4.força;

        jogadoresDao.createOrUpdate(jogadores4);

        Jogadores jogadores5 = new Jogadores();
        jogadores5.id = 5;
        jogadores5.nomeJogador = "Dyego";
        jogadores5.time = "Atletico Goianiense";
        jogadores5.condicionamentoFisico = 100;
        jogadores5.força = 14;
        jogadores5.formaFisica = jogadores5.condicionamentoFisico * jogadores5.força;

        jogadoresDao.createOrUpdate(jogadores5);

        Jogadores jogadores6 = new Jogadores();
        jogadores6.id = 6;
        jogadores6.nomeJogador = "Davi";
        jogadores6.time = "Atletico Goianiense";
        jogadores6.condicionamentoFisico = 100;
        jogadores6.força = 16;
        jogadores6.formaFisica = jogadores6.condicionamentoFisico * jogadores6.força;

        jogadoresDao.createOrUpdate(jogadores6);

        Jogadores jogadores7 = new Jogadores();
        jogadores7.id = 7;
        jogadores7.nomeJogador = "Mateus Alonso";
        jogadores7.time = "Atletico Goianiense";
        jogadores7.condicionamentoFisico = 100;
        jogadores7.força = 23;
        jogadores7.formaFisica = jogadores7.condicionamentoFisico * jogadores7.força;

        jogadoresDao.createOrUpdate(jogadores7);

        Jogadores jogadores8 = new Jogadores();
        jogadores8.id = 8;
        jogadores8.nomeJogador = "Lino";
        jogadores8.time = "Atletico Goianiense";
        jogadores8.condicionamentoFisico = 100;
        jogadores8.força = 24;
        jogadores8.formaFisica = jogadores8.condicionamentoFisico * jogadores8.força;

        jogadoresDao.createOrUpdate(jogadores8);

        Jogadores jogadores9 = new Jogadores();
        jogadores9.id = 9;
        jogadores9.nomeJogador = "Victor Cesár";
        jogadores9.time = "Atletico Goianiense";
        jogadores9.condicionamentoFisico = 100;
        jogadores9.força = 15;
        jogadores9.formaFisica = jogadores9.condicionamentoFisico * jogadores9.força;

        jogadoresDao.createOrUpdate(jogadores9);

        Jogadores jogadores10 = new Jogadores();
        jogadores10.id = 10;
        jogadores10.nomeJogador = "Pedro Bambu";
        jogadores10.time = "Atletico Goianiense";
        jogadores10.condicionamentoFisico = 100;
        jogadores10.força = 23;
        jogadores10.formaFisica = jogadores10.condicionamentoFisico * jogadores10.força;

        jogadoresDao.createOrUpdate(jogadores10);

        Jogadores jogadores11 = new Jogadores();
        jogadores11.id = 11;
        jogadores11.nomeJogador = "Marcus Vinicius";
        jogadores11.time = "Atletico Goianiense";
        jogadores11.condicionamentoFisico = 100;
        jogadores11.força = 24;
        jogadores11.formaFisica = jogadores11.condicionamentoFisico * jogadores11.força;

        jogadoresDao.createOrUpdate(jogadores11);

        Jogadores jogadores12 = new Jogadores();
        jogadores12.id = 12;
        jogadores12.nomeJogador = "Luiz Fernando";
        jogadores12.time = "Atletico Goianiense";
        jogadores12.condicionamentoFisico = 100;
        jogadores12.força = 16;
        jogadores12.formaFisica = jogadores12.condicionamentoFisico * jogadores12.força;

        jogadoresDao.createOrUpdate(jogadores12);

        Jogadores jogadores13 = new Jogadores();
        jogadores13.id = 13;
        jogadores13.nomeJogador = "Felipe Ferreira";
        jogadores13.time = "Atletico Goianiense";
        jogadores13.condicionamentoFisico = 100;
        jogadores13.força = 16;
        jogadores13.formaFisica = jogadores13.condicionamentoFisico * jogadores13.força;

        jogadoresDao.createOrUpdate(jogadores13);

        Jogadores jogadores14 = new Jogadores();
        jogadores14.id = 14;
        jogadores14.nomeJogador = "Luisinho";
        jogadores14.time = "Atletico Goianiense";
        jogadores14.condicionamentoFisico = 100;
        jogadores14.força = 23;
        jogadores14.formaFisica = jogadores14.condicionamentoFisico * jogadores14.força;

        jogadoresDao.createOrUpdate(jogadores14);

        Jogadores jogadores15 = new Jogadores();
        jogadores15.id = 15;
        jogadores15.nomeJogador = "Thiago Primão";
        jogadores15.time = "Atletico Goianiense";
        jogadores15.condicionamentoFisico = 100;
        jogadores15.força = 25;
        jogadores15.formaFisica = jogadores15.condicionamentoFisico * jogadores15.força;

        jogadoresDao.createOrUpdate(jogadores15);

        Jogadores jogadores16 = new Jogadores();
        jogadores16.id = 16;
        jogadores16.nomeJogador = "Juninho";
        jogadores16.time = "Atletico Goianiense";
        jogadores16.condicionamentoFisico = 100;
        jogadores16.força = 15;
        jogadores16.formaFisica = jogadores16.condicionamentoFisico * jogadores16.força;

        jogadoresDao.createOrUpdate(jogadores16);

        Jogadores jogadores17 = new Jogadores();
        jogadores17.id = 17;
        jogadores17.nomeJogador = "Sandes Neto";
        jogadores17.time = "Atletico Goianiense";
        jogadores17.condicionamentoFisico = 100;
        jogadores17.força = 15;
        jogadores17.formaFisica = jogadores17.condicionamentoFisico * jogadores17.força;

        jogadoresDao.createOrUpdate(jogadores17);

        Jogadores jogadores18 = new Jogadores();
        jogadores18.id = 18;
        jogadores18.nomeJogador = "Yago";
        jogadores18.time = "Atletico Goianiense";
        jogadores18.condicionamentoFisico = 100;
        jogadores18.força = 23;
        jogadores18.formaFisica = jogadores18.condicionamentoFisico * jogadores18.força;

        jogadoresDao.createOrUpdate(jogadores18);

        Jogadores jogadores19 = new Jogadores();
        jogadores19.id = 19;
        jogadores19.nomeJogador = "Rafinha";
        jogadores19.time = "Atletico Goianiense";
        jogadores19.condicionamentoFisico = 100;
        jogadores19.força = 24;
        jogadores19.formaFisica = jogadores19.condicionamentoFisico * jogadores19.força;

        jogadoresDao.createOrUpdate(jogadores19);

        Jogadores jogadores20 = new Jogadores();
        jogadores20.id = 20;
        jogadores20.nomeJogador = "Rerysson";
        jogadores20.time = "Macaé";
        jogadores20.condicionamentoFisico = 100;
        jogadores20.força = 12;
        jogadores20.formaFisica = jogadores20.condicionamentoFisico * jogadores20.força;

        jogadoresDao.createOrUpdate(jogadores20);

        Jogadores jogadores21 = new Jogadores();
        jogadores21.id = 21;
        jogadores21.nomeJogador = "Fernando";
        jogadores21.time = "Macaé";
        jogadores21.condicionamentoFisico = 100;
        jogadores21.força = 14;
        jogadores21.formaFisica = jogadores21.condicionamentoFisico * jogadores21.força;

        jogadoresDao.createOrUpdate(jogadores21);

        Jogadores jogadores22 = new Jogadores();
        jogadores22.id = 22;
        jogadores22.nomeJogador = "Ricardo Berna";
        jogadores22.time = "Macaé";
        jogadores22.condicionamentoFisico = 100;
        jogadores22.força = 23;
        jogadores22.formaFisica = jogadores22.condicionamentoFisico * jogadores22.força;

        jogadoresDao.createOrUpdate(jogadores22);

        Jogadores jogadores23 = new Jogadores();
        jogadores23.id = 23;
        jogadores23.nomeJogador = "Bruno Santos";
        jogadores23.time = "Macaé";
        jogadores23.condicionamentoFisico = 100;
        jogadores23.força = 22;
        jogadores23.formaFisica = jogadores23.condicionamentoFisico * jogadores23.força;

        jogadoresDao.createOrUpdate(jogadores23);

        Jogadores jogadores24 = new Jogadores();
        jogadores24.id = 24;
        jogadores24.nomeJogador = "Diego";
        jogadores24.time = "Macaé";
        jogadores24.condicionamentoFisico = 100;
        jogadores24.força = 20;
        jogadores24.formaFisica = jogadores24.condicionamentoFisico * jogadores24.força;

        jogadoresDao.createOrUpdate(jogadores24);

        Jogadores jogadores25 = new Jogadores();
        jogadores25.id = 25;
        jogadores25.nomeJogador = "Max";
        jogadores25.time = "Macaé";
        jogadores25.condicionamentoFisico = 100;
        jogadores25.força = 22;
        jogadores25.formaFisica = jogadores25.condicionamentoFisico * jogadores25.força;

        jogadoresDao.createOrUpdate(jogadores25);

        Jogadores jogadores26 = new Jogadores();
        jogadores26.id = 26;
        jogadores26.nomeJogador = "Leandro";
        jogadores26.time = "Macaé";
        jogadores26.condicionamentoFisico = 100;
        jogadores26.força = 12;
        jogadores26.formaFisica = jogadores26.condicionamentoFisico * jogadores26.força;

        jogadoresDao.createOrUpdate(jogadores26);

        Jogadores jogadores27 = new Jogadores();
        jogadores27.id = 27;
        jogadores27.nomeJogador = "Douglas";
        jogadores27.time = "Macaé";
        jogadores27.condicionamentoFisico = 100;
        jogadores27.força = 14;
        jogadores27.formaFisica = jogadores27.condicionamentoFisico * jogadores27.força;

        jogadoresDao.createOrUpdate(jogadores27);

        Jogadores jogadores28 = new Jogadores();
        jogadores28.id = 28;
        jogadores28.nomeJogador = "Filipe";
        jogadores28.time = "Macaé";
        jogadores28.condicionamentoFisico = 100;
        jogadores28.força = 21;
        jogadores28.formaFisica = jogadores28.condicionamentoFisico * jogadores28.força;

        jogadoresDao.createOrUpdate(jogadores28);

        Jogadores jogadores29 = new Jogadores();
        jogadores29.id = 29;
        jogadores29.nomeJogador = "Binner";
        jogadores29.time = "Macaé";
        jogadores29.condicionamentoFisico = 100;
        jogadores29.força = 22;
        jogadores29.formaFisica = jogadores29.condicionamentoFisico * jogadores29.força;

        jogadoresDao.createOrUpdate(jogadores29);

        Jogadores jogadores30 = new Jogadores();
        jogadores30.id = 30;
        jogadores30.nomeJogador = "Juninho";
        jogadores30.time = "Macaé";
        jogadores30.condicionamentoFisico = 100;
        jogadores30.força = 12;
        jogadores30.formaFisica = jogadores30.condicionamentoFisico * jogadores30.força;

        jogadoresDao.createOrUpdate(jogadores30);

        Jogadores jogadores31 = new Jogadores();
        jogadores31.id = 31;
        jogadores31.nomeJogador = "Marcus Vinicius";
        jogadores31.time = "Macaé";
        jogadores31.condicionamentoFisico = 100;
        jogadores31.força = 21;
        jogadores31.formaFisica = jogadores31.condicionamentoFisico * jogadores31.força;

        jogadoresDao.createOrUpdate(jogadores31);

        Jogadores jogadores32 = new Jogadores();
        jogadores32.id = 32;
        jogadores32.nomeJogador = "Aloísio";
        jogadores32.time = "Macaé";
        jogadores32.condicionamentoFisico = 100;
        jogadores32.força = 22;
        jogadores32.formaFisica = jogadores32.condicionamentoFisico * jogadores32.força;

        jogadoresDao.createOrUpdate(jogadores32);

        Jogadores jogadores33 = new Jogadores();
        jogadores33.id = 33;
        jogadores33.nomeJogador = "Santos";
        jogadores33.time = "Macaé";
        jogadores33.condicionamentoFisico = 100;
        jogadores33.força = 22;
        jogadores33.formaFisica = jogadores33.condicionamentoFisico * jogadores33.força;

        jogadoresDao.createOrUpdate(jogadores33);

        Jogadores jogadores34 = new Jogadores();
        jogadores34.id = 34;
        jogadores34.nomeJogador = "Alisson";
        jogadores34.time = "Macaé";
        jogadores34.condicionamentoFisico = 100;
        jogadores34.força = 23;
        jogadores34.formaFisica = jogadores34.condicionamentoFisico * jogadores34.força;

        jogadoresDao.createOrUpdate(jogadores34);

        Jogadores jogadores35 = new Jogadores();
        jogadores35.id = 35;
        jogadores35.nomeJogador = "Marquinho";
        jogadores35.time = "Macaé";
        jogadores35.condicionamentoFisico = 100;
        jogadores35.força = 25;
        jogadores35.formaFisica = jogadores35.condicionamentoFisico * jogadores35.força;

        jogadoresDao.createOrUpdate(jogadores35);

        Jogadores jogadores36 = new Jogadores();
        jogadores36.id = 36;
        jogadores36.nomeJogador = "Pipico";
        jogadores36.time = "Macaé";
        jogadores36.condicionamentoFisico = 100;
        jogadores36.força = 22;
        jogadores36.formaFisica = jogadores36.condicionamentoFisico * jogadores36.força;

        jogadoresDao.createOrUpdate(jogadores36);

        Jogadores jogadores37 = new Jogadores();
        jogadores37.id = 37;
        jogadores37.nomeJogador = "Pedro";
        jogadores37.time = "Macaé";
        jogadores37.condicionamentoFisico = 100;
        jogadores37.força = 15;
        jogadores37.formaFisica = jogadores37.condicionamentoFisico * jogadores37.força;

        jogadoresDao.createOrUpdate(jogadores37);

        Jogadores jogadores38 = new Jogadores();
        jogadores38.id = 38;
        jogadores38.nomeJogador = "Eberson";
        jogadores38.time = "Macaé";
        jogadores38.condicionamentoFisico = 100;
        jogadores38.força = 14;
        jogadores38.formaFisica = jogadores38.condicionamentoFisico * jogadores38.força;

        jogadoresDao.createOrUpdate(jogadores38);

        //Times timesBanco = timesDao.queryForId(10);
        List<Jogadores> lista = jogadoresDao.queryForEq("time", "Atletico Goianiense");
        //List<Jogadores> lista = jogadoresDao.queryForAll();

        System.out.println(lista);

        connectionSource.close();

    }

}
