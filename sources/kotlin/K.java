package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@InterfaceC4887e0(version = "1.3")
@Lc.c(AnnotationRetention.RUNTIME)
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface K {

    public static final class a {
        @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @InterfaceC4887e0(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @InterfaceC4887e0(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @dd.j(name = "bv")
    int[] bv() default {1, 0, 3};

    @dd.j(name = "d1")
    String[] d1() default {};

    @dd.j(name = "d2")
    String[] d2() default {};

    @dd.j(name = "k")
    int k() default 1;

    @dd.j(name = "mv")
    int[] mv() default {};

    @dd.j(name = "pn")
    String pn() default "";

    @dd.j(name = "xi")
    int xi() default 0;

    @dd.j(name = "xs")
    String xs() default "";
}
