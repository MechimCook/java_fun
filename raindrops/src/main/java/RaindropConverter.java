class RaindropConverter {

    String convert(int number) {
        String PlingPlong = Pling(number);
        System.out.println(PlingPlong);
        return ( PlingPlong.isEmpty()) ? Integer.toString(number) : PlingPlong;
    }
    private String Pling(int number) {
        String pling = (number % 3 == 0) ? "Pling" : "";
        return Plang(number, pling);
    }
    private String Plang(int number, String pling) {
        String plang = (number % 5 == 0) ? "Plang" : "";
        return Plong(number, pling + plang);
    }

    private String Plong(int number, String plang) {
        String plong = (number % 7 == 0) ? "Plong" : "";
        return plang + plong;
    }

}
