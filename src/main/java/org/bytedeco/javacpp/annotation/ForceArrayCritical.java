package org.bytedeco.javacpp.annotation;

import org.bytedeco.javacpp.tools.Generator;

import java.lang.annotation.*;

/**
 * In some methods, {@link Generator} will generate code to transfer arrays from
 * JVM to native code using the Get/Release<primitivetype>ArrayElements methods.
 * However these methods copy the underlying data.
 * With this annotation, the generated code will always call the
 * Get/ReleasePrimitiveArrayCritical methods instead.
 *
 * @see Generator
 *
 */
@Documented @Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ForceArrayCritical { }
