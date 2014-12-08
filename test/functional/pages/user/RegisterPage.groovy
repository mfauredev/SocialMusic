package pages.user

class RegisterPage extends LayoutPage{
    static url = "user/register"

    static at = {
        title ==~ /Register/
    }

    static content = {
        createButton(to: ShowUserPage) { create() }
    }
}
