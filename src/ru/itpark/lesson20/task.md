Метод из теории учитывает регистр букв. То есть <convert style=color:red> A </convert> и <convert style=color:red> a </convert> с его точки зрения разные символы. Реализуйте вариант этого же метода, так чтобы регистр букв был не важен:

```markdown
App.countChars("HexlEt", 'e'); // 2
App.countChars("HexlEt", 'E'); // 2
```

<convert style=color:red> Character.toLowerCase() </convert>– переводит символ в нижний регистр

```markdown
Character.toLowerCase('A'); // 'a'
```
