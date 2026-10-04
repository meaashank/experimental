package androidx.datastore.preferences.core;

import ed.p;
import kotlin.coroutines.e;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceDataStore implements androidx.datastore.core.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.datastore.core.d<a> f112482a;

    public PreferenceDataStore(@NotNull androidx.datastore.core.d<a> delegate) {
        G.p(delegate, "delegate");
        this.f112482a = delegate;
    }

    @Override // androidx.datastore.core.d
    @Nullable
    public Object a(@NotNull p<? super a, ? super e<? super a>, ? extends Object> pVar, @NotNull e<? super a> eVar) {
        return this.f112482a.a(new PreferenceDataStore$updateData$2(pVar, null), eVar);
    }

    @Override // androidx.datastore.core.d
    @NotNull
    public kotlinx.coroutines.flow.e<a> getData() {
        return this.f112482a.getData();
    }
}
