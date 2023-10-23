import com.padroes.prototype.Endereco;
import com.padroes.prototype.Pessoa;

public class Principal {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pessoa objJoao = new Pessoa();
		objJoao.setNome("joao");
		objJoao.setEndereco(new Endereco("rua 1"));
		Pessoa clone = (Pessoa) objJoao.clone();
		clone.setNome("Joaquim");
		System.out.println(objJoao.getNome());
		System.out.println(clone.getNome());
	}
}
