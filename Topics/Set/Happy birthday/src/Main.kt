fun findByIndex(names: Set<String>) = with(names) { "${indexOf("Alice")}, ${names.indexOf("Victor")}" }