# Завдання
## Тех. стек
- Версія джави повинна залишатися 17
- Спрінг бут повинен залишатися 3
- Версії інфініспану також повинні залишатися незмінними
- Обов'язково повинен бути встановлений Docker Desktop
- Для підняття докеру-контейнера необхідно виконати наступну команду в директорії проекту
```shell
docker-compose up
```
## Тех.завдання
- Потрібно реалізувати конвертацію rest-з'єднання в сокет
- Для цього вам потрібно спершу створити простий rest-сервер, який буде повертати вам тестові дані для основного проекту
- Основний сервер(цей проект) повинен звертатися до вашого тестового rest-серверу та конвертувати ці дані в сокет-з'єднання
- Це означає, що до вашого основного серверу можна підключитися по сокету та отримути оновлення в реальному часі
- Основний сервер повинний періодично звертатися до тестового серверу для перевірки оновлень та кешувати ці дані в інфініспані
- Як тільки дані в інфініспані оновляться - основний сервер має повідомити про це в сокеті