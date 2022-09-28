В этом упражнении мы будем работать с двумя классами, которые находятся в разных пакетах. Чтобы использовать методы одного класса в другом, нужно будет его импортировать. Обратите внимание, что классы в пакетах публичные.

# src/main/java/io/hexlet/counter/Counter.java

- В файле определите пакет, который соответствует файловой структуре. Именование пакета должно начинается от директории <convert style=color:red> java </convert>.
- В классе <convert style=color:red> Counter </convert> создайте публичный статический метод <convert style=color:red> bigLettersCount() </convert>. Метод принимает в качестве параметра строку и возвращает количество больших символов в строке

```markdown
Counter.bigLettersCount("AsDfGG"); // 4
Counter.bigLettersCount("asdJkl"); // 1
```
# src/main/java/io/hexlet/App.java

В классе App определите публичный статический метод <convert style=color:red> greaterThan() </convert>. Метод принимает в качестве параметров две строки и возвращает true, если в первой строке больше количество больших символов, чем во второй. В другом случае возвращает <convert style=color:red> false </convert>

```markdown
App.greaterThan("QwQ", "aa"); // true
App.greaterThan("QwQbki", "AHK"); // false
App.greaterThan("A", "B"); // false
```