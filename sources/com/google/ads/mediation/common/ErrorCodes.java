package com.google.ads.mediation.common;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCodes {

    @NotNull
    public static final String COMMON_MEDIATION_ERROR_DOMAIN = "com.google.ads.mediation.common";
    public static final int ERROR_CODE_AGE_RESTRICTED = 132;
    public static final int ERROR_CODE_INVALID_ACCOUNT_KEY = 130;
    public static final int ERROR_CODE_INVALID_APP_KEY = 131;

    @NotNull
    public static final ErrorCodes INSTANCE = new ErrorCodes();

    private ErrorCodes() {
    }
}
