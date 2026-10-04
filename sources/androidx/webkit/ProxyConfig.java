package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyConfig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f119996d = "http";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f119997e = "https";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f119998f = "*";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f119999g = "direct://";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f120000h = "<local>";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f120001i = "<-loopback>";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f120002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f120003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120004c;

    public static final class Builder {
        private final List<String> mBypassRules;
        private final List<a> mProxyRules;
        private boolean mReverseBypass;

        public Builder() {
            this.mReverseBypass = false;
            this.mProxyRules = new ArrayList();
            this.mBypassRules = new ArrayList();
        }

        @NonNull
        private List<String> bypassRules() {
            return this.mBypassRules;
        }

        @NonNull
        private List<a> proxyRules() {
            return this.mProxyRules;
        }

        private boolean reverseBypass() {
            return this.mReverseBypass;
        }

        @NonNull
        public Builder addBypassRule(@NonNull String str) {
            this.mBypassRules.add(str);
            return this;
        }

        @NonNull
        public Builder addDirect(@NonNull String str) {
            this.mProxyRules.add(new a(str, ProxyConfig.f119999g));
            return this;
        }

        @NonNull
        public Builder addProxyRule(@NonNull String str) {
            this.mProxyRules.add(new a(str));
            return this;
        }

        @NonNull
        public ProxyConfig build() {
            return new ProxyConfig(proxyRules(), bypassRules(), reverseBypass());
        }

        @NonNull
        public Builder bypassSimpleHostnames() {
            return addBypassRule(ProxyConfig.f120000h);
        }

        @NonNull
        public Builder removeImplicitRules() {
            return addBypassRule(ProxyConfig.f120001i);
        }

        @NonNull
        public Builder setReverseBypassEnabled(boolean z10) {
            this.mReverseBypass = z10;
            return this;
        }

        @NonNull
        public Builder addDirect() {
            return addDirect("*");
        }

        @NonNull
        public Builder addProxyRule(@NonNull String str, @NonNull String str2) {
            this.mProxyRules.add(new a(str2, str));
            return this;
        }

        public Builder(@NonNull ProxyConfig proxyConfig) {
            this.mReverseBypass = false;
            this.mProxyRules = Collections.unmodifiableList(proxyConfig.f120002a);
            this.mBypassRules = Collections.unmodifiableList(proxyConfig.f120003b);
            this.mReverseBypass = proxyConfig.f120004c;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ProxyConfig(@NonNull List<a> list, @NonNull List<String> list2, boolean z10) {
        this.f120002a = list;
        this.f120003b = list2;
        this.f120004c = z10;
    }

    @NonNull
    public List<String> a() {
        return Collections.unmodifiableList(this.f120003b);
    }

    @NonNull
    public List<a> b() {
        return Collections.unmodifiableList(this.f120002a);
    }

    public boolean c() {
        return this.f120004c;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f120005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f120006b;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public a(@NonNull String str, @NonNull String str2) {
            this.f120005a = str;
            this.f120006b = str2;
        }

        @NonNull
        public String a() {
            return this.f120005a;
        }

        @NonNull
        public String b() {
            return this.f120006b;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public a(@NonNull String str) {
            this("*", str);
        }
    }
}
