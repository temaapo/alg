# Сравнение создания массивов (списков) и организации стеков в Java, Python и C++ (Постников Артем, УИБО-10-24)
# Python
    # Создание списка (динамический массив)
    num = [1, 2, 3, 4, 5]

    # Добавление элементов
    num.append(6)

    # Удаление элементов
    num.pop()

    # Создание стека с помошью deque
    from collections import deque
    stack_deque = deque()
    stack_deque.append('a')  # Добавление элемента в стек (push)
    stack_deque.append('b')  
    stack_deque.append('c')  
    popped = stack_deque.pop()  # Удаление и получение верхнего элемента (pop)
• Массивы: списки динамические и встроены в язык.    

• Стеки: несколько вариантов (списки, deque), гибкие но без строгой типизации
# C++
    #include <vector>
    #include <stack>
    using namespace std;

    int main() {
        // Создание вектора (динамического массива)
        vector<int> my_vector = {1, 2, 3, 4, 5};
    
        // Добавление элемента в конец вектора
        my_vector.push_back(6);
    }
Векторы из STL предоставляют динамические массивы с контролем памяти.
# Java
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
        }
    }

