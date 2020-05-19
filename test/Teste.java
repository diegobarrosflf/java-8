package test;

import model.Usuario;

public class Teste {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Scorpion", 1000);
        Usuario user2 = new Usuario("SubZero", 850);
        Usuario user3 = new Usuario("Kabal", 950);
		List<User> users = Arrays.asList(u1, u2, u3);

		// forma tradicional de perocorrer uma coleção
		for (User u : users) {
			System.out.println(u.getName());
		}

		// novo método para todas as coleções, precisa de um Consumer<T>
		Mostrador m = new Mostrador();
		users.forEach(m);

		// outra forma de usar
		users.forEach(new Consumer<User>() {
			public void accept(User u) {
				System.out.println(u.getName());
			}
		});

		// usando o Lambda
		Consumer<User> c = (User u) -> {
			System.out.println(u.getName());
		};

		// Caso o bloco dentro de { } contenha apenas uma instrução, podemos omiti-lo e
		// remover também o ponto e vírgula:
		Consumer<User> c1 = u -> System.out.println(u.getName());

		// podemos ainda fazer
		users.forEach(u -> System.out.println(u.getScore()));

		users.forEach(u -> u.setModerator());

	}

}

class Mostrador implements Consumer<User> {
	public void accept(User u) {
		System.out.println(u.getName());
	}
}
