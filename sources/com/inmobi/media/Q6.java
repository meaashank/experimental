package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.Q6;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class Q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f152388a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f152389b = Executors.newSingleThreadExecutor(new V4("MultiEventBus"));

    public static final void a(P1 event, Q6 this$0) {
        kotlin.jvm.internal.G.p(event, "$event");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.a(event);
    }

    public final void b(final P1 event) {
        kotlin.jvm.internal.G.p(event, "event");
        try {
            this.f152389b.execute(new Runnable() { // from class: F5.v0
                @Override // java.lang.Runnable
                public final void run() {
                    Q6.a(event, this);
                }
            });
        } catch (InternalError unused) {
            a(event);
        }
    }

    public final void a(int[] eventIds, ed.l subscriber) {
        kotlin.jvm.internal.G.p(eventIds, "eventIds");
        kotlin.jvm.internal.G.p(subscriber, "subscriber");
        this.f152388a.put(new P6(eventIds), new WeakReference(subscriber));
    }

    public final void a(ed.l subscriber) {
        kotlin.jvm.internal.G.p(subscriber, "subscriber");
        Iterator it = this.f152388a.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.G.g(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(P1 p12) {
        ed.l lVar;
        Set<Map.Entry> setEntrySet = this.f152388a.entrySet();
        kotlin.jvm.internal.G.o(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f152388a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f152388a.entrySet();
        kotlin.jvm.internal.G.o(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            kotlin.jvm.internal.G.m(entry2);
            ed.l lVar2 = (ed.l) entry2.getKey();
            WeakReference weakReference = (WeakReference) entry2.getValue();
            try {
                if (((Boolean) lVar2.invoke(p12)).booleanValue() && (lVar = (ed.l) weakReference.get()) != null) {
                    lVar.invoke(p12);
                }
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }
}
