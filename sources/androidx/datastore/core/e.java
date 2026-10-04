package androidx.datastore.core;

import ed.InterfaceC4376a;
import j1.C4775a;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.H;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f112437a = new e();

    public static d e(e eVar, i iVar, j1.b bVar, List list, L l10, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = EmptyList.f217510a;
        }
        if ((i10 & 8) != 0) {
            C5052b0 c5052b0 = C5052b0.f218827a;
            l10 = M.a(C5052b0.f218830d.plus(Y0.c(null, 1, null)));
        }
        return eVar.d(iVar, bVar, list, l10, interfaceC4376a);
    }

    @dd.k
    @NotNull
    public final <T> d<T> a(@NotNull i<T> serializer, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(serializer, "serializer");
        G.p(produceFile, "produceFile");
        return e(this, serializer, null, null, null, produceFile, 14, null);
    }

    @dd.k
    @NotNull
    public final <T> d<T> b(@NotNull i<T> serializer, @Nullable j1.b<T> bVar, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(serializer, "serializer");
        G.p(produceFile, "produceFile");
        return e(this, serializer, bVar, null, null, produceFile, 12, null);
    }

    @dd.k
    @NotNull
    public final <T> d<T> c(@NotNull i<T> serializer, @Nullable j1.b<T> bVar, @NotNull List<? extends c<T>> migrations, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(serializer, "serializer");
        G.p(migrations, "migrations");
        G.p(produceFile, "produceFile");
        return e(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    @dd.k
    @NotNull
    public final <T> d<T> d(@NotNull i<T> serializer, @Nullable j1.b<T> bVar, @NotNull List<? extends c<T>> migrations, @NotNull L scope, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(serializer, "serializer");
        G.p(migrations, "migrations");
        G.p(scope, "scope");
        G.p(produceFile, "produceFile");
        if (bVar == null) {
            bVar = (j1.b<T>) new C4775a();
        }
        return new SingleProcessDataStore(produceFile, serializer, H.l(DataMigrationInitializer.f112307a.b(migrations)), bVar, scope);
    }
}
