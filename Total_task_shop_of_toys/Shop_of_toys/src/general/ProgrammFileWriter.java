package general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static general.Vars.myFileName;

import model.Toys;

public class ProgrammFileWriter {

  public static void writeToy(Toys winnerToy) {
    String result_string = winnerToy.getId() + System.lineSeparator() +
        winnerToy.getName() + System.lineSeparator() +
        winnerToy.getQuantity() + System.lineSeparator() +
        winnerToy.getWeight() + System.lineSeparator();

    try {
      File myTxt = new File(myFileName);
      FileWriter fr = new FileWriter(myTxt);
      BufferedWriter br = new BufferedWriter(fr);

      br.write(result_string);
      br.close();
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
