public class Hamming {
  int hamming_distance = 0;
    public Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() == rightStrand.length() ) {
        for (int i = 0; i < leftStrand.length(); i++) {
          if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
            hamming_distance += 1;
          }
        }
      } else {
        String message = (leftStrand.isEmpty() ) ? "left strand must not be empty." :
          (rightStrand.isEmpty() ) ? "right strand must not be empty." : "leftStrand and rightStrand must be of equal length.";
        throw new IllegalArgumentException(message);
      }
    }

    public int getHammingDistance() {
      return hamming_distance;
    }
}
