package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1906e1;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class U<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f98513a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<T<T>> f98514b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC1906e1 f98515c;

    @Nullable
    public final Object a() {
        return this.f98513a;
    }

    @NotNull
    public final List<T<T>> b() {
        return this.f98514b;
    }

    @Nullable
    public final InterfaceC1906e1 c() {
        return this.f98515c;
    }

    public final void d(@Nullable Object obj) {
        this.f98513a = obj;
    }

    public final void e(@NotNull List<T<T>> list) {
        this.f98514b = list;
    }

    public final void f(@Nullable InterfaceC1906e1 interfaceC1906e1) {
        this.f98515c = interfaceC1906e1;
    }
}
