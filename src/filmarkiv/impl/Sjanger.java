package filmarkiv.impl;

public enum Sjanger {
	ACTION, SCIFI, COMEDY, DRAMA, ROMANCE;

	public static Sjanger finnSjanger(String navn) {
		for (Sjanger s : Sjanger.values()) {
			if (s.toString().equals(navn.toUpperCase())) {
				return s;
			}
		}
		return null;
	}

}
