package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X8 f151911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f151912b;

    public F(X8 mResponse) {
        kotlin.jvm.internal.G.p(mResponse, "mResponse");
        this.f151911a = mResponse;
        T8 t82 = mResponse.f152598c;
        if (t82 != null) {
            J3 j32 = t82.f152457a;
            switch (j32 == null ? -1 : E.f151857a[j32.ordinal()]) {
                case 1:
                    this.f151912b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    this.f151912b = inMobiAdRequestStatus;
                    T8 t83 = mResponse.f152598c;
                    String str = t83 != null ? t83.f152458b : null;
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                    }
                    break;
                case 3:
                    this.f151912b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.f151912b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    this.f151912b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    this.f151912b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
    }
}
