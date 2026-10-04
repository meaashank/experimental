package androidx.core.os;

import android.os.PersistableBundle;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,152:1\n13579#2,2:153\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n34#1:153,2\n*E\n"})
public final class F {
    @e.T(21)
    @NotNull
    public static final PersistableBundle a() {
        return new PersistableBundle(0);
    }

    @e.T(21)
    @NotNull
    public static final PersistableBundle b(@NotNull Pair<String, ? extends Object>... pairArr) {
        PersistableBundle persistableBundle = new PersistableBundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            D.b(persistableBundle, pair.f217467a, pair.f217468b);
        }
        return persistableBundle;
    }

    @e.T(21)
    @NotNull
    public static final PersistableBundle c(@NotNull Map<String, ? extends Object> map) {
        PersistableBundle persistableBundle = new PersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            D.b(persistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundle;
    }
}
