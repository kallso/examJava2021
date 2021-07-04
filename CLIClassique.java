public class CLIClassique {

	public static Configuration configuration(String... args) {
		Configuration config = new Configuration();
		boolean finOptions = false;
		int i = 0;
		while (i < args.length && ! finOptions) {
			String arg = args[i];
			switch (arg) {
				case "-K": // Valeur de l'indice à calculer
					try {
						config.setIndice(Integer.parseInt(args[++i]));
					} catch (NumberFormatException e) {
						System.out.println("L'indice doit etre un entier");
						e.printStackTrace();
					}
					break;
				case "-E": // Valeur de la précision à atteindre
					try {
						config.setEpsilon(Double.parseDouble(args[++i]));
					} catch (NumberFormatException e) {
						System.out.println("L'epsilon doit etre un decimal");
						e.printStackTrace();
					}
					break;
				case "-A": // Valeur de alpha
					try {
						config.setAlpha(Double.parseDouble(args[++i]));
					} catch (NumberFormatException e) {
						System.out.println("L'alpha doit etre un decimal");
						e.printStackTrace();
					}
					break;
				case "-C": // Mode matrice creuse
					config.setMode(Mode.CREUSE);
					break;
				case "-P": // Mode matrice pleine
					config.setMode(Mode.PLEINE);
					break;
				default:
					finOptions = arg.length() == 0 || arg.charAt(0) != '-';
					if (! finOptions) {
						System.out.println("Option inconnue : " + arg);
					}
			}
			i++;
		}
		return config;
	}

	public static void main(String[] args) {
		System.out.println(configuration(args));
	}
}

