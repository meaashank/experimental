package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class F9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F9 f151932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F9 f151933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F9[] f151934d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151935a;

    static {
        F9 f92 = new F9(0, 0, "HIGHEST");
        f151932b = f92;
        F9 f93 = new F9(1, 1, "HIGH");
        F9 f94 = new F9(2, 2, "MEDIUM");
        f151933c = f94;
        F9[] f9Arr = {f92, f93, f94, new F9(3, 3, "LOW"), new F9(4, 4, "LOWEST")};
        f151934d = f9Arr;
        kotlin.enums.c.c(f9Arr);
    }

    public F9(int i10, int i11, String str) {
        this.f151935a = i11;
    }

    public static F9 valueOf(String str) {
        return (F9) Enum.valueOf(F9.class, str);
    }

    public static F9[] values() {
        return (F9[]) f151934d.clone();
    }
}
