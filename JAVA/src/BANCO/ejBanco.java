package BANCO;

public class ejBanco {

	
		public class Cliente{
			private int id; 
			private int id_gestor;
			private String usuario; 
			private String password; 
			private String correo; 
			private String saldo;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public int getId_gestor() {
				return id_gestor;
			}
			public void setId_gestor(int id_gestor) {
				this.id_gestor = id_gestor;
			}
			public String getUsuario() {
				return usuario;
			}
			public void setUsuario(String usuario) {
				this.usuario = usuario;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getCorreo() {
				return correo;
			}
			public void setCorreo(String correo) {
				this.correo = correo;
			}
			public String getSaldo() {
				return saldo;
			}
			public void setSaldo(String saldo) {
				this.saldo = saldo;
			} 
		
		}
		public class Gestor{
			private int id; 
			private String usuario; 
			private String password;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getUsuario() {
				return usuario;
			}
			public void setUsuario(String usuario) {
				this.usuario = usuario;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			} 
			
		}
	}



