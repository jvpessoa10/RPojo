package com.jvp.rpojo.annotation.processor

import com.jvp.rpojo.annotation.ReflectionInterface
import com.jvp.rpojo.annotation.factory.InterfaceFactory
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.lang.model.element.Element
import javax.lang.model.element.ElementKind
import javax.lang.model.element.TypeElement

/**
 * 1) Get Anotated Interfaces
 * 2) Parse methods
 * 3) Generate class in classpath
 * */
@SupportedAnnotationTypes("com.jvp.rpojo.annotation.Origin")
class RPojoProcessor: AbstractProcessor() {

    override fun process(
            set: MutableSet<out TypeElement>,
            roundEnvironment: RoundEnvironment
    ): Boolean {
        roundEnvironment.getElementsAnnotatedWith(ReflectionInterface::class.java).forEach {
            if (it.kind != ElementKind .INTERFACE) {
                val targetPackage = getElementAnnotation(it)?.packageName ?: ""
                val interfaceObj = InterfaceFactory.createFromElement(it, targetPackage)


            }
        }
       return true
    }

    private fun getElementAnnotation(element: Element): ReflectionInterface? {
        return element.getAnnotationsByType(ReflectionInterface::class.java)[0]
    }

}