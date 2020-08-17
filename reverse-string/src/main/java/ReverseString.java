class ReverseString {

    String reverse(String inputString) {
        String temp = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
          temp = temp + inputString.charAt(i);
        }
        return temp;
    }

}
