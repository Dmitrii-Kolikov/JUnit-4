#### Модульное тестирование ("Осуществляется разработчиком")
- проверка работы программы на уровне отдельных модулей (классов, методов)
- Модульное (unit) тестирование
Процесс проверки корректности работы отдельных частей исходного кода (чаще всего методов) программы путем запуска тестов в искуственной среде.

Основные правила 
- Каждый тестовый сценарий (test case) - отдельный метод. Методы необходимо помечать аннотацией @Test
- Тестовый класс необходимо называть с суффиксом Test (например Vector2DTest)
- Тестовые методы желательно должны содержать "Should" в назавании например: SumShouldBePositive
- Существует вспомогательные методы с аннотациями @Before, @BeforeClass, @After, @AfterClass

Аннотаци @Test 
Объявляет метод (обязательно public void) тестовым.

Аннотаци @Test может использовать параметры
- expected - код в тесте проверяется на генерацию определнного исключения
- timeout код в тексте должен работать не более указанного времени (иначе тест завален)

#### Решить 2 задачи и сделать модульное тестирование.
- Подсчет суммы цифр числа
- Панграмма короткий текст, использующий буквы алфавита.
