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