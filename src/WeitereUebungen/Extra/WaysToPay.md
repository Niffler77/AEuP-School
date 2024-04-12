### How the Code Works:

1. **Initialization of Bill Denominations**: 
    ```java
    int[] bills = {200, 100, 50, 20, 10, 5};
    ```
    An array `bills` is initialized with the denominations of the bills available.

2. **Input and Ways Array Initialization**:
    ```java
    int[] ways = new int[new Scanner(System.in).nextInt() + 1];
    ways[0] = 1;
    ```
    - `ways` array is initialized to store the number of ways to pay each amount from 0 to the input amount.
    - `ways[0]` is initialized to 1 because there is only one way to pay 0€, which is by not using any bills.

3. **Dynamic Programming Approach**:
    ```java
    for (int bill : bills) {
        for (int i = bill; i < ways.length; i++) {
            ways[i] += ways[i - bill];
        }
    }
    ```
    - The nested loops iterate through each bill denomination and each possible amount to pay.
    - For each amount `i`, the program calculates the number of ways to pay `i` using the current bill denomination by adding the number of ways to pay `i - bill`.

4. **Output**:
    ```java
    System.out.println("Number of ways to pay " + (ways.length - 1) + "€ : " + ways[ways.length - 1]);
    ```
    The program prints the number of ways to pay the input amount.