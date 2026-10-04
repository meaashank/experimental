package kd;

import androidx.compose.runtime.R0;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4842b<T> implements InterfaceC4846f<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f217434a;

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull n<?> property) {
        G.p(property, "property");
        T t10 = this.f217434a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kd.InterfaceC4846f
    public void setValue(@Nullable Object obj, @NotNull n<?> property, @NotNull T value) {
        G.p(property, "property");
        G.p(value, "value");
        this.f217434a = value;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NotNullProperty(");
        if (this.f217434a != null) {
            str = "value=" + this.f217434a;
        } else {
            str = "value not initialized yet";
        }
        return R0.a(sb2, str, ')');
    }
}
