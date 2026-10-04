package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f120259c = i.f("DelegatingWkrFctry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<p> f120260b = new CopyOnWriteArrayList();

    @Override // androidx.work.p
    @Nullable
    public final ListenableWorker a(@NonNull Context appContext, @NonNull String workerClassName, @NonNull WorkerParameters workerParameters) {
        Iterator<p> it = this.f120260b.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerA = it.next().a(appContext, workerClassName, workerParameters);
                if (listenableWorkerA != null) {
                    return listenableWorkerA;
                }
            } catch (Throwable th) {
                i.c().b(f120259c, String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }

    public final void d(@NonNull p workerFactory) {
        this.f120260b.add(workerFactory);
    }

    @NonNull
    @f0
    public List<p> e() {
        return this.f120260b;
    }
}
