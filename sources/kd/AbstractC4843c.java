package kd;

import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4843c<V> implements InterfaceC4846f<Object, V> {
    private V value;

    public AbstractC4843c(V v10) {
        this.value = v10;
    }

    public void afterChange(@NotNull n<?> property, V v10, V v11) {
        G.p(property, "property");
    }

    public boolean beforeChange(@NotNull n<?> property, V v10, V v11) {
        G.p(property, "property");
        return true;
    }

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    public V getValue(@Nullable Object obj, @NotNull n<?> property) {
        G.p(property, "property");
        return this.value;
    }

    @Override // kd.InterfaceC4846f
    public void setValue(@Nullable Object obj, @NotNull n<?> property, V v10) {
        G.p(property, "property");
        V v11 = this.value;
        if (beforeChange(property, v11, v10)) {
            this.value = v10;
            afterChange(property, v11, v10);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
