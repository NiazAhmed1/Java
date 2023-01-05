// -------------------------- GROUP MEMBERS ---------------------------------

// NIAZ AHMED           CMS ID : 301203.
// MUHAMMAD FAHAD         CMS ID:  356324.

// ---------------------------------------------------------------------------


//import Libraries


import java.io.*;
import java.net.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



//Server Class
public class Server {


    //main Function
    public static void main(String[] args) throws IOException {

        //Create object of ServerSocket with port Number 8988
        ServerSocket ser_sockt= new ServerSocket(8988);

        //Establish Connection between server and client
        Socket s = ser_sockt.accept();


        //returns the InputStream attached with this socket.
        InputStreamReader input_data = new InputStreamReader(s.getInputStream());


        //BfReader -> BufferReader object
        BufferedReader BfReader = new BufferedReader(input_data);

        //Data read from client ("File Name")
        String DATA_ = BfReader.readLine();


        // Print message for searching FIle
        System.out.println("Searching For   : " + DATA_ + ".....");


        //PrintWriter prnt = new PrintWriter(s.getOutputStream());
        String File_Name = DATA_;


        //path for server
        String path = "E:\\5th semester\\operating system\\Ass2_Task2\\song";


        //Set path for file
        File directoryPath = new File(path);

        File f = new File(path + "\\" + File_Name);

        //List of all files and directories
        String contents[] = directoryPath.list();


        for (int i = 0; i < contents.length; i++) {


            //Print All file present in the directory
            //System.out.println(contents[i]);


            //Condition If file is exists
            if (f.exists() && f.isFile()) {

                System.out.println(File_Name + " -> found");
                //send_file_to_client(File_Name);

                //set Input Stream
                FileInputStream F_InputStream = null;
                BufferedInputStream B_InputStream = null;

                //file that server send to client
                File FILE_TO_SEND = new File(path + "\\" + File_Name);

                //convert file into bytes
                byte[] mybytearray = new byte[(int) FILE_TO_SEND.length()];

                //set File and Buffer InputStream
                F_InputStream = new FileInputStream(FILE_TO_SEND);
                B_InputStream = new BufferedInputStream(F_InputStream);

                //Output Stream
                OutputStream os = null;

                //Read Data In Buffer InputStream
                B_InputStream.read(mybytearray, 0, mybytearray.length);

                //Get OutputStream in OS
                os = s.getOutputStream();

                //Display Message for sending
                System.out.println("Sending (" + File_Name+ " ) To client");

                //write file
                os.write(mybytearray, 0, mybytearray.length);

                //flush remaining data present in outputstream
                os.flush();

                break;

            }//end  if Condition

            //if file is not present then show Error (404 Not Found)
            else {

                //display error when file is not present in server
                System.out.println("404 Not Found");
                break;
            }
        }

        // prnt.flush();
        //close connection
        //prnt.close();

    }//end main method

}//end class



