package Main;

import java.awt.EventQueue;
import java.sql.SQLException;

import ar.unrn.tp3.bd.JdbcParticipante;
import ar.unrn.tp3.ui.UI;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				UI ui = new UI(new JdbcParticipante());
				ui.setupUIComponents();
			}
		});
	}
}
