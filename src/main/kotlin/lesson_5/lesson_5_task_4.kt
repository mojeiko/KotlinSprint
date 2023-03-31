package lesson_5

fun main() {

    val login = "Batman"
    val password = "password"

    print("Введите логин:")

    if (login != readln())
        println("Такого пользователя не существует!\nХотите зарегистрироваться?")
    else {
        print("Введите пароль:")
        if (password != readln())
            println("Ошибка авторизации!")
        else println("Добро пожаловать!")
    }

}
