package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: loaded from: classes5.dex */
public final class W implements H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3464a0 f152534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f152535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3824zb f152536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152537d;

    public W(C3464a0 c3464a0, boolean z10, C3824zb c3824zb, String str) {
        this.f152534a = c3464a0;
        this.f152535b = z10;
        this.f152536c = c3824zb;
        this.f152537d = str;
    }

    @Override // com.inmobi.media.H9
    public final void a(Object obj) {
        String result = (String) obj;
        kotlin.jvm.internal.G.p(result, "result");
        C3464a0 c3464a0 = this.f152534a;
        StringBuilder sbA = androidx.activity.result.i.a("file saved - ", result, " , isReporting - ");
        sbA.append(this.f152535b);
        c3464a0.a(sbA.toString());
        C3464a0 c3464a02 = this.f152534a;
        C3824zb process = this.f152536c;
        String beacon = this.f152537d;
        boolean z10 = this.f152535b;
        c3464a02.getClass();
        kotlin.jvm.internal.G.p(process, "process");
        kotlin.jvm.internal.G.p(beacon, "beacon");
        kotlin.L0 l02 = null;
        if (z10) {
            c3464a02.a(new AdQualityResult(result, null, beacon, c3464a02.f152672k.toString()), false);
            return;
        }
        c3464a02.f152667f.remove(process);
        AdQualityResult adQualityResult = c3464a02.f152670i;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(result);
            l02 = kotlin.L0.f217464a;
        }
        if (l02 == null) {
            c3464a02.f152670i = new AdQualityResult(result, null, beacon, null, 8, null);
        }
        c3464a02.a("file is saved. result - " + c3464a02.f152670i);
        c3464a02.a(true);
    }

    @Override // com.inmobi.media.H9
    public final void onError(Exception exc) {
        C3464a0 c3464a0 = this.f152534a;
        C3824zb process = this.f152536c;
        c3464a0.getClass();
        kotlin.jvm.internal.G.p(process, "process");
        c3464a0.a(exc, "error in running process - ".concat("zb"));
        c3464a0.f152667f.remove(process);
        c3464a0.a(true);
    }
}
