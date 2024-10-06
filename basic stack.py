# Basic Stack Implementation in Python

class Stack:
    def __init__(self):
        self.stack = []

    def is_empty(self):
        """Check if the stack is empty."""
        return len(self.stack) == 0

    def push(self, item):
        """Add an item to the top of the stack."""
        self.stack.append(item)
        print(f"Pushed {item} to stack")

    def pop(self):
        """Remove and return the top item of the stack. Raise an error if the stack is empty."""
        if self.is_empty():
            raise IndexError("pop from empty stack")
        return self.stack.pop()

    def peek(self):
        """Return the top item of the stack without removing it. Raise an error if the stack is empty."""
        if self.is_empty():
            raise IndexError("peek at empty stack")
        return self.stack[-1]

    def size(self):
        """Return the number of items in the stack."""
        return len(self.stack)

# Example
if __name__ == "__main__":
    stack = Stack()

    stack.push(1)
    stack.push(2)
    stack.push(3)

    print(f"Top item: {stack.peek()}")
    print(f"Stack size: {stack.size()}")

    popped_item = stack.pop()
    print(f"Popped item: {popped_item}")
    print(f"Stack size after pop: {stack.size()}")

    while not stack.is_empty():
        print(f"Popped item: {stack.pop()}")

    # Uncomment the line below to see an error when trying to pop from an empty stack
    # stack.pop()
