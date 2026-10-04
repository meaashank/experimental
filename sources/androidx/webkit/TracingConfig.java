package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TracingConfig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f120007d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120008e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f120009f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f120010g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f120011h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f120012i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f120013j = 32;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f120014k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f120015l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f120016m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f120018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120019c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingConfig(int i10, @NonNull List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f120018b = arrayList;
        this.f120017a = i10;
        arrayList.addAll(list);
        this.f120019c = i11;
    }

    @NonNull
    public List<String> a() {
        return this.f120018b;
    }

    public int b() {
        return this.f120017a;
    }

    public int c() {
        return this.f120019c;
    }

    public static class Builder {
        private int mPredefinedCategories = 0;
        private final List<String> mCustomIncludedCategories = new ArrayList();
        private int mTracingMode = 1;

        @NonNull
        public Builder addCategories(@NonNull int... iArr) {
            for (int i10 : iArr) {
                this.mPredefinedCategories = i10 | this.mPredefinedCategories;
            }
            return this;
        }

        @NonNull
        public TracingConfig build() {
            return new TracingConfig(this.mPredefinedCategories, this.mCustomIncludedCategories, this.mTracingMode);
        }

        @NonNull
        public Builder setTracingMode(int i10) {
            this.mTracingMode = i10;
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull String... strArr) {
            this.mCustomIncludedCategories.addAll(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull Collection<String> collection) {
            this.mCustomIncludedCategories.addAll(collection);
            return this;
        }
    }
}
