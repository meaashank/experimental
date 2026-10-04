package com.prism.commons.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class T<T> implements y0<T, Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f162061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f162062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f162063c;

    public static class a extends T<Boolean> {
        public a(V v10, String str, Boolean bool) {
            super(v10, str, bool);
        }

        @Override // com.prism.commons.utils.w0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(Context context) {
            if (this.f162063c == null) {
                if (!this.f162062b.b(context, this.f162061a)) {
                    return null;
                }
                this.f162063c = (T) Boolean.FALSE;
            }
            return Boolean.valueOf(this.f162062b.c(context, this.f162061a, ((Boolean) this.f162063c).booleanValue()));
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Context context, Boolean bool) {
            this.f162062b.j(context, this.f162061a, bool.booleanValue());
        }
    }

    public static class b extends T<Integer> {
        public b(V v10, String str, Integer num) {
            super(v10, str, num);
        }

        @Override // com.prism.commons.utils.w0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer b(Context context) {
            if (this.f162063c == null) {
                if (!this.f162062b.b(context, this.f162061a)) {
                    return null;
                }
                this.f162063c = (T) (-1);
            }
            return Integer.valueOf(this.f162062b.d(context, this.f162061a, ((Integer) this.f162063c).intValue()));
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Context context, Integer num) {
            this.f162062b.k(context, this.f162061a, num.intValue());
        }
    }

    public static class c extends T<Long> {
        public c(V v10, String str, Long l10) {
            super(v10, str, l10);
        }

        @Override // com.prism.commons.utils.w0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long b(Context context) {
            if (this.f162063c == null) {
                if (!this.f162062b.b(context, this.f162061a)) {
                    return null;
                }
                this.f162063c = (T) (-1L);
            }
            return Long.valueOf(this.f162062b.e(context, this.f162061a, ((Long) this.f162063c).longValue()));
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Context context, Long l10) {
            this.f162062b.l(context, this.f162061a, l10.longValue());
        }
    }

    public static class d extends T<String> {
        public d(V v10, String str, String str2) {
            super(v10, str, str2);
        }

        @Override // com.prism.commons.utils.w0
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(Context context) {
            return this.f162062b.g(context, this.f162061a, (String) this.f162063c);
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Context context, String str) {
            this.f162062b.m(context, this.f162061a, str);
        }

        public d(String str, String str2) {
            super(str, str2);
        }
    }

    public static class e extends T<Set> {
        public e(V v10, String str, Set<String> set) {
            super(v10, str, set);
        }

        @Override // com.prism.commons.utils.w0
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Set b(Context context) {
            return this.f162062b.h(context, this.f162061a, (Set) this.f162063c);
        }

        @Override // com.prism.commons.utils.A0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(Context context, Set set) {
            this.f162062b.n(context, this.f162061a, set);
        }

        public e(String str, String str2) {
            super(str, str2);
        }
    }

    public T(String str, String str2) {
        this(W.a(str), str2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R> T<R> c(V v10, String str, R r10, Class<R> cls) {
        if (String.class.equals(cls)) {
            return new d(v10, str, (String) r10);
        }
        if (Boolean.class.equals(cls)) {
            return new a(v10, str, (Boolean) r10);
        }
        if (Integer.class.equals(cls)) {
            return new b(v10, str, (Integer) r10);
        }
        if (Long.class.equals(cls)) {
            return new c(v10, str, (Long) r10);
        }
        if (Set.class.equals(cls)) {
            return new e(v10, str, (Set) r10);
        }
        throw new IllegalStateException("Unsupported PreferenceReaderWriter type:" + cls);
    }

    public T(V v10, String str, T t10) {
        this.f162061a = str;
        this.f162062b = v10;
        this.f162063c = t10;
    }
}
