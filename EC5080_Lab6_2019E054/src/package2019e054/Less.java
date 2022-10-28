package package2019e054;

import java.io.IOException;
import java.nio.file.Path;
import static java.nio.file.Files.readString;

public class Less extends GenericCommand {
    public void handleCommand(String [] args) {

        if (!args[0].equals("less")) someThingWrong();

        if (args.length != 2) {
            System.out.println("Usage: prints the content of a text file");
            /*  $ less
                Usage: prints the content of a text file
            */

            return;
        }

        String data = "";
        try {
            data = readString(Path.of("C:\\Users\\anuka\\Desktop\\LAB\\Software construction\\L6\\EC5080_Lab6_2019E054\\Files\\" + args[1]));
        }catch (IOException e){
            System.out.println("File not found");
        }

        System.out.println(data);
    }
}

/*

    $ less Email1.txt
    From: Student one < anukamithara@gmail.com >
    Sent: Monday, September 26, 2022 4:28:38 PM
    To: Instructor one < instructor1@eng.jfn.ac.lk >
    Subject: Lab Reschedule
    Good morning, I?m writing this to request for a lab reschedule for EC5010. It is for lab01, ?Pattern matching with regular expressions?.
    Thank you

     */

    /*

    $ less Email3.txt
    From: Student three < student3@eng.jfn.ac.lk >
    Sent: Monday, September 26, 2022 4:28:38 PM
    To: Instructor three < instructor3@eng.jfn.ac.lk >
    Subject: Lab Reschedule
    Good morning, I?m writing this to request for a lab reschedule for EC5030. It is for lab03, ?Pattern matching with regular expressions?.
    Thank you

     */
