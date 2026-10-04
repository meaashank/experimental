package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3787x2 extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3787x2 f153515a = new C3787x2();

    public C3787x2() {
        super(1);
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        if (contentValues.getAsString("config_value") != null) {
            return contentValues.getAsLong("update_ts");
        }
        return null;
    }
}
