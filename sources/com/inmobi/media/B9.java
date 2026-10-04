package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class B9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Picasso f151791b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B9 f151790a = new B9();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f151792c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f151793d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A9 f151794e = new A9();

    public static final /* synthetic */ String d() {
        return "B9";
    }

    public static final WeakReference a(B9 b92, Context context) {
        b92.getClass();
        int size = f151793d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = f151793d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
            if (context2 != null && context2.equals(context)) {
                return (WeakReference) arrayList.get(i10);
            }
        }
        return null;
    }

    @NotNull
    public final Picasso a(@NotNull Context context) {
        WeakReference weakReference;
        Picasso picassoBuild;
        kotlin.jvm.internal.G.p(context, "context");
        synchronized (f151792c) {
            try {
                int size = f151793d.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = f151793d;
                    Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
                    if (context2 != null && context2.equals(context)) {
                        weakReference = (WeakReference) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (weakReference == null) {
                    f151793d.add(new WeakReference(context));
                }
                picassoBuild = f151791b;
                if (picassoBuild == null) {
                    picassoBuild = new Picasso.Builder(context).build();
                    f151791b = picassoBuild;
                    C3657nb.a(context, f151794e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kotlin.jvm.internal.G.o(picassoBuild, "synchronized(...)");
        return picassoBuild;
    }

    @Nullable
    public final Object a(@NotNull InvocationHandler connectionCallbackHandler) {
        kotlin.jvm.internal.G.p(connectionCallbackHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, connectionCallbackHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
