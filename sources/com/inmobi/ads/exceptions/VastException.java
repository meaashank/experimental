package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class VastException extends Exception {
    private final int mVastErrorCode;
    private short telemetryErrorCode;

    public VastException(int i10) {
        this.mVastErrorCode = i10;
    }

    private final void convertVastErrorToTelemetryErrorCode() {
        short s10;
        int i10 = this.mVastErrorCode;
        if (i10 == 100) {
            s10 = 59;
        } else if (i10 == 101) {
            s10 = 69;
        } else if (i10 == 201) {
            s10 = 71;
        } else if (i10 == 405) {
            s10 = 66;
        } else if (i10 == 900) {
            s10 = 70;
        } else if (i10 == 600) {
            s10 = 61;
        } else if (i10 == 601) {
            s10 = 23;
        } else if (i10 == 603) {
            s10 = 60;
        } else if (i10 != 604) {
            switch (i10) {
                case 300:
                    s10 = 63;
                    break;
                case 301:
                    s10 = 72;
                    break;
                case 302:
                    s10 = 73;
                    break;
                case 303:
                    s10 = 74;
                    break;
                default:
                    switch (i10) {
                        case 400:
                            s10 = 62;
                            break;
                        case 401:
                            s10 = 64;
                            break;
                        case 402:
                            s10 = 65;
                            break;
                        case 403:
                            s10 = 68;
                            break;
                        default:
                            s10 = 0;
                            break;
                    }
                    break;
            }
        } else {
            s10 = 67;
        }
        this.telemetryErrorCode = s10;
    }

    public static /* synthetic */ void getTelemetryErrorCode$annotations() {
    }

    public final short getTelemetryErrorCode() {
        convertVastErrorToTelemetryErrorCode();
        return this.telemetryErrorCode;
    }
}
