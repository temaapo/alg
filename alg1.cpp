#include <vector>
#include <stack>
using namespace std;

int main() {
    // Создание вектора (динамического массива)
    vector<int> my_vector = {1, 2, 3, 4, 5};
    
    // Добавление элемента в конец вектора
    my_vector.push_back(6);
    
    // Удаление последнего элемента
    my_vector.pop_back();
    
    // Создание стека
    stack<int> my_stack;
    
    // Добавление элементов в стек (push)
    my_stack.push(10);
    my_stack.push(20);
    my_stack.push(30);
    
    // Удаление верхнего элемента из стека (pop)
    my_stack.pop();
    
}