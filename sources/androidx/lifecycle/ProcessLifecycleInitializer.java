package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.V;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import x2.C5779a;
import x2.InterfaceC5780b;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements InterfaceC5780b<B> {
    @Override // x2.InterfaceC5780b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public B create(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        C5779a c5779aE = C5779a.e(context);
        kotlin.jvm.internal.G.o(c5779aE, "getInstance(context)");
        if (!c5779aE.f240476b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C2610x.a(context);
        V.b bVar = V.f114122i;
        bVar.c(context);
        bVar.getClass();
        return V.f114124k;
    }

    @Override // x2.InterfaceC5780b
    @NotNull
    public List<Class<? extends InterfaceC5780b<?>>> dependencies() {
        return EmptyList.f217510a;
    }
}
