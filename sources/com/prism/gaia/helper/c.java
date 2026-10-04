package com.prism.gaia.helper;

import U6.b;
import android.os.Build;
import androidx.annotation.NonNull;
import com.prism.commons.utils.n0;
import com.prism.gaia.naked.metadata.java.lang.ThreadGroupCAG;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164944a = "asdf-".concat(c.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f164945b;

    public class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f164946a;

        public a(g gVar) {
            this.f164946a = gVar;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            g gVar = this.f164946a;
            if (gVar != null ? gVar.a(thread, th) : false) {
                return;
            }
            c.f164945b.uncaughtException(thread, th);
        }
    }

    public static class b extends ThreadGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f164947a;

        public b(ThreadGroup threadGroup, g gVar) {
            super(threadGroup, b.d.f68639b);
            this.f164947a = gVar;
        }

        @Override // java.lang.ThreadGroup, java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            this.f164947a.a(thread, th);
        }
    }

    public static void b(g gVar) {
        try {
            if (f164945b == null) {
                f164945b = Thread.getDefaultUncaughtExceptionHandler();
            }
            ThreadGroup threadGroupC = n0.c();
            b bVar = new b(threadGroupC, gVar);
            int i10 = 0;
            if (Build.VERSION.SDK_INT < 24) {
                List<ThreadGroup> list = ThreadGroupCAG._M23.groups().get(threadGroupC);
                synchronized (list) {
                    try {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.remove(bVar);
                        ThreadGroupCAG._M23.groups().set(bVar, arrayList);
                        list.clear();
                        list.add(bVar);
                        ThreadGroupCAG._M23.groups().set(threadGroupC, list);
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ThreadGroupCAG._M23.parent().set((ThreadGroup) obj, bVar);
                        }
                    } finally {
                    }
                }
            } else {
                ThreadGroup[] threadGroupArr = ThreadGroupCAG.N24.groups().get(threadGroupC);
                synchronized (threadGroupArr) {
                    try {
                        ThreadGroup[] threadGroupArr2 = (ThreadGroup[]) threadGroupArr.clone();
                        ThreadGroupCAG.N24.groups().set(bVar, threadGroupArr2);
                        ThreadGroupCAG.N24.groups().set(threadGroupC, new ThreadGroup[]{bVar});
                        while (i10 < threadGroupArr.length) {
                            ThreadGroup threadGroup = threadGroupArr2[i10];
                            if (threadGroup == bVar) {
                                threadGroupArr2[i10] = null;
                            } else if (threadGroup != null) {
                                ThreadGroupCAG.N24.parent().set(threadGroupArr2[i10], bVar);
                            }
                            i10++;
                        }
                        ThreadGroupCAG.N24.ngroups().set(threadGroupC, 1);
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
            C5705o.c().a(th, "SETUP_UNCAUGHT_HANDLER", null);
        }
        try {
            Thread.setDefaultUncaughtExceptionHandler(new a(gVar));
        } catch (Throwable th2) {
            th2.getMessage();
            C5705o.c().a(th2, "SETUP_UNCAUGHT_HANDLER", null);
        }
    }
}
