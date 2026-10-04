package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* JADX INFO: loaded from: classes5.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f160094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f160095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f160096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f160097d;

    public interface a {
        void a(b0 b0Var);
    }

    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, b.a aVar) {
        this.f160097d = false;
        this.f160094a = t10;
        this.f160095b = aVar;
        this.f160096c = null;
    }

    public static <T> v<T> a(T t10, b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f160096c == null;
    }

    private v(b0 b0Var) {
        this.f160097d = false;
        this.f160094a = null;
        this.f160095b = null;
        this.f160096c = b0Var;
    }
}
