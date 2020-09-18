package com.jvp.rpojo.annotation

import javax.lang.model.element.ExecutableElement

data class Interface(
    var packageName: String = "",
    var methods: Set<ExecutableElement>
)