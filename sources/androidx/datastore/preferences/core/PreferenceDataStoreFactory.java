package androidx.datastore.preferences.core;

import androidx.datastore.core.e;
import dd.k;
import ed.InterfaceC4376a;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.io.p;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceDataStoreFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PreferenceDataStoreFactory f112486a = new PreferenceDataStoreFactory();

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.datastore.core.d e(PreferenceDataStoreFactory preferenceDataStoreFactory, j1.b bVar, List list, L l10, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = EmptyList.f217510a;
        }
        if ((i10 & 4) != 0) {
            C5052b0 c5052b0 = C5052b0.f218827a;
            l10 = M.a(C5052b0.f218830d.plus(Y0.c(null, 1, null)));
        }
        return preferenceDataStoreFactory.d(bVar, list, l10, interfaceC4376a);
    }

    @k
    @NotNull
    public final androidx.datastore.core.d<a> a(@NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(produceFile, "produceFile");
        return e(this, null, null, null, produceFile, 7, null);
    }

    @k
    @NotNull
    public final androidx.datastore.core.d<a> b(@Nullable j1.b<a> bVar, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(produceFile, "produceFile");
        return e(this, bVar, null, null, produceFile, 6, null);
    }

    @k
    @NotNull
    public final androidx.datastore.core.d<a> c(@Nullable j1.b<a> bVar, @NotNull List<? extends androidx.datastore.core.c<a>> migrations, @NotNull InterfaceC4376a<? extends File> produceFile) {
        G.p(migrations, "migrations");
        G.p(produceFile, "produceFile");
        return e(this, bVar, migrations, null, produceFile, 4, null);
    }

    @k
    @NotNull
    public final androidx.datastore.core.d<a> d(@Nullable j1.b<a> bVar, @NotNull List<? extends androidx.datastore.core.c<a>> migrations, @NotNull L scope, @NotNull final InterfaceC4376a<? extends File> produceFile) {
        G.p(migrations, "migrations");
        G.p(scope, "scope");
        G.p(produceFile, "produceFile");
        return new PreferenceDataStore(e.f112437a.d(d.f112494a, bVar, migrations, scope, new InterfaceC4376a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                File fileInvoke = produceFile.invoke();
                String strH0 = p.h0(fileInvoke);
                d dVar = d.f112494a;
                dVar.getClass();
                String str = d.f112495b;
                if (strH0.equals(str)) {
                    return fileInvoke;
                }
                StringBuilder sb2 = new StringBuilder("File extension for file: ");
                sb2.append(fileInvoke);
                sb2.append(" does not match required extension for Preferences file: ");
                dVar.getClass();
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }));
    }
}
