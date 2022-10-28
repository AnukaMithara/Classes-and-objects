package package2019e054;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.readString;
import static java.nio.file.Files.writeString;

public class Copy extends GenericCommand {

    public void handleCommand(String [] args) {

        if (!args[0].equals("copy")) someThingWrong();

        if (args.length != 3) {
            System.out.println("Usage: copy <source> <destination>");
            /*  $ copy
                Usage: copy <source> <destination>
            */

            return;
        }
        String data = null;
    try {
        data = readString(Path.of("C:\\Users\\anuka\\Desktop\\LAB\\Software construction\\L6\\EC5080_Lab6_2019E054\\Files\\"  + args[1]));
    }catch (IOException e){
        System.out.println("File not found");
    }

    try {
        if(data != null) {
            writeString(Path.of("C:\\Users\\anuka\\Desktop\\LAB\\Software construction\\L6\\EC5080_Lab6_2019E054\\Files\\" + args[2]), data);
            System.out.println("File copied successfully");
        }
    }catch (IOException e){
        System.out.println("File not copied correctly");
    }
    }
    }

    /*
     @$ copy Email2.txt CopyOfEmail2.txt
     File copied successfully
     */

    /*
    $ copy Emai3.txt CopyOfEmail3.txt
    File not found
     */