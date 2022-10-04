import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
//        String s = "He is a very very good boy, isn't he?";
//        String s = "Hello, thanks for attempting this problem! " +
//                "Hope it will help you to learn java! Good luck and have a nice day!";
//        String s = ",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";

        String regex = "[ !,?._'@]+";

        splitString(s, regex);

        scan.close();
    }

    private static void splitString(String s, String regex) {
        String[] splited = (s.trim().split(regex));
        if (splited.length == 0 || splited[0].equals("") && splited.length == 1) {
            System.out.println("0");

        } else {
            if (splited[0].equals("")) {
                String[] splited2 = Arrays.copyOfRange(splited, 1, splited.length);
                System.out.println(splited.length);
                System.out.println(Arrays.toString(splited2));
                Stream.of(splited2).forEach(System.out::println);
            } else {
                System.out.println(splited.length);
                System.out.println(Arrays.toString(splited));
                Stream.of(splited).forEach(System.out::println);
            }
        }
    }
}
