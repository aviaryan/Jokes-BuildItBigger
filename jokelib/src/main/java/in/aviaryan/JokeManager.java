package in.aviaryan;

import java.util.Random;

public class JokeManager {
    // Source
    // http://www.funny.com/cgi-bin/WebObjects/Funny.woa/wa/funny?fn=CI3NJ
    private String [] jokes = {
            "Why do Farts stink? A: So that Deaf people can enjoy them too.",
            "What do you call a Fish without an eye? A: A 'Fsh'!",
            "Why did the Hedgehog cross the road? A: To see his Flat Mate.",
            "Why does it take 1 million sperm to fertilize one egg? A: They won't stop to ask directions.",
            "What's the difference between Big Foot and an intelligent man? A: Big Foot's been spotted several times.",
            "Why did the monkey put a piece of steak on his head? A. He thought he was a griller.",
            "What do you call a deer with no eyes? A. No eye deer.",
            "Why was six afraid of seven? A. Because seven eight nine",
            "Why did the dinosaur walk across the road? A. Because chickens were not invented yet.",
            "What has four wheels and flies? A. A rubbish truck.",
            "When were vowels invented? A. When u and i were born.",
            "When is it a good time to eat a window? A. When it's jammed."
    };

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
