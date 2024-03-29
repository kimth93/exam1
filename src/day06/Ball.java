package day06;

public class Ball {
	
	int number;
	
	public Ball(int number) {
		this.number = number;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
