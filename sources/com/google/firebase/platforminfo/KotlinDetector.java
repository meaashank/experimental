package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import kotlin.D;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return D.f217446g.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
