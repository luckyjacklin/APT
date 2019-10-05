package me.jack.compiler

import com.google.auto.service.AutoService
import me.jack.annotation.Function
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

/**
 * Created by Jack on 2019-10-05.
 */
@AutoService(Processor::class)
class FunctionAnnotationProcessor : AbstractProcessor() {

    private var mMessager: Messager? = null

    @Synchronized
    override fun init(processingEnvironment: ProcessingEnvironment) {
        super.init(processingEnvironment)
        mMessager = processingEnvironment.messager
    }

    override fun process(set: Set<TypeElement>, roundEnvironment: RoundEnvironment): Boolean {
        val elements = roundEnvironment.getElementsAnnotatedWith(Function::class.java)
        for (element in elements) {
            mMessager?.printMessage(Diagnostic.Kind.WARNING, "find element: " + element.simpleName)
        }
        return false
    }

    override fun getSupportedAnnotationTypes(): Set<String> {
        return mutableSetOf(Function::class.java.name)
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.latest()
    }
}
