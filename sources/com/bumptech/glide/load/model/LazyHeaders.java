package com.bumptech.glide.load.model;

import android.support.v4.media.e;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k3.i;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyHeaders implements com.bumptech.glide.load.model.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<i>> f139803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map<String, String> f139804d;

    public static final class Builder {
        private static final Map<String, List<i>> DEFAULT_HEADERS;
        private static final String DEFAULT_USER_AGENT;
        private static final String USER_AGENT_HEADER = "User-Agent";
        private boolean copyOnModify = true;
        private Map<String, List<i>> headers = DEFAULT_HEADERS;
        private boolean isUserAgentDefault = true;

        static {
            String sanitizedUserAgent = getSanitizedUserAgent();
            DEFAULT_USER_AGENT = sanitizedUserAgent;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(sanitizedUserAgent)) {
                map.put("User-Agent", Collections.singletonList(new a(sanitizedUserAgent)));
            }
            DEFAULT_HEADERS = Collections.unmodifiableMap(map);
        }

        private Map<String, List<i>> copyHeaders() {
            HashMap map = new HashMap(this.headers.size());
            for (Map.Entry<String, List<i>> entry : this.headers.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void copyIfNecessary() {
            if (this.copyOnModify) {
                this.copyOnModify = false;
                this.headers = copyHeaders();
            }
        }

        private List<i> getFactories(String str) {
            List<i> list = this.headers.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.headers.put(str, arrayList);
            return arrayList;
        }

        @f0
        public static String getSanitizedUserAgent() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public Builder addHeader(@NonNull String str, @NonNull String str2) {
            return addHeader(str, new a(str2));
        }

        public LazyHeaders build() {
            this.copyOnModify = true;
            return new LazyHeaders(this.headers);
        }

        public Builder setHeader(@NonNull String str, @Nullable String str2) {
            return setHeader(str, str2 == null ? null : new a(str2));
        }

        public Builder addHeader(@NonNull String str, @NonNull i iVar) {
            if (this.isUserAgentDefault && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, iVar);
            }
            copyIfNecessary();
            getFactories(str).add(iVar);
            return this;
        }

        public Builder setHeader(@NonNull String str, @Nullable i iVar) {
            copyIfNecessary();
            if (iVar == null) {
                this.headers.remove(str);
            } else {
                List<i> factories = getFactories(str);
                factories.clear();
                factories.add(iVar);
            }
            if (this.isUserAgentDefault && "User-Agent".equalsIgnoreCase(str)) {
                this.isUserAgentDefault = false;
            }
            return this;
        }
    }

    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f139805a;

        public a(@NonNull String str) {
            this.f139805a = str;
        }

        @Override // k3.i
        public String a() {
            return this.f139805a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f139805a.equals(((a) obj).f139805a);
            }
            return false;
        }

        public int hashCode() {
            return this.f139805a.hashCode();
        }

        public String toString() {
            return e.a(new StringBuilder("StringHeaderFactory{value='"), this.f139805a, "'}");
        }
    }

    public LazyHeaders(Map<String, List<i>> map) {
        this.f139803c = Collections.unmodifiableMap(map);
    }

    @NonNull
    public final String a(@NonNull List<i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = list.get(i10).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    public final Map<String, String> b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f139803c.entrySet()) {
            String strA = a(entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f139803c.equals(((LazyHeaders) obj).f139803c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.a
    public Map<String, String> getHeaders() {
        if (this.f139804d == null) {
            synchronized (this) {
                try {
                    if (this.f139804d == null) {
                        this.f139804d = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f139804d;
    }

    public int hashCode() {
        return this.f139803c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f139803c + '}';
    }
}
