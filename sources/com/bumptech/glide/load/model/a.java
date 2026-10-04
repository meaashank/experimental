package com.bumptech.glide.load.model;

import com.bumptech.glide.load.model.LazyHeaders;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final a f139806a = new C0369a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f139807b = new LazyHeaders.Builder().build();

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public class C0369a implements a {
        @Override // com.bumptech.glide.load.model.a
        public Map<String, String> getHeaders() {
            return Collections.EMPTY_MAP;
        }
    }

    Map<String, String> getHeaders();
}
