package androidx.lifecycle;

import R1.a;
import S1.i;
import android.app.Application;
import androidx.annotation.RestrictTo;
import dd.C4325b;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f114359b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final a.b<String> f114360c = i.a.f68119a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final R1.i f114361a;

    public static final class b {
        public b() {
        }

        public static /* synthetic */ m0 c(b bVar, p0 p0Var, c cVar, R1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = S1.c.f68111b;
            }
            if ((i10 & 4) != 0) {
                aVar = a.C0103a.f67688b;
            }
            return bVar.a(p0Var, cVar, aVar);
        }

        public static /* synthetic */ m0 d(b bVar, q0 q0Var, c cVar, R1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = S1.i.f68117a.e(q0Var);
            }
            if ((i10 & 4) != 0) {
                aVar = S1.i.f68117a.d(q0Var);
            }
            return bVar.b(q0Var, cVar, aVar);
        }

        @dd.o
        @NotNull
        public final m0 a(@NotNull p0 store, @NotNull c factory, @NotNull R1.a extras) {
            kotlin.jvm.internal.G.p(store, "store");
            kotlin.jvm.internal.G.p(factory, "factory");
            kotlin.jvm.internal.G.p(extras, "extras");
            return new m0(store, factory, extras);
        }

        @dd.o
        @NotNull
        public final m0 b(@NotNull q0 owner, @NotNull c factory, @NotNull R1.a extras) {
            kotlin.jvm.internal.G.p(owner, "owner");
            kotlin.jvm.internal.G.p(factory, "factory");
            kotlin.jvm.internal.G.p(extras, "extras");
            return new m0(owner.getViewModelStore(), factory, extras);
        }

        public b(C4969v c4969v) {
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f114366a = a.f114367a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f114367a = new a();

            @dd.o
            @NotNull
            public final c a(@NotNull R1.h<?>... initializers) {
                kotlin.jvm.internal.G.p(initializers, "initializers");
                return S1.i.f68117a.b((R1.h[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @NotNull
        <T extends k0> T a(@NotNull Class<T> cls, @NotNull R1.a aVar);

        @NotNull
        <T extends k0> T b(@NotNull Class<T> cls);

        @NotNull
        <T extends k0> T c(@NotNull kotlin.reflect.d<T> dVar, @NotNull R1.a aVar);
    }

    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static d f114369c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f114368b = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final a.b<String> f114370d = i.a.f68119a;

        public static final class a {
            public a() {
            }

            @dd.o
            public static /* synthetic */ void b() {
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            @NotNull
            public final d a() {
                if (d.f114369c == null) {
                    d.f114369c = new d();
                }
                d dVar = d.f114369c;
                kotlin.jvm.internal.G.m(dVar);
                return dVar;
            }

            public a(C4969v c4969v) {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final d f() {
            return f114368b.a();
        }

        @Override // androidx.lifecycle.m0.c
        @NotNull
        public <T extends k0> T a(@NotNull Class<T> modelClass, @NotNull R1.a extras) {
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            kotlin.jvm.internal.G.p(extras, "extras");
            return (T) b(modelClass);
        }

        @Override // androidx.lifecycle.m0.c
        @NotNull
        public <T extends k0> T b(@NotNull Class<T> modelClass) {
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            return (T) S1.d.f68112a.a(modelClass);
        }

        @Override // androidx.lifecycle.m0.c
        @NotNull
        public <T extends k0> T c(@NotNull kotlin.reflect.d<T> modelClass, @NotNull R1.a extras) {
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            kotlin.jvm.internal.G.p(extras, "extras");
            return (T) a(C4325b.e(modelClass), extras);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class e {
        public void d(@NotNull k0 viewModel) {
            kotlin.jvm.internal.G.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public m0(@NotNull p0 store, @NotNull c factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.G.p(store, "store");
        kotlin.jvm.internal.G.p(factory, "factory");
    }

    @dd.o
    @NotNull
    public static final m0 a(@NotNull p0 p0Var, @NotNull c cVar, @NotNull R1.a aVar) {
        return f114359b.a(p0Var, cVar, aVar);
    }

    @dd.o
    @NotNull
    public static final m0 b(@NotNull q0 q0Var, @NotNull c cVar, @NotNull R1.a aVar) {
        return f114359b.b(q0Var, cVar, aVar);
    }

    @e.I
    @NotNull
    public <T extends k0> T c(@NotNull Class<T> modelClass) {
        kotlin.jvm.internal.G.p(modelClass, "modelClass");
        return (T) f(kotlin.jvm.internal.O.d(modelClass));
    }

    @e.I
    @NotNull
    public <T extends k0> T d(@NotNull String key, @NotNull Class<T> modelClass) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(modelClass, "modelClass");
        return (T) this.f114361a.a(kotlin.jvm.internal.O.d(modelClass), key);
    }

    @e.I
    @NotNull
    public final <T extends k0> T e(@NotNull String key, @NotNull kotlin.reflect.d<T> modelClass) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(modelClass, "modelClass");
        return (T) this.f114361a.a(modelClass, key);
    }

    @e.I
    @NotNull
    public final <T extends k0> T f(@NotNull kotlin.reflect.d<T> modelClass) {
        kotlin.jvm.internal.G.p(modelClass, "modelClass");
        return (T) R1.i.b(this.f114361a, modelClass, null, 2, null);
    }

    public static class a extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public static a f114363g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Application f114365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f114362f = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final a.b<Application> f114364h = new C0302a();

        /* JADX INFO: renamed from: androidx.lifecycle.m0$a$a, reason: collision with other inner class name */
        public static final class C0302a implements a.b<Application> {
        }

        public static final class b {
            public b() {
            }

            @dd.o
            @NotNull
            public final a a(@NotNull Application application) {
                kotlin.jvm.internal.G.p(application, "application");
                if (a.f114363g == null) {
                    a.f114363g = new a(application);
                }
                a aVar = a.f114363g;
                kotlin.jvm.internal.G.m(aVar);
                return aVar;
            }

            public b(C4969v c4969v) {
            }
        }

        public a(Application application, int i10) {
            this.f114365e = application;
        }

        @dd.o
        @NotNull
        public static final a j(@NotNull Application application) {
            return f114362f.a(application);
        }

        @Override // androidx.lifecycle.m0.d, androidx.lifecycle.m0.c
        @NotNull
        public <T extends k0> T a(@NotNull Class<T> modelClass, @NotNull R1.a extras) {
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            kotlin.jvm.internal.G.p(extras, "extras");
            if (this.f114365e != null) {
                return (T) b(modelClass);
            }
            Application application = (Application) extras.a(f114364h);
            if (application != null) {
                return (T) i(modelClass, application);
            }
            if (C2589b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.b(modelClass);
        }

        @Override // androidx.lifecycle.m0.d, androidx.lifecycle.m0.c
        @NotNull
        public <T extends k0> T b(@NotNull Class<T> modelClass) {
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            Application application = this.f114365e;
            if (application != null) {
                return (T) i(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final <T extends k0> T i(Class<T> cls, Application application) {
            if (!C2589b.class.isAssignableFrom(cls)) {
                return (T) super.b(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.G.o(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            kotlin.jvm.internal.G.p(application, "application");
        }
    }

    public m0(R1.i iVar) {
        this.f114361a = iVar;
    }

    public /* synthetic */ m0(p0 p0Var, c cVar, R1.a aVar, int i10, C4969v c4969v) {
        this(p0Var, cVar, (i10 & 4) != 0 ? a.C0103a.f67688b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public m0(@NotNull p0 store, @NotNull c factory, @NotNull R1.a defaultCreationExtras) {
        this(new R1.i(store, factory, defaultCreationExtras));
        kotlin.jvm.internal.G.p(store, "store");
        kotlin.jvm.internal.G.p(factory, "factory");
        kotlin.jvm.internal.G.p(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(@NotNull q0 owner) {
        kotlin.jvm.internal.G.p(owner, "owner");
        p0 viewModelStore = owner.getViewModelStore();
        S1.i iVar = S1.i.f68117a;
        this(viewModelStore, iVar.e(owner), iVar.d(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@NotNull q0 owner, @NotNull c factory) {
        this(owner.getViewModelStore(), factory, S1.i.f68117a.d(owner));
        kotlin.jvm.internal.G.p(owner, "owner");
        kotlin.jvm.internal.G.p(factory, "factory");
    }
}
