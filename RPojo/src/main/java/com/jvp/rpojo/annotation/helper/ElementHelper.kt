package com.jvp.rpojo.annotation.helper

import javax.lang.model.element.Element
import javax.lang.model.element.ElementKind
import javax.lang.model.element.ExecutableElement

class ElementHelper {

    companion object {
        fun getMethods(element: Element): Set<ExecutableElement> {
            return element.enclosedElements
                    .filter { it.kind == ElementKind.METHOD }
                    .map { it as ExecutableElement }
                    .toSet()
        }

        fun <Class> getAnnotation(annotationClass: Class<T>): Class<T>
    }
}