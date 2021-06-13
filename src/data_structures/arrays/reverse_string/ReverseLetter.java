package data_structures.arrays.reverse_string;

public class ReverseLetter {
    public static void main(String[] args) {
        //This is my village: Input
        //sihT si ym egalliv: Output
        String input = "This is my Village";
        StringBuilder output = new StringBuilder();
        String[] test = input.split(" ");
        System.out.println(test[0]);
        for(String a: test){
            for(int i=a.length()-1; i>=0 ; i--){
                output.append(a.charAt(i));
            }
            output.append(" ");
        }
        System.out.println(output.toString());

    }
}
