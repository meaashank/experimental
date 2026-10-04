package androidx.compose.ui.modifier;

import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public abstract class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102632b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<T> f102633a;

    public /* synthetic */ c(InterfaceC4376a interfaceC4376a, C4969v c4969v) {
        this(interfaceC4376a);
    }

    @NotNull
    public final InterfaceC4376a<T> a() {
        return this.f102633a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(InterfaceC4376a<? extends T> interfaceC4376a) {
        this.f102633a = interfaceC4376a;
    }
}
