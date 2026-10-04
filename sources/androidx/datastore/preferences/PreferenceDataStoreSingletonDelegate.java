package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.d;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import e.InterfaceC4326A;
import ed.InterfaceC4376a;
import ed.l;
import java.io.File;
import java.util.List;
import kd.InterfaceC4845e;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceDataStoreSingletonDelegate implements InterfaceC4845e<Context, d<androidx.datastore.preferences.core.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final j1.b<androidx.datastore.preferences.core.a> f112462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<Context, List<androidx.datastore.core.c<androidx.datastore.preferences.core.a>>> f112463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L f112464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f112465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @Nullable
    public volatile d<androidx.datastore.preferences.core.a> f112466f;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@NotNull String name, @Nullable j1.b<androidx.datastore.preferences.core.a> bVar, @NotNull l<? super Context, ? extends List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.a>>> produceMigrations, @NotNull L scope) {
        G.p(name, "name");
        G.p(produceMigrations, "produceMigrations");
        G.p(scope, "scope");
        this.f112461a = name;
        this.f112462b = bVar;
        this.f112463c = produceMigrations;
        this.f112464d = scope;
        this.f112465e = new Object();
    }

    @Override // kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d<androidx.datastore.preferences.core.a> getValue(@NotNull Context thisRef, @NotNull n<?> property) {
        d<androidx.datastore.preferences.core.a> dVar;
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        d<androidx.datastore.preferences.core.a> dVar2 = this.f112466f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f112465e) {
            try {
                if (this.f112466f == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.f112486a;
                    j1.b<androidx.datastore.preferences.core.a> bVar = this.f112462b;
                    l<Context, List<androidx.datastore.core.c<androidx.datastore.preferences.core.a>>> lVar = this.f112463c;
                    G.o(applicationContext, "applicationContext");
                    this.f112466f = preferenceDataStoreFactory.d(bVar, lVar.invoke(applicationContext), this.f112464d, new InterfaceC4376a<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // ed.InterfaceC4376a
                        @NotNull
                        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                        public final File invoke() {
                            Context applicationContext2 = applicationContext;
                            G.o(applicationContext2, "applicationContext");
                            return a.a(applicationContext2, this.f112461a);
                        }
                    });
                }
                dVar = this.f112466f;
                G.m(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
