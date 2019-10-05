package me.jack.annotation

/**
 * Created by Jack on 2019-10-05.
 */
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class Function(val name: String = "")
