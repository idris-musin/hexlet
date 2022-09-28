Реализуйте метод <convert style=color:red> convertString() </convert>, который принимает на вход строку и, если первая буква не заглавная, возвращает перевернутый ва   риант исходной строки. Если первая буква заглавная, то строка возвращается без изменений. Если на вход передана пустая строка, метод должен вернуть пустую строку.

```markdown
App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// Не забудьте учесть пустую строку!
App.convertString(""); // ""
```

#Подсказки

Для выполнения задачи вам понадобятся следующие методы:

- Метод <char style=color:red> Character.isUpperCase() </char> – проверяет, находится ли символ в верхнем регистре

```markdown
Character.isUpperCase('s'); // false
Character.isUpperCase('A'); // true
```

- Метод <str style=color:red> StringUtils.reverse() </str> из библиотеки _Apache Commons Lang_ – выполняет переворот строки

```markdown
StringUtils.reverse("bat"); // "tab"
```

- Подумайте, в каком месте метода нужно разместить проверку на пустую строку?

Попробуйте написать два варианта функции: с обычным if-else, и с тернарным оператором.