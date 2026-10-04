package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes3.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f151129id;

    DeliveryMechanism(int i10) {
        this.f151129id = i10;
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f151129id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f151129id);
    }
}
