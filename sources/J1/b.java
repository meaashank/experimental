package j1;

import androidx.datastore.core.CorruptionException;
import ed.l;
import java.io.IOException;
import kotlin.coroutines.e;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements androidx.datastore.core.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l<CorruptionException, T> f212513a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull l<? super CorruptionException, ? extends T> produceNewData) {
        G.p(produceNewData, "produceNewData");
        this.f212513a = produceNewData;
    }

    @Override // androidx.datastore.core.a
    @Nullable
    public Object a(@NotNull CorruptionException corruptionException, @NotNull e<? super T> eVar) throws IOException {
        return this.f212513a.invoke(corruptionException);
    }
}
