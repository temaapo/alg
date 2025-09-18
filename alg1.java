import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        // Создание ArrayList (динамического массива)
        List<Integer> myList = new ArrayList<>();
        myList.add(1);  // Добавление элемента
        myList.add(2);  // Добавление элемента
        myList.add(3);  // Добавление элемента
        myList.add(4);  // Добавление элемента
        myList.add(5);  // Добавление элемента
        
        // Добавление элемента в конец списка
        myList.add(6);
        
        // Удаление последнего элемента
        myList.remove(myList.size() - 1);
        
        // Создание стека
        Stack<Integer> stack = new Stack<>();
        
        // Добавление элементов в стек (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Удаление и получение верхнего элемента из стека (pop)
        int popped = stack.pop();
    }
}