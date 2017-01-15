package in.aviaryan;

import java.util.Random;

public class JokeManager {
    private String [] jokes = {"sad", "sadass", "old pie"};
    private Random random;

    public JokeManager(String variant){
        // may do something here
        random = new Random();
    }

    private int getJokeCount(){
        return jokes.length;
    }

    public String getJoke(int pos){
        return jokes[pos];
    }

    public String getRandomJoke(){
        return jokes[random.nextInt(getJokeCount())];
    }
}
