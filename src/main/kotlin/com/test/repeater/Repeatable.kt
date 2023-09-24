package com.test.repeater

/**
 * Repeatable annotation
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class Repeatable(val repeatCount: Int = 1)