package lesson_5

fun main() {

    val login = "Batman"
    val password = "password"

    print("Введите логин:")
    val inputLogin = readln()

    if (login != inputLogin)
        println("Такого пользователя не существует!\nХотите зарегистрироваться?")
    else {
        print("Введите пароль:")
        val inputPassword = readln()

        if (password != inputPassword)
            println("Ошибка авторизации!")
        else println("Добро пожаловать!")
    }

}