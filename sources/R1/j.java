package R1;

import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import dd.C4325b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final <VM extends k0> VM a(@NotNull m0.c factory, @NotNull kotlin.reflect.d<VM> modelClass, @NotNull a extras) {
        G.p(factory, "factory");
        G.p(modelClass, "modelClass");
        G.p(extras, "extras");
        try {
            try {
                return (VM) factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.b(C4325b.e(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.a(C4325b.e(modelClass), extras);
        }
    }
}
