package androidx.compose.material;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@P
@androidx.compose.runtime.internal.r(parameters = 0)
public final class K<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f96435b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<T, Float> f96436a = new LinkedHashMap();

    public final void a(T t10, float f10) {
        this.f96436a.put(t10, Float.valueOf(f10));
    }

    @NotNull
    public final Map<T, Float> b() {
        return this.f96436a;
    }
}
