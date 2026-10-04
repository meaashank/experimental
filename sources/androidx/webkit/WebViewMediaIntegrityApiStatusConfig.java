package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewMediaIntegrityApiStatusConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f120047c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f120048d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120049e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f120051b;

    public static final class Builder {
        private final int mDefaultStatus;
        private Map<String, Integer> mOverrideRules = new HashMap();

        public Builder(int i10) {
            this.mDefaultStatus = i10;
        }

        @NonNull
        public Builder addOverrideRule(@NonNull String str, int i10) {
            this.mOverrideRules.put(str, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public WebViewMediaIntegrityApiStatusConfig build() {
            return new WebViewMediaIntegrityApiStatusConfig(this);
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setOverrideRules(@NonNull Map<String, Integer> map) {
            this.mOverrideRules = map;
            return this;
        }
    }

    public WebViewMediaIntegrityApiStatusConfig(@NonNull Builder builder) {
        this.f120050a = builder.mDefaultStatus;
        this.f120051b = builder.mOverrideRules;
    }

    public int a() {
        return this.f120050a;
    }

    @NonNull
    public Map<String, Integer> b() {
        return this.f120051b;
    }
}
