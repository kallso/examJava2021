import java.util.Objects;

public class Configuration {
	private double alpha = 0.85;
	private double epsilon = -1.0;
	private int indice = 150;
	private Mode mode = Mode.CREUSE;

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(double epsilon) {
		this.epsilon = epsilon;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Configuration that = (Configuration) o;
		return Double.compare(that.alpha, alpha) == 0 && Double.compare(that.epsilon, epsilon) == 0 && indice == that.indice && mode == that.mode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alpha, epsilon, indice, mode);
	}
}
