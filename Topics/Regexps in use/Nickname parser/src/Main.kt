fun parsingNickname(emailString: String): String =
    emailString
        .split("@")
        .first()
        .split(Regex("[._]"))
        .joinToString(" ") { it.capitalize() }