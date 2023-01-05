//   -----------  GROUP MEMBERS ----------------

// NIAZ AHMED,            CMS ID:  301203.
//MUHAMMAD FAHAD,         CMS ID:  356324.




//Import Libraries
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;



//Server Class
public class Server {


    //Main Method
    public static void main(String[] args) {
        try {


            ServerSocket SS = new ServerSocket(2590);

            // The accept() method of ServerSocket class is used to accept the incoming request to the socket.
            Socket socket = SS.accept();



            while (true) {


                //Create Objects of Different libraries
                InputStream Input_Stream = socket.getInputStream();
                OutputStream Output_Stream = socket.getOutputStream();
                PrintWriter PW = new PrintWriter(Output_Stream);
                Scanner sc = new Scanner(Input_Stream);


                String filename = sc.nextLine();


                //Read File in file variable
                File file = new File(filename);


                //check if a file exists then send to client
                if (file.exists() && file.isFile()) {

                    //determine the size of file
                    int size = (int) file.length();
                    PW.println(size);
                    PW.flush();


                    //if file contain some data then send it to client
                    if (size > 0) {

                        //Bytes contain by Files
                        byte Number_of_bytes[] = new byte[size];


                        //objects of File InputStream
                        FileInputStream F_InputStream = new FileInputStream(file);
                        DataInputStream D_InputStream = new DataInputStream(F_InputStream);


                        //read all bytes contain by File
                        D_InputStream.readFully(Number_of_bytes);
                        F_InputStream.close();



                        //write All bytes contain by file
                        DataOutputStream D_OutputStream = new DataOutputStream(Output_Stream);
                        D_OutputStream.write(Number_of_bytes);


                        //when file shairing is sucessfully done
                        System.out.println("File Has been Successfully Sent to the Client");
                    }

                } else {
                    PW.flush();
                }
            }




        //Exceptions
        }catch (SocketException e){
            System.out.println("Socket Exception: "+e);
        }catch (FileNotFoundException e){
            System.out.println("404 Not Found: "+e);
        }catch (IOException e){
            System.out.println("IO Exception: "+e);
        }
    }



}
