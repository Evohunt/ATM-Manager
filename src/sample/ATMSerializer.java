package sample;

import java.io.*;

/**
 * Created by evohu on 7/20/2018.
 */
public class ATMSerializer implements Serializable {

    public ATMSerializer() {}

    public void serialize(Object object, String path) {

        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

        } catch(IOException ex) {
            // System.out.println("IOException is caught");
        }

    }

    public Object deserialize(String path) {

        Object object = new Object();

        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            object = in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        return object;

    }

}
