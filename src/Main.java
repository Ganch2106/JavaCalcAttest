public class Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber num1 = new ComplexNumber(3, 4); // 3 + 4i
        ComplexNumber num2 = new ComplexNumber(1, 2); // 1 + 2i

        // Создаем объекты для операций
        ComplexOperation addition = new AdditionOperation();
        ComplexOperation multiplication = new MultiplicationOperation();
        ComplexOperation division = new DivisionOperation();

        // Выполняем операции
        ComplexNumber additionResult = addition.execute(num1, num2);
        ComplexNumber multiplicationResult = multiplication.execute(num1, num2);
        ComplexNumber divisionResult = division.execute(num1, num2);

        // Выводим результаты на консоль
        System.out.println("Результат сложения: " + additionResult);
        System.out.println("Результат умножения: " + multiplicationResult);
        System.out.println("Результат деления: " + divisionResult);
    }
}
