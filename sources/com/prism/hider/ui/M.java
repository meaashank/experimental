package com.prism.hider.ui;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;
import ed.InterfaceC4376a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168049c = "JSONPreferenceValues";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, androidx.lifecycle.K<?>> f168050a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I4.h f168051b;

    public static class a<T> implements InterfaceC4376a<List<T>> {
        @Override // ed.InterfaceC4376a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<T> invoke() {
            return new ArrayList();
        }
    }

    public M(@NonNull I4.h hVar) {
        this.f168051b = hVar;
    }

    public <T> androidx.lifecycle.K<List<T>> d(@NonNull String str, @NonNull Class<T> cls) {
        return e(str, cls, new a());
    }

    public <T> androidx.lifecycle.K<List<T>> e(@NonNull final String str, @NonNull Class<T> cls, @NonNull InterfaceC4376a<List<T>> interfaceC4376a) {
        androidx.lifecycle.P p10;
        androidx.lifecycle.K<List<T>> k10 = (androidx.lifecycle.K) this.f168050a.get(str);
        if (k10 != null) {
            return k10;
        }
        synchronized (this) {
            try {
                p10 = (androidx.lifecycle.K<List<T>>) this.f168050a.get(str);
                if (p10 == null) {
                    p10 = new androidx.lifecycle.P();
                    final androidx.lifecycle.K<T> kN = this.f168051b.n(str);
                    String str2 = (String) kN.f();
                    if (str2 == null) {
                        throw new IllegalStateException("Please call this method after loaded value for " + str + " is null");
                    }
                    Gson gson = new Gson();
                    Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, 0);
                    try {
                        objArr = (Object[]) gson.fromJson(str2, (Class) objArr.getClass());
                    } catch (Throwable th) {
                        Log.e(f168049c, "json parse error:" + th);
                    }
                    List listInvoke = interfaceC4376a.invoke();
                    for (Object obj : objArr) {
                        if (obj != null) {
                            listInvoke.add(obj);
                        }
                    }
                    p10.r(listInvoke);
                    this.f168050a.put(str, p10);
                    final boolean[] zArr = {false};
                    p10.l(new androidx.lifecycle.Q() { // from class: com.prism.hider.ui.J
                        @Override // androidx.lifecycle.Q
                        public final void a(Object obj2) {
                            this.f167982a.g(zArr, kN, str, (List) obj2);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (androidx.lifecycle.K<List<T>>) p10;
    }

    public <T> androidx.lifecycle.K<T> f(@NonNull String str) {
        return null;
    }

    public final /* synthetic */ void g(boolean[] zArr, androidx.lifecycle.K k10, String str, final List list) {
        if (!zArr[0]) {
            zArr[0] = true;
            return;
        }
        String str2 = (String) C3857v.b(new C3857v.b() { // from class: com.prism.hider.ui.K
            @Override // com.prism.commons.utils.C3857v.b
            public final Object a() {
                return new Gson().toJson(list.toArray(new String[0]));
            }
        }, new L());
        if (str2.equals((String) k10.f())) {
            return;
        }
        this.f168051b.u(str, str2);
    }

    public <T> void h(@NonNull String str, @NonNull List<T> list, @NonNull Class<T> cls) {
        ((androidx.lifecycle.P) d(str, cls)).r(list);
    }
}
