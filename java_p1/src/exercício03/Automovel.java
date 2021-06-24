package exercício03;

public class Automovel {
	
	private String placa;
	private String cor;
	private int nrportas;
	private String combustivel;
	private long quilometragem;
	private String renavam;
	private String chassi;
	private int nrmarchas;
	private boolean ligado;
	private int velocidade;
	
	public Automovel() {
		
	}
	
	public Automovel(String placa, String cor, int nrportas, String combustivel, long quilometragem,
			String renavam, String chassi, int nrmarchas, boolean ligado, int velocidade) {
		
		this.placa = placa;
		this.cor = cor;
		this.nrportas = nrportas;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
		this.renavam = renavam;
		this.chassi = chassi;
		this.nrmarchas = nrmarchas;
		this.ligado = ligado;
		this.velocidade = velocidade;

	}
	
		void ligarDesligar(boolean ligaDesliga) {
			boolean ligar    = ligado = true;
			boolean Desligar = ligado = false;
		}
		
		public String getPlaca() {
			return placa;
		}
		
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public int getNrportas() {
			return nrportas;
		}
		
		public void setNrportas(int nrportas) {
			this.nrportas = nrportas;
		}
		
		public String getCombustivel() {
			return combustivel;
		}
		
		public void setCombustivel(String combustivel) {
			this.combustivel = combustivel;
		}
		
		public long getQuilometragem() {
			return quilometragem;
		}
		
		public void setQuilometragem(long quilometragem) {
			this.quilometragem = quilometragem;
		}
		
		public String getRenavam() {
			return renavam;
		}
		
		public void setRenavam(String renavam) {
			this.renavam = renavam;
		}
		
		public String getChassi() {
			return chassi;
		}
		
		public void setChassi(String chassi) {
			this.chassi = chassi;
		}
		
		public int getNrmarchas() {
			return nrmarchas;
		}
		
		public void setNrmarchas(int nrmarchas) {
			this.nrmarchas = nrmarchas;
		}
		
		public boolean isLigado() {
			return ligado;
		}
		
		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}
		
		public int getVelocidade() {
			return velocidade;
		}
		
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

}//fim Automovel
