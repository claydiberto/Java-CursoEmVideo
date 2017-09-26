package aula04;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String dono;
	private double saldo;
	private boolean status;

	// Metodo Construtor
	public Conta() {
		// Criar conta no banco e seta como inativa
		setStatus(false);
	}
	
	// Metodos do classe
	public void abrirConta(int num, String dono, String tipo) {
		setNumConta(num);
		setDono(dono);
		setTipoConta(tipo);
		setSaldo(0);
		setStatus(true);
		// Deposita 50 se a conta for Conta Corrente
		if (getTipoConta().equalsIgnoreCase("cc")) {
			depositar(50);
		// Deposita 150 se a conta for Conta Poupanca
		} else {
			depositar(150);
		}
	}
	
	public boolean fecharConta() {
		// Verifica se a conta está aberta e tem saldo igual a 0 "zero
		if (status && saldo == 0) {
			setStatus(false);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		// Verifica sa a conta esta aberta
		if (status) {
			double novoSaldo = getSaldo() + valor;
			setSaldo(novoSaldo);
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean sacar(double valor) {
		// Verifica sa a conta esta aberta
		if (status) {
			double novoSaldo = getSaldo() - valor;
			setSaldo(novoSaldo);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pagarMensalidade() {
		if (tipoConta == "cc") {
			sacar(20);
			return true;
		} else {
			sacar(12);
			return false;
		}
	}
	

	// Metodos Getters & Setters
	public int getNumConta() {
		System.out.println("certo");
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;  
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
