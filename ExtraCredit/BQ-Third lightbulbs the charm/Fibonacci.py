def fibonacci(n):
    fibo = [0] * (n + 2)

    fibo[0] = 0
    fibo[1] = 1

    for i in range(2, n + 1):
        fibo[i] = fibo[i - 1] + fibo[i - 2]

    return fibo[n]

n = 9
print("nth fibonacci number: ", n)
print("Sequence of fibonacci numbers up to the nth fibonacci number:")
for i in range(n):
    print(fibonacci(i), end=" ")