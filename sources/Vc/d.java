package Vc;

import G0.F;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@InterfaceC4887e0(version = "1.3")
@InterfaceC4850b0
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
    @dd.j(name = a7.c.f84756a)
    String c() default "";

    @dd.j(name = "f")
    String f() default "";

    @dd.j(name = "i")
    int[] i() default {};

    @dd.j(name = com.prism.gaia.helper.utils.l.f165154a)
    int[] l() default {};

    @dd.j(name = F.f40036b)
    String m() default "";

    @dd.j(name = "n")
    String[] n() default {};

    @dd.j(name = "nl")
    int[] nl() default {};

    @dd.j(name = "s")
    String[] s() default {};

    @dd.j(name = "v")
    int v() default 2;

    public static final class a {
        @InterfaceC4887e0(version = "2.2")
        public static /* synthetic */ void a() {
        }
    }
}
