package com.inmobi.media;

import F5.RunnableC1124w0;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f152408a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f152409b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q4 f152410c = new Q4();

    public static void a(C3638m6 finishListener) {
        kotlin.jvm.internal.G.p(finishListener, "finishListener");
        if (!f152409b.getAndSet(true)) {
            b();
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f152408a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f152408a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static void b() {
        Cc.f151826a.execute(new RunnableC1124w0());
    }

    public static final void c() {
        C3554g6 c3554g6D = AbstractC3531eb.d();
        Q4 listener = f152410c;
        c3554g6D.getClass();
        kotlin.jvm.internal.G.p(listener, "listener");
        c3554g6D.f152936b = listener;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3694q6.f153295a;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C3530ea c3530ea = (C3530ea) ((WeakReference) it.next()).get();
                if (c3530ea != null) {
                    arrayList2.add(c3530ea);
                }
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = AbstractC3694q6.f153295a;
        arrayList2.toString();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(new Wa((C3530ea) obj));
        }
        return arrayList;
    }
}
