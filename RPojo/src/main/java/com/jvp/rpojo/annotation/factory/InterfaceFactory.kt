package com.jvp.rpojo.annotation.factory

import com.jvp.rpojo.annotation.Interface
import com.jvp.rpojo.annotation.helper.ElementHelper
import javax.lang.model.element.Element
import javax.lang.model.element.ElementKind

class InterfaceFactory {

    companion object {
    fun createFromElement(element: Element, packageName: String = ""): Interface? {
            return if (element.kind == ElementKind.INTERFACE) {
                Interface(
                    packageName = packageName,
                    methods = ElementHelper.getMethods(element)
                )
            } else {
                null
            }
        }
    }
}