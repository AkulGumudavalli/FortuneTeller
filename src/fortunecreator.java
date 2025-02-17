import java.util.ArrayList;
import java.util.Random;

public class fortunecreator {
    ArrayList<String> fortunes = new ArrayList<>();
    int previousPick = 0;
    Random random = new Random();
    public fortunecreator(ArrayList<String> fortunes){
        this.fortunes = fortunes;
    }
    public String fortune(){
        int randomInt = 0;
        while(randomInt == previousPick){
            randomInt = random.nextInt(0,fortunes.size());
        }
        return fortunes.get(randomInt);
    }
}
