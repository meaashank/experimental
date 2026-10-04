package com.inmobi.media;

import android.os.Bundle;
import v.C5668b;

/* JADX INFO: loaded from: classes5.dex */
public final class W2 extends C5668b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X2 f152541a;

    public W2(X2 x22) {
        this.f152541a = x22;
    }

    @Override // v.C5668b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        Q1 q12;
        U2 u22 = this.f152541a.f152583c;
        if (u22 != null) {
            U1 u12 = (U1) u22;
            Y2 y22 = u12.f152479h;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && y22.f152616d == null) {
                            if (y22.f152617e == 4) {
                                y22.f152616d = Boolean.TRUE;
                            } else {
                                y22.f152616d = Boolean.FALSE;
                            }
                            if (kotlin.jvm.internal.G.g(y22.f152616d, Boolean.TRUE)) {
                                Q1 q13 = y22.f152613a;
                                if (q13 != null) {
                                    q13.a(N5.f152292i, y22.f152614b, (Integer) 8003);
                                }
                                Q1 q14 = y22.f152613a;
                                if (q14 != null) {
                                    q14.c();
                                }
                            } else {
                                Q1 q15 = y22.f152613a;
                                if (q15 != null) {
                                    q15.a(N5.f152293j, y22.f152614b, (Integer) 8005);
                                }
                            }
                        }
                    } else if (y22.f152616d == null) {
                        y22.f152616d = Boolean.FALSE;
                        Q1 q16 = y22.f152613a;
                        if (q16 != null) {
                            q16.a(N5.f152293j, y22.f152614b, (Integer) 8004);
                        }
                    }
                } else if (y22.f152616d == null) {
                    y22.f152616d = Boolean.TRUE;
                    Q1 q17 = y22.f152613a;
                    if (q17 != null) {
                        q17.a(N5.f152292i, y22.f152614b, (Integer) null);
                    }
                    Q1 q18 = y22.f152613a;
                    if (q18 != null) {
                        q18.c();
                    }
                }
            } else if (!y22.f152615c) {
                y22.f152615c = true;
                Q1 q19 = y22.f152613a;
                if (q19 != null) {
                    q19.a(N5.f152291h, y22.f152614b, (Integer) null);
                }
            }
            y22.f152617e = i10;
            if (i10 != 5) {
                if (i10 == 6 && (q12 = u12.f152473b) != null) {
                    q12.a();
                    return;
                }
                return;
            }
            Q1 q110 = u12.f152473b;
            if (q110 != null) {
                q110.b();
            }
        }
    }
}
