# Сравнение создания массивов (списков) и организации стеков в Java, Python и C++ (Постников Артем, УИБО-10-24)
# Python

# Создание списка (массива)
my_list = [1, 2, 3, 4, 5]

# Добавление элемента в конец списка
my_list.append(6)

# Удаление последнего элемента
my_list.pop()

# ===== СОЗДАНИЕ СТЕКА =====
# Вариант 1: Использование списка как стека
stack_list = []
stack_list.append('a')  # Добавление элемента в стек (push)
stack_list.append('b')  # Добавление элемента в стек (push)
stack_list.append('c')  # Добавление элемента в стек (push)
popped = stack_list.pop()  # Удаление и получение верхнего элемента (pop)

# Вариант 2: Использование deque
from collections import deque
stack_deque = deque()
stack_deque.append('a')  # Добавление элемента в стек (push)
stack_deque.append('b')  # Добавление элемента в стек (push)
stack_deque.append('c')  # Добавление элемента в стек (push)
popped = stack_deque.pop()  # Удаление и получение верхнего элемента (pop)
