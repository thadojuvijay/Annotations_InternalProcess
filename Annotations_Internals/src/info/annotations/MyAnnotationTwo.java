package info.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationTwo 

{
public String name();
}

/* 
 *Why we use @Target?
 *we use target for Which type(class,Method,field) you want to give more information,
 *By targeting the Element.TYPE we give more information at class level,
 *By targeting the Element.METHOD we give more information at METHOD level,
 *
 * 
 * 
 * 
 * */

/* The jvm will not understand the custom Annotations.which made by programmer.
 * if the jvm want to understand our custom  Annotation then we use 
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 * 
 * 
 * 
 * java.lang.annotation
   
                      *Interfaces
                      1. Annotation


                        *Enums

                     1.ElementType
                    2.RetentionPolicy

                       *Exceptions

                  1.AnnotationTypeMismatchException
                  2. IncompleteAnnotationException

                           * Errors
                    1.AnnotationFormatError



                       *Annotation Types

                       1. Documented
                        2.Inherited
                         3.Native
                        4.Repeatable
                         5.Retention
                          6.Target
 * */
 