package view;

import java.util.HashMap;
import java.util.Scanner;

public class View {
    Scanner iscanner = new Scanner(System.in);
    public String getPath(){
        System.out.println("Введите/вставьте путь или имя файла.\nНапример: input.txt");
            return iscanner.nextLine();
    }

    public void printAmountOfWords(int amount){
        System.out.println("Количество слов на файле: "+amount);
    }

    public void printLongestWord(String word){
        System.out.println("Самое длинное слово в файле: "+word);
    }

    public void printFrequencyOfWords(HashMap map){
        System.out.println("Частота слов встречающейся на файле:");
        for (var item : map.entrySet()){
            System.out.println(item);
        }
    }

    public boolean inviteToLookMap(){
        System.out.println("Если желаете увидет частоту слов встречающейся на файле введите '1'\nИли любую другую букву или цифру чтобы пропустить:");
        if (iscanner.nextLine().equals("1")) return true;
        return false;
    }
    public void bye(){
        System.out.println("Программа завершён. Спасибо за использование.");
    }

    public boolean inviteToContinue(){
        System.out.println("Чтобы продолжить введите 'g', чтобы остановить введите любую другую букву или цифру:");
        if (iscanner.nextLine().equals("g")){
            return true;
        } else {
            bye();
            return false;
        }
    }
}
