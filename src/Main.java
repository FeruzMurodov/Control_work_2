import controller.Controller;
import model.Model;
import view.View;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        boolean switcher = true;
        while (switcher){
            Controller c1 = new Controller(new Model(), new View());
            try {
                c1.start();
            } catch (IOException e) {
                System.out.println("Файл не найден!");
            }
            switcher = c1.getBoolean();
        }
    }
}