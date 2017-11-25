package aula14;

public class projetoYoutube {

	public static void main(String[] args) {
		// Criando 3 Videos
		Video v[] = new Video[3];
		v[0] = new Video("PHP - aula 10");
		v[1] = new Video("Java - aula 3");
		v[2] = new Video("HTML5 - aula 20");
		
		// Criando 2 Gafanhotos
		Gafanhoto g[] = new Gafanhoto[2]; 
		g[0] = new Gafanhoto("Antonio", 25, "M", "ant");
		g[1] = new Gafanhoto("Maria", 16, "F", "mariab");
		
		// Assistindo videos
		Visualizacao view[] = new Visualizacao[5];
		view[0] = new Visualizacao(g[0], v[1]);
		view[0].avaliar();
		view[1] = new Visualizacao(g[0], v[2]);
		v[2].like();
		g[0].ganhaExp();
		view[2] = new Visualizacao(g[0], v[0]);
		view[2].avaliar(4f);
		view[3] = new Visualizacao(g[1], v[0]);
		view[3].avaliar(8f);
		view[3].getFilme().like();
		view[4] = new Visualizacao(g[1], v[2]);
		view[4].avaliar(80);
		v[2].like();
		v[2].pause();
		
		// Visualizar resultados
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
	}
}