package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.c;
import androidx.datastore.core.d;
import androidx.datastore.core.e;
import androidx.datastore.core.i;
import e.InterfaceC4326A;
import ed.InterfaceC4376a;
import ed.l;
import j1.b;
import java.io.File;
import java.util.List;
import kd.InterfaceC4845e;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DataStoreSingletonDelegate<T> implements InterfaceC4845e<Context, d<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i<T> f112299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final b<T> f112300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l<Context, List<c<T>>> f112301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final L f112302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Object f112303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @Nullable
    public volatile d<T> f112304g;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(@NotNull String fileName, @NotNull i<T> serializer, @Nullable b<T> bVar, @NotNull l<? super Context, ? extends List<? extends c<T>>> produceMigrations, @NotNull L scope) {
        G.p(fileName, "fileName");
        G.p(serializer, "serializer");
        G.p(produceMigrations, "produceMigrations");
        G.p(scope, "scope");
        this.f112298a = fileName;
        this.f112299b = serializer;
        this.f112300c = bVar;
        this.f112301d = produceMigrations;
        this.f112302e = scope;
        this.f112303f = new Object();
    }

    @Override // kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d<T> getValue(@NotNull Context thisRef, @NotNull n<?> property) {
        d<T> dVar;
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        d<T> dVar2 = this.f112304g;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f112303f) {
            try {
                if (this.f112304g == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    i<T> iVar = this.f112299b;
                    b<T> bVar = this.f112300c;
                    l<Context, List<c<T>>> lVar = this.f112301d;
                    G.o(applicationContext, "applicationContext");
                    this.f112304g = e.f112437a.d(iVar, bVar, lVar.invoke(applicationContext), this.f112302e, new InterfaceC4376a<File>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
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
                            return a.a(applicationContext2, this.f112298a);
                        }
                    });
                }
                dVar = this.f112304g;
                G.m(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
