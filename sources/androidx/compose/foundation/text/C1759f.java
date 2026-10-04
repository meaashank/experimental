package androidx.compose.foundation.text;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1759f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93567c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.B f93568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.q<String, InterfaceC1946s, Integer, L0> f93569b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1759f(@NotNull androidx.compose.ui.text.B b10, @NotNull ed.q<? super String, ? super InterfaceC1946s, ? super Integer, L0> qVar) {
        this.f93568a = b10;
        this.f93569b = qVar;
    }

    @NotNull
    public final ed.q<String, InterfaceC1946s, Integer, L0> a() {
        return this.f93569b;
    }

    @NotNull
    public final androidx.compose.ui.text.B b() {
        return this.f93568a;
    }
}
