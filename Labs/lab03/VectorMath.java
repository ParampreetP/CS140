package lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VectorMath {

	// returns the magnitude of vector
	public static Optional<Double> magnitude(List<Double> vect) {

		if (vect == null) {
			return Optional.empty();
		} else if (vect.size() == 0) {
			return Optional.of(0.0);
		} else {
			double val = 0;
			for (Double i : vect) {
				val = (i * i) + val;
			}
			return Optional.of(Math.sqrt(val));
		}

	}

	// multiplies vect by some scalar value
	// actually modifies the vector, does not return a separate one
	public static void scalarProduct(List<Double> vect, double scale) {
		double sProduct = 0;

		if (vect == null) {
			return;
		}
		if (vect.isEmpty()) {
			return;
		}

		for (int i = 0; i < vect.size(); i++) {
			sProduct = vect.get(i) * scale;
			vect.set(i, sProduct);
		}
	}

	// returns the dotProduct between two vectors
	public static Optional<Double> dotProduct(List<Double> vect1, List<Double> vect2) {
		if (vect1 == null || vect2 == null) {
			return Optional.empty();
		} else if (vect1.size() == 0 || vect2.size() == 0) {
			return Optional.of((0.0));
		} else {
			double val = 0;
			for (int i = 0; i < vect1.size() && i < vect2.size(); i++) {
				val = (vect1.get(i) * vect2.get(i)) + val;
			}
			return Optional.of(val);
		}
	}

	// returns whether two vectors are orthogonal
	public static boolean isOrthogonal(List<Double> vect1, List<Double> vect2) {

		if (dotProduct(vect1, vect2).equals(Optional.empty())) {
			return false;
		}

		double j = 0;
		for (int i = 0; i < vect1.size() && i < vect2.size(); i++) {
			j += vect1.get(i) * vect2.get(i);
		}
		if (j == 0) {
			return true;
		} else {
			return false;
		}
	}

	// performs vector addition, returning a new vector
	public static Optional<List<Double>> vectorAddition(List<Double> vect1, List<Double> vect2) {
		double size = 0.0;
		double sum = 0.0;
		List<Double> addedVect = new ArrayList<>();
		
		if ((vect1 == null) || (vect2 == null))
		{
			return Optional.empty();
		}
		
		
		//copy vectors so original doesn't change
		List<Double> copyVect1 = new ArrayList<>(vect1.size());
		for (Double item : vect1){
			copyVect1.add(new Double(item));
		}
		List<Double> copyVect2 = new ArrayList<>(vect2.size());
		for (Double item : vect2){
			copyVect2.add(new Double(item));
		}
		
		
		//append 0's to smaller vector
		if (copyVect1.size() > copyVect2.size()){
			for(int i = copyVect2.size(); i < copyVect1.size(); i++){
				copyVect2.add(i, 0.0);
			}
		}
		if (copyVect1.size() < copyVect2.size()){
			for(int i = copyVect1.size(); i < copyVect2.size(); i++){
				copyVect1.add(i, 0.0);
			}
		}
		
		
		//add vectors
		for(int i = 0; i < copyVect1.size() && i < copyVect2.size(); i++){
				sum = copyVect1.get(i) + copyVect2.get(i);
				addedVect.add(i, sum);
		}
		return Optional.of(addedVect);
	}
}
