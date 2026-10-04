package com.bumptech.glide;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GlideExperiments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f137560a;

    public static final class Builder {
        private final Map<Class<?>, a> experiments = new HashMap();

        public Builder add(a aVar) {
            this.experiments.put(aVar.getClass(), aVar);
            return this;
        }

        public GlideExperiments build() {
            return new GlideExperiments(this);
        }

        public Builder update(a aVar, boolean z10) {
            if (z10) {
                add(aVar);
                return this;
            }
            this.experiments.remove(aVar.getClass());
            return this;
        }
    }

    public interface a {
    }

    public GlideExperiments(Builder builder) {
        this.f137560a = Collections.unmodifiableMap(new HashMap(builder.experiments));
    }

    @Nullable
    public <T extends a> T a(Class<T> cls) {
        return (T) this.f137560a.get(cls);
    }

    public boolean b(Class<? extends a> cls) {
        return this.f137560a.containsKey(cls);
    }
}
