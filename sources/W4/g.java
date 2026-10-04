package W4;

import android.content.Context;
import com.prism.lib.pfs.file.PrivateFile;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f76627d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, WeakReference<h>> f76628a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<h, String> f76629b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, Integer> f76630c = new ConcurrentHashMap();

    public static g b() {
        if (f76627d == null) {
            synchronized (g.class) {
                try {
                    if (f76627d == null) {
                        f76627d = new g();
                    }
                } finally {
                }
            }
        }
        return f76627d;
    }

    public final int a(Context context, PrivateFile privateFile) {
        String relativePath = privateFile.getRelativePath();
        Integer num = this.f76630c.get(relativePath);
        if (num == null) {
            num = a.c().d(context, privateFile) ? 2 : 0;
            this.f76630c.put(relativePath, num);
        }
        return num.intValue();
    }

    public final void c(Context context, int i10) {
        Iterator<String> it = this.f76630c.keySet().iterator();
        while (it.hasNext()) {
            f(context, it.next(), i10);
        }
    }

    public void d(Context context) {
        c(context, 0);
    }

    public void e(Context context, PrivateFile privateFile, int i10) {
        f(context, privateFile.getRelativePath(), i10);
    }

    public final void f(Context context, String str, int i10) {
        this.f76630c.put(str, Integer.valueOf(i10));
        WeakReference<h> weakReference = this.f76628a.get(str);
        if (weakReference != null) {
            h hVar = weakReference.get();
            if (hVar != null) {
                hVar.a(i10);
            } else {
                this.f76628a.remove(str);
            }
        }
    }

    public void g(Context context, PrivateFile privateFile, h hVar) {
        String str = this.f76629b.get(hVar);
        if (str != null) {
            this.f76628a.remove(str);
        }
        String relativePath = privateFile.getRelativePath();
        this.f76628a.put(relativePath, new WeakReference<>(hVar));
        this.f76629b.put(hVar, relativePath);
        hVar.a(a(context, privateFile));
    }
}
