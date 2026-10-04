package pb;

import android.content.Context;
import android.util.Log;
import com.prism.remoteconfig.RepositoryFactory;
import com.prism.remoteconfig.RepositoryWrapper;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: pb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5404d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f226382c = "d";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C5404d f226383d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RepositoryWrapper f226384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<Runnable> f226385b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: pb.d$a */
    public class a implements InterfaceC5401a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f226386a;

        public a(c cVar) {
            this.f226386a = cVar;
        }

        @Override // pb.InterfaceC5401a
        public void a() {
            C5404d.this.h();
            c cVar = this.f226386a;
            if (cVar != null) {
                cVar.onComplete();
            }
        }

        @Override // pb.InterfaceC5401a
        public void onFailed(String str) {
            C5404d.this.h();
            c cVar = this.f226386a;
            if (cVar != null) {
                cVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: pb.d$b */
    public class b implements InterfaceC5401a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f226388a;

        public b(c cVar) {
            this.f226388a = cVar;
        }

        @Override // pb.InterfaceC5401a
        public void a() {
            C5404d.this.h();
            c cVar = this.f226388a;
            if (cVar != null) {
                cVar.onComplete();
            }
        }

        @Override // pb.InterfaceC5401a
        public void onFailed(String str) {
            C5404d.this.h();
            c cVar = this.f226388a;
            if (cVar != null) {
                cVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: pb.d$c */
    public interface c {
        void onComplete();
    }

    public static C5404d f() {
        if (f226383d == null) {
            synchronized (C5404d.class) {
                try {
                    if (f226383d == null) {
                        f226383d = new C5404d();
                    }
                } finally {
                }
            }
        }
        return f226383d;
    }

    public void b(Runnable runnable) {
        this.f226385b.addIfAbsent(runnable);
    }

    public InterfaceC5402b c() {
        return this.f226384a;
    }

    public final InterfaceC5402b d() {
        try {
            Method method = RepositoryFactory.class.getMethod("getRemoteConfig", null);
            Log.d(f226382c, "create repository succ");
            return (InterfaceC5402b) method.invoke(null, null);
        } catch (Exception e10) {
            Log.d(f226382c, "createRepository exception; ", e10);
            return null;
        }
    }

    public void e(Context context, c cVar) {
        synchronized (C5404d.class) {
            try {
                if (this.f226384a != null) {
                    if (cVar != null) {
                        cVar.onComplete();
                    }
                } else {
                    RepositoryWrapper repositoryWrapper = new RepositoryWrapper(d());
                    this.f226384a = repositoryWrapper;
                    repositoryWrapper.g(context, new a(cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g() {
        return this.f226384a != null;
    }

    public final void h() {
        Iterator<Runnable> it = this.f226385b.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                Log.w(f226382c, "Config listener failed", e10);
            }
        }
    }

    public void i(Context context, c cVar, long j10) {
        synchronized (C5404d.class) {
            try {
                RepositoryWrapper repositoryWrapper = this.f226384a;
                if (repositoryWrapper == null) {
                    e(context, cVar);
                } else {
                    repositoryWrapper.k(context, new b(cVar), j10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(Runnable runnable) {
        this.f226385b.remove(runnable);
    }
}
