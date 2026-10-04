package kotlin.reflect;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4887e0;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface o<V> extends n<V>, InterfaceC4376a<V> {

    public interface a<V> extends n.c<V>, InterfaceC4376a<V> {
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    Object A();

    V get();

    @Override // kotlin.reflect.n
    @NotNull
    a<V> getGetter();
}
