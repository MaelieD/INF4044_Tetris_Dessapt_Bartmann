package fr.esiea.architecture.tetrisVisualData;

public class Score {

    String name;
    String score;

    public Score(String name, String score){
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void update(String name, String score){
        this.name = name;
        this.score =score;
    }
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String saveScore(){
        return name + " " + score + "\n";
    }


}