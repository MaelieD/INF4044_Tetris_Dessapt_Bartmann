package fr.esiea.architecture.tetrisVisualData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Player{

    int score;
    String nameFile = "score.txt";
    ArrayList<Score> listeScore;
    private String name;


    public Player(String name){
        score = 0;
        this.name=name;
        listeScore = new ArrayList<Score>();
        getScoreInFile();
    }

    public String getName(){
        return this.name;
    }
    public void updateScore(int score){
        this.score = score;
        System.out.println("name :" + name);
    }
    public int getScore(){
        return this.score;
    }

    private void getScoreInFile(){

        String[] splitString;
        System.out.println("open file");

        try
        {
            File file = new File (nameFile);
            FileReader fileReader = new FileReader (file);
            BufferedReader bufferReader = new BufferedReader (fileReader);

            try
            {
                String line = bufferReader.readLine();

                while (line != null)
                {

                    splitString = line.split(" ");
                    Score score = new Score(splitString[0], splitString[1]);
                    listeScore.add(score);
                    line = bufferReader.readLine();
                }

                bufferReader.close();
                fileReader.close();
            }
            catch (IOException exception)
            {
                System.out.println (exception.getMessage());
            }
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("File Not Found");
        }
        System.out.println("done");
    }

    public void saveScore(){

        //	Iterator<Score> score = listeScore.iterator();

        for(Score score : listeScore){
            if(Integer.parseInt(score.getScore()) <= this.score){
                score.update(this.name, Integer.toString(this.score));
                break;
            }
        }
        saveScoreInFile();

    }

    // Design Pattern ITERATOR
    private void saveScoreInFile() {
        File file = new File (nameFile);
        Iterator<Score> score = listeScore.iterator();
        try
        {
            FileWriter fileWriter = new FileWriter (file);

            while(score.hasNext()){
                fileWriter.write (score.next().saveScore());
            }

            fileWriter.close();
        }
        catch (IOException exception)
        {
            System.out.println (exception.getMessage());
        }

    }
}
