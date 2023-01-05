// ----------------------- GROUP MEMBERS ------------------------


// NIAZ AHMED           CMS ID : 301203.
// MUHAMMAD FAHAD       CMS ID:  356324.

// ---------------------------------------------------------------



// import libraries
import java.net.*;
import java.io.*;
import java.util.Scanner;


//Create client class
public class Client {


    //main Function
    public static void main(String[] args) throws IOException {

        //Establish Socket with host: Localhost and Port number 8988
        Socket s = new Socket("localhost", 8988);

        PrintWriter prnt = new PrintWriter(s.getOutputStream());

        //Take Requested file from user in input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name : ");
        String str = sc.nextLine();


        prnt.println(str);

        //flushes the remaining data
        prnt.flush();

  //  public static void receive_file_from_server(String requested_file) throws IOException {



        String requested_file =str;


        //Location at which client save the file
        String path="E:\\5th semester\\operating system\\Ass2_Task2\\ccc";
        File save_Location = new File(path +"\\"+ requested_file );


        //Total Number of Bytes that read
        int BR;

        //Current Bytes
        int current = 0;


        //set FileOutputStream
        FileOutputStream F_OutputStream = null;

        //set Buffer_OutputStream
        BufferedOutputStream B_OutputStream = null;


        //determine the size of file
        long FILE_SIZE = save_Location.length();

        //convert file size into bytes
        byte[] mybytearray = new byte[(int) FILE_SIZE];


        //returns the InputStream attached with this socket.
        InputStream is = s.getInputStream();


        F_OutputStream = new FileOutputStream(save_Location);


        //Buffer Output Stream
        B_OutputStream = new BufferedOutputStream(F_OutputStream);

        BR = is.read(mybytearray, 0, mybytearray.length);

        //Set current bytes
        current = BR;


        do {
            BR
                    = is.read(mybytearray, current, (mybytearray.length - current));
            if (BR >= 0) {
                current += BR;
            }
        } while (BR > -1);

        //Write file
        B_OutputStream.write(mybytearray, 0, current);


        //flushing the stream
        B_OutputStream.flush();

        //Display Message when File is sucessfully download
        System.out.println("File downloaded ");

    }
}//end