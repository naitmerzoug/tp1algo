import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadTextFile
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("ressources/formule-2-sat.txt"));
        String line;
        while ((line = in.readLine()) != null)
        {
            // Afficher le contenu du fichier
            System.out.println (line);
        }
        in.close();

    }
}