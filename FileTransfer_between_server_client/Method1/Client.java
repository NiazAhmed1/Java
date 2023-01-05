//   -----------  GROUP MEMBERS ----------------


// NIAZ AHMED,            CMS ID: 301203.
// MUHAMMAD FAHAD,        CMS ID:  356324.


//Import librariws
import java.io.*;
import java.net.Socket;
import java.util.Scanner;


//Client Class
public class Client {

    //main function
    public static void main(String[] args){


        try {


            //socket connection
            Socket sckt = new Socket("localhost", 2590);

            //Create Objects of Different Streams
            InputStream Input_Stream = sckt.getInputStream();
            OutputStream Output_Stream  = sckt.getOutputStream();
            PrintWriter PW = new PrintWriter(Output_Stream);


            //Take File Location from Client
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Location For File ");
            String dirct = scanner.nextLine();
            Scanner sc = new Scanner(Input_Stream);

            //send file location to server
            PW.println(dirct);
            PW.flush();


            //determine the size of file
            String sizeStr = sc.nextLine();
            int size = Integer.parseInt(sizeStr);


            //if file size is less than zero then it means no file file is present
            if (size < 0) {
                System.out.println("Server: File is Not Found");
            }


            //otherwise send to client
            else {

                //accumulator
                int accum = 0;

                String FileSaveLocation = null;
                FileOutputStream fileOutputStream = null;
                DataInputStream dataInputStream = null;

                //Maximum numbers of bytes
                byte fileSize[] = new byte[88888888];


                System.out.println("Enter Location For save the requested File: ");

                //Take location from client for save the file
                FileSaveLocation = scanner.nextLine();

                //send file location to server
                fileOutputStream = new FileOutputStream(FileSaveLocation);


                //Initialize Data Input Stream Object
                dataInputStream = new DataInputStream(Input_Stream);


                while (true) {


                    int Nbytes = dataInputStream.read(fileSize, 0, 88888888);
                    fileOutputStream.write(fileSize, 0, Nbytes);
                    accum+= Nbytes;



                    //if all data is send then break
                    if (accum == size) {
                        break;}

                }

                //if file is send sucessfully then display a message
                System.out.println("File Sharing is Sucessfully Done");


                //Close Streams
                fileOutputStream.close();
                dataInputStream.close();
            }



           //If file is not present then show Exception
        } catch (FileNotFoundException e){
                System.out.println("404 Not Found: "+e);
        }catch (IOException e){
            System.out.println("Exception: "+e);
        }



    }
}