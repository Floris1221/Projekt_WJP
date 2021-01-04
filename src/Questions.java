import java.io.*;


public class Questions {

    FileReader fr;
    String [] tekst1;
    String [] tekst2;
    String [] tekst3;
    String [] tekst4;
    String [] tekst5;
    String [] tekst6;
    String [] tekst7;
    String [] tekst8;
    String [] tekst9;
    String [] tekst10;
    String [] tekst11;
    String [] tekst12;
    String [] tekst13;
    String [] tekst14;
    String [] tekst15;
    String [] tekst16;
    String [] tekst17;
    String [] tekst18;
    String [] tekst19;
    String [] tekst20;
    String [] tekst21;
    String [] tekst22;
    String [] tekst23;
    String [] tekst25;
    String [] tekst26;
    String [] tekst27;
    String [] tekst28;
    String [] tekst29;
    String [] tekst30;
    String [] tekst31;
    String [] tekst32;
    String [] tekst33;
    String [] tekst34;
    String [] tekst35;
    String [] tekst36;
    String[][] teksty = {tekst1,tekst2,tekst3,tekst4,tekst5,tekst6,tekst7,tekst8,tekst9,tekst10,tekst11,tekst12,tekst13,tekst14,tekst15,tekst16,tekst17,tekst18,tekst19,tekst20,tekst21,tekst22,tekst23,tekst25,tekst26,tekst27,tekst28,tekst29,tekst30,tekst31,tekst32,tekst33,tekst34,tekst35,tekst36};
    int i=0;




    Questions(){
        {
            try {
                String line;
                fr = new FileReader("Zadania.txt");
                BufferedReader br = new BufferedReader(fr);
                while((line=br.readLine()) != null){
                    teksty[i]= line.split("\\.");
                    i++;
                }

                br.close();
                fr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }//Questions kon

}
