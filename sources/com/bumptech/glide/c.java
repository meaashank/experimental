package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.r;
import com.bumptech.glide.i;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.module.AppGlideModule;
import e.InterfaceC4326A;
import e.f0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s3.p;
import t3.C5601d;
import t3.InterfaceC5599b;
import y3.m;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f137577l = "image_manager_disk_cache";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f137578m = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f137579n = "Glide";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InterfaceC4326A("Glide.class")
    public static volatile c f137580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f137581p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.i f137582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f137583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.cache.j f137584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f137585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f137586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f137587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s3.c f137588g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f137590i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    @InterfaceC4326A("this")
    public com.bumptech.glide.load.engine.prefill.a f137592k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC4326A("managers")
    public final List<k> f137589h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MemoryCategory f137591j = MemoryCategory.NORMAL;

    public interface a {
        @NonNull
        com.bumptech.glide.request.h build();
    }

    public c(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.i iVar, @NonNull com.bumptech.glide.load.engine.cache.j jVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @NonNull p pVar, @NonNull s3.c cVar, int i10, @NonNull a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<com.bumptech.glide.request.g<Object>> list, @NonNull List<InterfaceC5599b> list2, @Nullable AppGlideModule appGlideModule, @NonNull GlideExperiments glideExperiments) {
        this.f137582a = iVar;
        this.f137583b = eVar;
        this.f137586e = bVar;
        this.f137584c = jVar;
        this.f137587f = pVar;
        this.f137588g = cVar;
        this.f137590i = aVar;
        this.f137585d = new e(context, bVar, new i.a(this, list2, appGlideModule), new v3.k(), aVar, map, list, iVar, glideExperiments, i10);
    }

    public static void A(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    @Deprecated
    public static k D(@NonNull Activity activity) {
        return F(activity.getApplicationContext());
    }

    @NonNull
    @Deprecated
    public static k E(@NonNull Fragment fragment) {
        Activity activity = fragment.getActivity();
        m.f(activity, f137578m);
        return F(activity.getApplicationContext());
    }

    @NonNull
    public static k F(@NonNull Context context) {
        return p(context).h(context);
    }

    @NonNull
    public static k G(@NonNull View view) {
        return p(view.getContext()).i(view);
    }

    @NonNull
    public static k H(@NonNull androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).j(fragment);
    }

    @NonNull
    public static k I(@NonNull r rVar) {
        return p(rVar).k(rVar);
    }

    @InterfaceC4326A("Glide.class")
    @f0
    public static void a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f137581p) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f137581p = true;
        try {
            s(context, generatedAppGlideModule);
        } finally {
            f137581p = false;
        }
    }

    @f0
    public static void d() {
        B.c().i();
    }

    @NonNull
    public static c e(@NonNull Context context) {
        if (f137580o == null) {
            GeneratedAppGlideModule generatedAppGlideModuleF = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f137580o == null) {
                        a(context, generatedAppGlideModuleF);
                    }
                } finally {
                }
            }
        }
        return f137580o;
    }

    @Nullable
    public static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            A(e10);
            throw null;
        } catch (InstantiationException e11) {
            A(e11);
            throw null;
        } catch (NoSuchMethodException e12) {
            A(e12);
            throw null;
        } catch (InvocationTargetException e13) {
            A(e13);
            throw null;
        }
    }

    @Nullable
    public static File l(@NonNull Context context) {
        return m(context, "image_manager_disk_cache");
    }

    @Nullable
    public static File m(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable("Glide", 6)) {
                Log.e("Glide", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @NonNull
    public static p p(@Nullable Context context) {
        m.f(context, f137578m);
        return e(context).o();
    }

    @f0
    public static void q(@NonNull Context context, @NonNull d dVar) {
        GeneratedAppGlideModule generatedAppGlideModuleF = f(context);
        synchronized (c.class) {
            try {
                if (f137580o != null) {
                    z();
                }
                t(context, dVar, generatedAppGlideModuleF);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f0
    @Deprecated
    public static synchronized void r(c cVar) {
        try {
            if (f137580o != null) {
                z();
            }
            f137580o = cVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC4326A("Glide.class")
    public static void s(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    @InterfaceC4326A("Glide.class")
    public static void t(@NonNull Context context, @NonNull d dVar, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC5599b> listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new C5601d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<InterfaceC5599b> it = listB.iterator();
            while (it.hasNext()) {
                InterfaceC5599b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC5599b> it2 = listB.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.f137606n = generatedAppGlideModule != null ? generatedAppGlideModule.e() : null;
        Iterator<InterfaceC5599b> it3 = listB.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, dVar);
        }
        c cVarB = dVar.b(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarB);
        f137580o = cVarB;
    }

    @f0
    public static synchronized boolean u() {
        return f137580o != null;
    }

    @f0
    public static void z() {
        synchronized (c.class) {
            try {
                if (f137580o != null) {
                    f137580o.j().getApplicationContext().unregisterComponentCallbacks(f137580o);
                    f137580o.f137582a.m();
                }
                f137580o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(int i10) {
        o.b();
        synchronized (this.f137589h) {
            try {
                Iterator<k> it = this.f137589h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f137584c.a(i10);
        this.f137583b.a(i10);
        this.f137586e.a(i10);
    }

    public void C(k kVar) {
        synchronized (this.f137589h) {
            try {
                if (!this.f137589h.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f137589h.remove(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        o.a();
        this.f137582a.e();
    }

    public void c() {
        o.b();
        this.f137584c.b();
        this.f137583b.b();
        this.f137586e.b();
    }

    @NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
        return this.f137586e;
    }

    @NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
        return this.f137583b;
    }

    public s3.c i() {
        return this.f137588g;
    }

    @NonNull
    public Context j() {
        return this.f137585d.getBaseContext();
    }

    @NonNull
    public e k() {
        return this.f137585d;
    }

    @NonNull
    public Registry n() {
        return this.f137585d.i();
    }

    @NonNull
    public p o() {
        return this.f137587f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        B(i10);
    }

    public synchronized void v(@NonNull PreFillType.Builder... builderArr) {
        try {
            if (this.f137592k == null) {
                this.f137592k = new com.bumptech.glide.load.engine.prefill.a(this.f137584c, this.f137583b, (DecodeFormat) this.f137590i.build().f140049q.c(v.f139957g));
            }
            this.f137592k.c(builderArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void w(k kVar) {
        synchronized (this.f137589h) {
            try {
                if (this.f137589h.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f137589h.add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean x(@NonNull v3.p<?> pVar) {
        synchronized (this.f137589h) {
            try {
                Iterator<k> it = this.f137589h.iterator();
                while (it.hasNext()) {
                    if (it.next().a0(pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public MemoryCategory y(@NonNull MemoryCategory memoryCategory) {
        o.b();
        this.f137584c.c(memoryCategory.getMultiplier());
        this.f137583b.c(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f137591j;
        this.f137591j = memoryCategory;
        return memoryCategory2;
    }
}
