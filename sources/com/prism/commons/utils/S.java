package com.prism.commons.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class S<T> implements x0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f162050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f162051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f162052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f162053d;

    public static class a extends S<Boolean> {
        public a(Context context, V v10, String str, Boolean bool) {
            super(context, v10, str, bool);
        }

        @Override // com.prism.commons.utils.v0
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean read() {
            return Boolean.valueOf(this.f162052c.c(this.f162051b, this.f162050a, ((Boolean) this.f162053d).booleanValue()));
        }

        @Override // com.prism.commons.utils.z0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            this.f162052c.j(this.f162051b, this.f162050a, bool.booleanValue());
        }
    }

    public static class b extends S<Integer> {
        public b(Context context, V v10, String str, Integer num) {
            super(context, v10, str, num);
        }

        @Override // com.prism.commons.utils.v0
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer read() {
            return Integer.valueOf(this.f162052c.d(this.f162051b, this.f162050a, ((Integer) this.f162053d).intValue()));
        }

        @Override // com.prism.commons.utils.z0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            this.f162052c.k(this.f162051b, this.f162050a, num.intValue());
        }
    }

    public static class c extends S<Long> {
        public c(Context context, V v10, String str, Long l10) {
            super(context, v10, str, l10);
        }

        @Override // com.prism.commons.utils.v0
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long read() {
            return Long.valueOf(this.f162052c.e(this.f162051b, this.f162050a, ((Long) this.f162053d).longValue()));
        }

        @Override // com.prism.commons.utils.z0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(Long l10) {
            this.f162052c.l(this.f162051b, this.f162050a, l10.longValue());
        }
    }

    public static class d extends S<String> {
        public d(Context context, V v10, String str, String str2) {
            super(context, v10, str, str2);
        }

        @Override // com.prism.commons.utils.v0
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String read() {
            return this.f162052c.g(this.f162051b, this.f162050a, (String) this.f162053d);
        }

        @Override // com.prism.commons.utils.z0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f162052c.m(this.f162051b, this.f162050a, str);
        }

        public d(Context context, String str, String str2) {
            super(context, str, str2);
        }
    }

    public S(Context context, String str, String str2) {
        this(context, W.a(str), str2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R> S<R> b(Context context, V v10, String str, R r10, Class<R> cls) {
        if (String.class.equals(cls)) {
            return new d(context, v10, str, (String) r10);
        }
        if (Boolean.class.equals(cls)) {
            return new a(context, v10, str, (Boolean) r10);
        }
        if (Integer.class.equals(cls)) {
            return new b(context, v10, str, (Integer) r10);
        }
        if (Long.class.equals(cls)) {
            return new c(context, v10, str, (Long) r10);
        }
        throw new IllegalStateException("Unsupported PreferenceReaderWriter type:" + cls);
    }

    public S(Context context, V v10, String str, T t10) {
        this.f162050a = str;
        this.f162051b = context;
        this.f162052c = v10;
        this.f162053d = t10;
    }
}
