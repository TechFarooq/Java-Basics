public class MoveZerosInNumber {
    public static void main(String[] args) {
        
        String input = "30603204560543044202";  

        StringBuilder nonZeroPart = new StringBuilder();
        int zeroCount = 0;

        for (char digit : input.toCharArray()) {
            if (digit == '0') {
                zeroCount++;
            } else {
                nonZeroPart.append(digit);
            }
        }
     
        for (int i = 0; i < zeroCount; i++) {
            nonZeroPart.append('0');
        }
        System.out.println("Output: " + nonZeroPart.toString());
    }
}