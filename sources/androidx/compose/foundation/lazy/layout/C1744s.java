package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.H0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
public final class C1744s implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyLayoutItemContentFactory f91843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Object, Integer> f91844b = new LinkedHashMap();

    public C1744s(@NotNull LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.f91843a = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.H0
    public void a(@NotNull H0.a aVar) {
        this.f91844b.clear();
        Iterator<Object> it = aVar.f102401a.iterator();
        while (it.hasNext()) {
            Object objC = this.f91843a.c(it.next());
            Integer num = this.f91844b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f91844b.put(objC, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.H0
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return kotlin.jvm.internal.G.g(this.f91843a.c(obj), this.f91843a.c(obj2));
    }
}
