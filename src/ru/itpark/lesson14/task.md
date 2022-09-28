Реализуйте метод <palindrome style=color:red> isPalindrome() </palindrome>, который определяет, является ли слово палиндромом или нет. Палиндром это слово, которое читается одинаково в обоих направлениях.

```markdown
App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
App.isPalindrome("Ага"); // true
```

Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной. Для этого воспользуйтесь методом <reverse style=color:red> StringUtils.reverse() </reverse>

```markdown
StringUtils.reverse("мама"); // "амам"
```