package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b<String>>> f155118a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f155119b = new ConcurrentHashMap<>();

    public void a(String str, b<String> bVar) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ((CopyOnWriteArrayList) this.f155118a.computeIfAbsent(str, new O5.b())).addIfAbsent(bVar);
                return;
            }
            CopyOnWriteArrayList<b<String>> copyOnWriteArrayList = this.f155118a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f155118a.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.addIfAbsent(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public boolean d() {
        return this.f155119b.isEmpty();
    }

    @NonNull
    public Set<String> e() {
        return this.f155119b.keySet();
    }

    public int f() {
        return this.f155119b.size();
    }

    @NonNull
    public Collection<Object> g() {
        return this.f155119b.values();
    }

    @NonNull
    public String toString() {
        return this.f155119b.toString();
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public Map<String, CopyOnWriteArrayList<b<String>>> c() {
        return this.f155118a;
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.f155119b.remove(obj);
    }

    public Map<String, Object> b() {
        return this.f155119b;
    }

    public void b(Map<String, CopyOnWriteArrayList<b<String>>> map) {
        this.f155118a.clear();
        this.f155118a.putAll(map);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.f155119b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CopyOnWriteArrayList a(String str) {
        return new CopyOnWriteArrayList();
    }

    public boolean a(@Nullable Object obj) {
        return this.f155119b.containsKey(obj);
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.f155119b.entrySet();
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f155119b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f155119b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    private void a(final String str, final Object obj, String str2) {
        CopyOnWriteArrayList<b<String>> copyOnWriteArrayList;
        if (this.f155118a.containsKey(str) && (copyOnWriteArrayList = this.f155118a.get(str)) != null) {
            for (final b<String> bVar : copyOnWriteArrayList) {
                if (bVar instanceof d) {
                    View viewA = ((d) bVar).a();
                    if (viewA != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            viewA.post(new Runnable() { // from class: O5.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bVar.a(str, obj);
                                }
                            });
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
