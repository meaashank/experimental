package androidx.compose.runtime;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1910f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99666a = 306783378;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99667b = 613566756;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99668c = -920350135;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99669d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99670e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f99671f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f99672g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f99673h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f99674i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f99675j = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Object f99676k = new Object();

    @InterfaceC4850b0
    public static final int b(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & f99668c) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
