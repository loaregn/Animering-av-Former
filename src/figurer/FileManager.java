package figurer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class FileManager {

    public void saveToFile(ArrayList<Figurer> kon) {
        try {
            FileOutputStream  fileOut = new FileOutputStream ("savedFormer");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(kon);
            out.flush();
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Figurer> readFromFile() {
        ArrayList<Figurer> lista = null;
        try {
            FileInputStream fileIn = new FileInputStream("savedFormer");
            ObjectInputStream oin = new ObjectInputStream(fileIn);
            lista = (ArrayList<Figurer>) oin.readObject();
            oin.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        return lista;

    }

}
