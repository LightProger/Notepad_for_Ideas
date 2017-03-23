package javarash;

/*
Блокнот для новых идей
1. В классе Solution создать public статический класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран
описание идеи — это то, что возвращает метод getDescription
*/

public class Solution {

    public static class Idea{

        //Метод реализует и возвращает текст записанный в переменную idea
        public String getDescription(){
            String idea = "Есть идея: Стать крутым Java - разработчиком!";
            return idea;
        }
    }

    public static void main(String[] args) {

        // Обращение к методу печати, который берет данные в классе Idea
        printIdea(new Idea());
    }

    // Метод вывода на экран данных, возвращенных методом getDescription()
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
